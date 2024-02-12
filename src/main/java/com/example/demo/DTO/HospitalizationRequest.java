package com.example.demo.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Data
@Getter
@Setter
public class HospitalizationRequest {
    private Timestamp date;
    private String status;
    private String codeByTerapevt;
    private String firstName;
    private String lastName;
    private String passport;
}
