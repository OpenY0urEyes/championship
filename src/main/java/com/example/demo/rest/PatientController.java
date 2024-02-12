package com.example.demo.rest;

import com.example.demo.DTO.ChangeMedcardRequest;
import com.example.demo.DTO.HospitalizationRequest;
import com.example.demo.DTO.PatientDTO;
import com.example.demo.models.Patient;
import com.example.demo.service.hospitalizationService.HospitalizationService;
import com.example.demo.service.medcardService.ChangeMedcardService;
import com.example.demo.service.medcardService.CreateMedcardService;
import com.example.demo.service.patientService.GetAllPatientsService;
import com.example.demo.service.patientService.CreatePatientService;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
@AllArgsConstructor
public class PatientController {
    private final CreatePatientService createPatientService;
    private final GetAllPatientsService getAllPatients;



    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @PostMapping("add-patient")
    public String addPatient(@RequestBody Patient patient){
        return createPatientService.addNewPatient(patient);
    }

    @GetMapping("all-patients")
    public List<PatientDTO> getAllPatients() {
        return getAllPatients.getAllPatients();
    }




}
