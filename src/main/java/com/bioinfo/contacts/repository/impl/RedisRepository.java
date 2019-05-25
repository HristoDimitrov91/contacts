package com.bioinfo.contacts.repository.impl;

import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import com.bioinfo.contacts.entities.Inquiry;
import com.bioinfo.contacts.repository.ContactsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RedisRepository implements ContactsRepository {

    private static final String INQUIRY = "Inquiry";

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    private HashOperations<String, String, Inquiry> hashOperations;

    @PostConstruct
    private void init() {
        hashOperations = redisTemplate.opsForHash();
    }

    @Override
    public void add(Inquiry inquiry) {
        hashOperations.put(INQUIRY, inquiry.getId(), inquiry);
    }

    @Override
    public List<Inquiry> getAll() {
        return hashOperations.entries(INQUIRY).values().stream().collect(Collectors.toList());
    }

}