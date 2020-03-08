package com.bioinfo.contacts.service.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import com.bioinfo.contacts.entities.Inquiry;
import com.bioinfo.contacts.repository.ContactsRepository;
import com.bioinfo.contacts.rest.resources.InquiryRequest;
import com.bioinfo.contacts.service.InquiryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.NonNull;

@Service
public class DefaultInquiryService implements InquiryService {

    private static final @NonNull String NOT_PROCESSED = "NOT_PROCESSED";

    @Autowired
    ContactsRepository repository;

    @Override
    public String createInquiry(InquiryRequest request) {
        Inquiry inquiry = new Inquiry(UUID.randomUUID().toString(), request.getEmail(), request.getName(),
                LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME), request.getMessage(), NOT_PROCESSED);
        repository.add(inquiry);
        return inquiry.getId();
    }

    @Override
    public void updateInquiry(Inquiry inquiry) {
        repository.update(inquiry);
    }

    @Override
    public List<Inquiry> getAll() {
        return repository.getAll();
    }

    @Override
    public Set<String> deleteAll() {
        return repository.deleteAll();
    }

}