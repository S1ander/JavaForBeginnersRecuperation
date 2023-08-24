/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fisagroup.pokemon.data.model;

import java.util.List;
import lombok.Builder;
import lombok.Getter;

/**
 *
 * @author sland
 */
@Builder
@Getter
public class Pokemon {

    private int id;
    private String name;
    private double height;
    private double weight;
    private List<Types> types;

    @Builder
    @Getter
    public static class Types {
        private int slot;
        private String name;
    }
//    private List<Descriptions> descriptions;

//    @Builder
//    @Getter
//    public static class Descriptions {
//        private String language;
//        private String description;
//    }
//
}
