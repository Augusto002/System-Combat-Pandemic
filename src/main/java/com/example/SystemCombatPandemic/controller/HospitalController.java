package com.example.SystemCombatPandemic.controller;

import com.example.SystemCombatPandemic.dto.response.MessageResponseDTO;
import com.example.SystemCombatPandemic.dto.request.HospitalDTO;
import com.example.SystemCombatPandemic.service.HospitalService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;



//Aqui é a minha classe de controller onde vou receber os protocolos HTTP

@RestController
@RequestMapping("/api/hospital")
public class HospitalController {

    private HospitalService hospitalService;

    public HospitalController(HospitalService hospitalService) {
        this.hospitalService = hospitalService;
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO insertHospital(@RequestBody @Valid HospitalDTO hospitalDTO){
    return hospitalService.insertHospital(hospitalDTO);
    }

    @GetMapping
    public List<HospitalDTO> listAll(){
        return hospitalService.listAll();
    }


}
