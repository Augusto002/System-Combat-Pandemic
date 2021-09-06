package com.example.SystemCombatPandemic.utils;

import com.example.SystemCombatPandemic.dto.request.HospitalDTO;

import java.util.Collections;

public class HospitalUtils {

    public static HospitalDTO createFakeDTO(){
        HospitalDTO adas = HospitalDTO.builder()
                .cnpj("123456789123456")
                .endereco("adas")
             //  .localizacao(Collections.singletonList(HospitalUtils.createFakeDTO()))
                .nome("")
             //   .recursos("")
                .percentual(5)
                .build();
        return adas;
    }
}
