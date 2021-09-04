package com.example.SystemCombatPandemic.controller;

import com.example.SystemCombatPandemic.dto.MessageResponseDTO;
import com.example.SystemCombatPandemic.entity.Hospital;
import com.example.SystemCombatPandemic.repository.HospitalRepository;
import com.example.SystemCombatPandemic.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hospital")
public class HospitalController {

    private HospitalService hospitalService;

    public HospitalController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO insertHospital(@RequestBody Hospital hospital){
    return hospitalService.insertHospital(hospital);
    }

}
