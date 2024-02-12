package com.example.demo.service.patientService;

import com.example.demo.DTO.PatientDTO;
import com.example.demo.models.Patient;
import com.example.demo.repository.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class GetAllPatientsService {

    private final PatientRepository patientRepository;

    public List<PatientDTO> getAllPatients() {
        List<Patient> patients = patientRepository.findAll();
        return patients.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private PatientDTO convertToDTO(Patient patient) {
        return new PatientDTO(
                patient.getId(),
                patient.getFirstName(),
                patient.getLastName(),
                patient.getMiddleName(),
                patient.getPassport(),
                patient.getBirthday(),
                patient.getSex(),
                patient.getAdress(),
                patient.getNumberPhone(),
                patient.getEmail(),
                patient.getLastVisit(),
                patient.getNextVisit(),
                patient.getNumberPolic(),
                patient.getNumberPolicEnd()
        );
    }
}
