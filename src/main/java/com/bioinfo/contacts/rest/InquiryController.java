package com.bioinfo.contacts.rest;

import org.springframework.web.bind.annotation.RestController;

import com.bioinfo.contacts.rest.resources.InquiryRequest;
import com.bioinfo.contacts.service.InquiryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class InquiryController {

    @Autowired
    InquiryService inquiryService;

    @PostMapping(value="/inquiry")
    public ResponseEntity<String> postMethodName(@RequestBody InquiryRequest request) {

        String inquiryId = inquiryService.createInquiry(request);
        return new ResponseEntity<String>(inquiryId, HttpStatus.CREATED);
    }
    
}