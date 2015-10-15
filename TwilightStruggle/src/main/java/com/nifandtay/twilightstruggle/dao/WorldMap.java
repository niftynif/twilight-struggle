/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nifandtay.twilightstruggle.dao;

import com.nifandtay.twilightstruggle.dto.CountryNode;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

/**
 *
 * @author apprentice
 */
public class WorldMap {

    private Graph<CountryNode, DefaultEdge> worldMap;
    private Countries countries;
    private final String FILEPATH = "edges.txt";
    private final String DELIMITER = "::";

    public WorldMap() throws FileNotFoundException {
        worldMap = new SimpleGraph<CountryNode, DefaultEdge>(DefaultEdge.class);

        //Loads countries as nodes into graph
        countries = new Countries();
        for (CountryNode c : countries.getAllCountries()) {

            worldMap.addVertex(c);
        }
        
        //Loads edges from file
        Scanner sc  = new Scanner(new BufferedReader(new FileReader(FILEPATH)));
        while (sc.hasNextLine()){
            String[] currentLine = sc.nextLine().split(DELIMITER);
            worldMap.addEdge(countries.getCountryByName(currentLine[0]), countries.getCountryByName(currentLine[1]));
        }

    }

}
