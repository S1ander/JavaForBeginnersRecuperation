/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fisagroup.pokemon.data.service.impl;

import com.fisagroup.pokemon.data.client.PokemonClientApi;
import com.fisagroup.pokemon.data.controllers.GenerateData;
import com.fisagroup.pokemon.data.model.Pokemon;
import com.fisagroup.pokemon.data.model.Result;
import com.fisagroup.pokemon.data.service.PokemonService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sland
 */
@Service
public class PokemonServiceImpl implements PokemonService {

    @Autowired
    private PokemonClientApi pokemonClientApi;

    @Override
    public Optional<Result> getPokemonInfo(String name) {
        Pokemon pokemonInfo = pokemonClientApi.getPokemonInfo(name);
        GenerateData generateData = new GenerateData(pokemonInfo, pokemonClientApi);
        return generateData.getInformation();
    }
}
