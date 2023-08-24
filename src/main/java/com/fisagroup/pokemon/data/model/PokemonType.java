/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fisagroup.pokemon.data.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class PokemonType {
    private int slot;
    private String name;
}
