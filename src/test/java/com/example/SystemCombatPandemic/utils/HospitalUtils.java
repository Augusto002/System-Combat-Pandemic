package com.example.SystemCombatPandemic.utils;

import com.example.SystemCombatPandemic.dto.request.HospitalDTO;

public class HospitalUtils {

    public static HospitalDTO createFakeDTO(){
        return HospitalDTO.builder()
                .cnpj("")
                .id(1l)

                .build();
    }
}
