/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fisagroup.pokemon.data.client;

import com.fisagroup.pokemon.data.model.Pokemon;
import com.fisagroup.pokemon.data.model.PokemonType;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author sland
 */
@FeignClient(name = "pokemonApi", url = "https://pokeapi.co/api/v2")
public interface PokemonClientApi {

    @GetMapping("/pokemon/{pokemon}")
    Pokemon getPokemonInfo(@PathVariable String pokemon);

    @GetMapping("/type/{name}")
    PokemonType getTypeInfo(@PathVariable String name);
}
