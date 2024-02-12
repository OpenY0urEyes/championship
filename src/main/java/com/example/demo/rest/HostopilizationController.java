package com.example.demo.rest;

import com.example.demo.DTO.HospitalizationRequest;
import com.example.demo.service.hospitalizationService.HospitalizationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hostop")
@AllArgsConstructor
public class HostopilizationController {
    private final HospitalizationService hospitalizationService;

    @PostMapping("add-hospitalization")
    public String addHospitalisation(@RequestBody HospitalizationRequest request){
        return hospitalizationService.addHospitalization(request.getDate(),
                request.getStatus(),
                request.getCodeByTerapevt(),
                request.getFirstName(),
                request.getLastName(),
                request.getPassport());
    }

}
