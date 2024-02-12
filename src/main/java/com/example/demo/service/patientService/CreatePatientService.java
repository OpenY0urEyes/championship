package com.example.demo.service.patientService;

import com.example.demo.models.Patient;
import com.example.demo.repository.PatientRepository;
import com.example.demo.service.medcardService.CreateMedcardService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CreatePatientService {
    private final PatientRepository patientRepository;
    private final CreateMedcardService createMedcardService;



    public String addNewPatient(Patient patient){
        if (patient == null ||
                patientRepository.existsByFirstName(patient.getFirstName()) &&
                      patientRepository.existsByLastName(patient.getLastName()) &&
                      patientRepository.existsByMiddleName(patient.getMiddleName())
        ){
            return "Patient or null or exists";
        }

        if (patientRepository.existsByNumberPhone(patient.getNumberPhone())){
            return "this number phone exists";
        }

        if (patientRepository.existsByEmail(patient.getEmail())){
            return "this email exists";
        }

        if (patientRepository.existsByNumberPolic(patient.getNumberPolic())){
            return "this polic exists";
        }


        patientRepository.save(patient);
        createMedcardService.createMedcard(patient);
        return "Patient added";
    }

}
