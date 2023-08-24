/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.fisagroup.pokemon.data;

import com.fisagroup.pokemon.data.client.PokemonClientApi;
import com.fisagroup.pokemon.data.controllers.GenerateData;
import com.fisagroup.pokemon.data.model.Pokemon;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author sland
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class PokemonAplication {


    public static void main(String[] args) {
        SpringApplication.run(PokemonAplication.class, args);
    }

    @Bean
    public CommandLineRunner run(PokemonClientApi pokemonClientApi) {
        return args -> {
            Pokemon pokemonInfo = pokemonClientApi.getPokemonInfo("blaziken");
            GenerateData data = new GenerateData(pokemonInfo, pokemonClientApi);
            data.getInformation();

        };
    }

}

