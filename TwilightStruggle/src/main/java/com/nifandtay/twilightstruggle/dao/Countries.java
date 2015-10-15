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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Countries {
    
    private Map<String, CountryNode> countryList;
    private final String FILEPATH = "countries.txt";
    private final String DELIMITER = "::";
    
    public Countries() throws FileNotFoundException{
        countryList = new HashMap<>();
        makeCountryList();
        
    }

    private void makeCountryList() throws FileNotFoundException {   
        Scanner sc = new Scanner(new BufferedReader(new FileReader(FILEPATH)));
        while (sc.hasNextLine()){
            String[] currentLine = sc.nextLine().split(DELIMITER);
            CountryNode currentNode = new CountryNode(currentLine[0], Integer.parseInt(currentLine[1]), Boolean.parseBoolean(currentLine[2]));
            countryList.put(currentLine[0], currentNode);
            System.out.println(currentNode.getName());
        }
        
    }
    
    public List<CountryNode> getAllCountries(){
        List<CountryNode> output = new ArrayList<>();
        for (String s: countryList.keySet()){
            output.add(countryList.get(s));
        }
        
        return output;
    }
    
    public CountryNode getCountryByName(String countryName){
        return countryList.get(countryName);
    }
    
    
    
}
