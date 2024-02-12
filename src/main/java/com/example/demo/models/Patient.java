package com.example.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="first_name", nullable = false)
    private String firstName;
    @Column(name="last_name", nullable = false)
    private String lastName;
    @Column(name="middle_name", nullable = true)
    private String middleName;
    @Column(name="passport", nullable = false)
    private String passport;
    @Column(name="birthday", nullable = false)
    private Timestamp birthday;
    @Column(name="sex", nullable = false)
    private String sex;
    @Column(name="adress", nullable = true)
    private String adress;
    @Column(name="number_phone", nullable = false)
    private String numberPhone;
    @Column(name="email", nullable = false)
    private String email;
    @Column(name="last_visit", nullable = true)
    private Timestamp lastVisit;
    @Column(name="next_visit", nullable = true)
    private Timestamp nextVisit;
    @Column(name="number_polic", nullable = false)
    private String numberPolic;
    @Column(name="number_polic_end", nullable = false)
    private Timestamp numberPolicEnd;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "patient_id")
    private List<HospitalEvent> hospitalEventList;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "patient_id")
    private List<Hospitolzation> hospitolzationList;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "patient_id")
    private List<CodeByTerapevt> codeByTerapevtList;

    @OneToOne(mappedBy = "patient", cascade = CascadeType.ALL)
    private Medcard medcard;




}
