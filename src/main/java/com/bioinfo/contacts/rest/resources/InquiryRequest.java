package com.bioinfo.contacts.rest.resources;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
public class InquiryRequest {

    private @NonNull String email;
    private @NonNull String name;
    private @NonNull String message;

}