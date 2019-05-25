package com.bioinfo.contacts.rest;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

import com.bioinfo.contacts.entities.Inquiry;
import com.bioinfo.contacts.rest.resources.InquiryRequest;
import com.bioinfo.contacts.service.InquiryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class InquiryController {

    @Autowired
    InquiryService inquiryService;

    @PostMapping(value = "/inquiry")
    public ResponseEntity<String> create(@RequestBody InquiryRequest request) {

        String inquiryId = inquiryService.createInquiry(request);
        return new ResponseEntity<>(inquiryId, HttpStatus.CREATED);
    }

    @GetMapping(value = "/enquiries")
    public ResponseEntity<List<Inquiry>> getAll() {

        List<Inquiry> inquiryId = inquiryService.getAll();
        return new ResponseEntity<>(inquiryId, HttpStatus.OK);
    }

    @DeleteMapping(value = "/enquiries")
    public ResponseEntity<Set<String>> deleteAll() {

        Set<String> inquiryId = inquiryService.deleteAll();
        return new ResponseEntity<>(inquiryId, HttpStatus.OK);
    }
}