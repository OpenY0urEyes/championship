package com.example.demo.service.medcardService;

import com.example.demo.models.Medcard;
import com.example.demo.models.Patient;
import com.example.demo.repository.MedcardRepository;
import com.example.demo.repository.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@AllArgsConstructor
public class CreateMedcardService {
    private final MedcardRepository medcardRepository;

    public void createMedcard(Patient patient){
        Random random = new Random();
        String randomName = "M" + random.nextInt() * 10000;
        Medcard medcard = new Medcard();
        medcard.setNumberMedcard(randomName);
        medcard.setPatient(patient);
        medcardRepository.save(medcard);
    }


}
