package com.bioinfo.contacts.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class Inquiry implements Serializable {

    private static final long serialVersionUID = 5731155967427715938L;

    private String id;
    private @NonNull String email;
    private @NonNull String name;
    private @NonNull String insertTime;
    private @NonNull String message;
    private @NonNull String status;

}