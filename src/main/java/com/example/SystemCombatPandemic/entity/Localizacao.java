package com.example.SystemCombatPandemic.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//AQUI São as minha entidades

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Localizacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String latitude;

    @Column(nullable = false)
    private String longetude;

}
