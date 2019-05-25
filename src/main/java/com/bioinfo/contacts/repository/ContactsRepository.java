package com.bioinfo.contacts.repository;

import java.util.List;
import java.util.Set;

import com.bioinfo.contacts.entities.Inquiry;

public interface ContactsRepository {

    void add(Inquiry inquiry);

    List<Inquiry> getAll();

	Set<String> deleteAll();

}