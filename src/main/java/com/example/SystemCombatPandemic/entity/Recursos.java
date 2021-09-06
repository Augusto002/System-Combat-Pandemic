package com.example.SystemCombatPandemic.entity;

import com.example.SystemCombatPandemic.entity.enums.ponto_Item;
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
public class Recursos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ponto_Item nome_item;


    @Column(nullable = false)
    private int ponto_item;


    @Column(nullable = false)
    private int qtd_item;
}
