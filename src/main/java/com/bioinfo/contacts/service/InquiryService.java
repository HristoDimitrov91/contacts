package com.bioinfo.contacts.service;

import java.util.List;

import com.bioinfo.contacts.entities.Inquiry;
import com.bioinfo.contacts.rest.resources.InquiryRequest;

public interface InquiryService {

	String createInquiry(InquiryRequest request);

	List<Inquiry> getAll();

}