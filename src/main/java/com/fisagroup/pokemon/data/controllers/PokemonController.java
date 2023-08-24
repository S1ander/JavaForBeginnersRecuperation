/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fisagroup.pokemon.data.controllers;

import com.fisagroup.pokemon.data.model.Result;
import com.fisagroup.pokemon.data.service.PokemonService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sland
 */
@RestController
public class PokemonController {
    
    @Autowired
    private PokemonService pokemonService;

    @GetMapping("/course/pokemon/{name}")
    public ResponseEntity<?> getPokemonInfo(@PathVariable String name) {
        Optional<Result> optionalResult = pokemonService.getPokemonInfo(name);
        if (optionalResult.isPresent()) {
            return ResponseEntity.ok(optionalResult.get());
        }
        return ResponseEntity.notFound().build();
    }

}

