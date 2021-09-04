package com.example.SystemCombatPandemic.entity.enums;


import com.example.SystemCombatPandemic.entity.Recursos;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ponto_Item {



    me("medico"),
    en("enfermeiro"),
    re("respirador"),
    to("tomografo"),
    am("ambulancia");

    private final String nome_Item;
}
