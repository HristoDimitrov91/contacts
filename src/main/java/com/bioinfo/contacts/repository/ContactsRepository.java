package com.bioinfo.contacts.repository;

import com.bioinfo.contacts.entities.Inquiry;

import org.springframework.data.repository.CrudRepository;

public interface ContactsRepository extends CrudRepository<Inquiry, String> {

}