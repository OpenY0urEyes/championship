package com.example.demo.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Data
@Setter
@Getter
public class PatientDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String passport;
    private Timestamp birthday;
    private String sex;
    private String adress;
    private String numberPhone;
    private String email;
    private Timestamp lastVisit;
    private Timestamp nextVisit;
    private String numberPolic;
    private Timestamp numberPolicEnd;

    public PatientDTO(Long id, String firstName, String lastName, String middleName, String passport, Timestamp birthday,
                      String sex, String adress, String numberPhone, String email, Timestamp lastVisit,
                      Timestamp nextVisit, String numberPolic, Timestamp numberPolicEnd) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.passport = passport;
        this.birthday = birthday;
        this.sex = sex;
        this.adress = adress;
        this.numberPhone = numberPhone;
        this.email = email;
        this.lastVisit = lastVisit;
        this.nextVisit = nextVisit;
        this.numberPolic = numberPolic;
        this.numberPolicEnd = numberPolicEnd;
    }
}