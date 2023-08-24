/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fisagroup.pokemon.data.service;

import com.fisagroup.pokemon.data.model.Result;
import java.util.Optional;

/**
 *
 * @author sland
 */
public interface PokemonService {
   
    Optional<Result> getPokemonInfo(String name);
}
