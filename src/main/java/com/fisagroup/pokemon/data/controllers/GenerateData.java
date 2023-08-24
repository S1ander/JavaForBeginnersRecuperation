/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fisagroup.pokemon.data.controllers;

import com.fisagroup.pokemon.data.model.PokemonType;
import com.fisagroup.pokemon.data.client.PokemonClientApi;
import com.fisagroup.pokemon.data.model.Pokemon;
import com.fisagroup.pokemon.data.model.Result;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * @author sland
 */
@Slf4j
public class GenerateData {

    private Pokemon pokemon;
    private PokemonClientApi pokemonClientApi;

    public GenerateData(Pokemon pokemon, PokemonClientApi pokemonClientApi) {
        this.pokemon = pokemon;
        this.pokemonClientApi = pokemonClientApi;
    }

    public Optional<Result> getInformation() {
        int valor = 10;
        if (pokemon != null)
        {

            Result.ResultBuilder resultBuilder = Result.builder();
            resultBuilder.name(pokemon.getName());
            resultBuilder.height(pokemon.getHeight() / valor);
            resultBuilder.weight(pokemon.getWeight() / valor);
            List<String> types = pokemon.getTypes().stream()
                    .map(Pokemon.Types::getName).collect(Collectors.toList());
            resultBuilder.types(types);
            resultBuilder.types(types);
            log.info(resultBuilder.toString());
            return Optional.of(resultBuilder.build());
        }
        return Optional.empty();
    }

}
