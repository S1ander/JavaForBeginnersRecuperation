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
public class Result {

    private String name;
    private String description;
    private double height;
    private double weight;
    private List<String> types;
 
    public static class ResultBuilder {

        @Override
        public String toString() {
            return "Pokedex\n" +
                    "\nName: " + name +
//                    "\nDescription: " + description +
                    "\nHeight: " + height+" m"+
                    "\nweight: " + weight+" Kg"+
                    "\nTypes: "+types;
        }
    }

//    @Builder
//    @Getter
//    public static class Type {
//        private int id;
//        private String name;
//
//        @Override
//        public String toString() {
//            return String.format("  %s", name);
//        }
//    }
}
   
