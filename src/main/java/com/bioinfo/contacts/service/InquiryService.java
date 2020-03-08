package com.bioinfo.contacts.service;

import java.util.List;
import java.util.Set;

import com.bioinfo.contacts.entities.Inquiry;
import com.bioinfo.contacts.rest.resources.InquiryRequest;

public interface InquiryService {

    String createInquiry(InquiryRequest request);

    void updateInquiry(Inquiry inquiry);

    List<Inquiry> getAll();

    Set<String> deleteAll();

}