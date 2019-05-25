package com.bioinfo.contacts.entities;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@Table("enquiries")
@AllArgsConstructor
public class Inquiry {

    @PrimaryKey
    private String id;
    private @NonNull String email;
    private @NonNull String name;
    @Column("insert_time")
    private @NonNull String insertTime;
    private @NonNull String message;
    private @NonNull String status;

}