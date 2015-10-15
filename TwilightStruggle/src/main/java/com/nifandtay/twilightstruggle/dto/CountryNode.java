/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nifandtay.twilightstruggle.dto;

/**
 *
 * @author apprentice
 */
public class CountryNode {
    
    private String name;
    private int stability;
    private boolean isBattleground;
    private int usInfluence;
    private int ussrInfluence;

    public CountryNode(String name, int stability, boolean isBattleground) {
        this.name = name;
        this.stability = stability;
        this.isBattleground = isBattleground;
    }

    public boolean isIsBattleground() {
        return isBattleground;
    }

    public void setIsBattleground(boolean isBattleground) {
        this.isBattleground = isBattleground;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStability() {
        return stability;
    }

    public void setStability(int stability) {
        this.stability = stability;
    }

    public int getUsInfluence() {
        return usInfluence;
    }

    public void setUsInfluence(int usInfluence) {
        this.usInfluence = usInfluence;
    }

    public int getUssrInfluence() {
        return ussrInfluence;
    }

    public void setUssrInfluence(int ussrInfluence) {
        this.ussrInfluence = ussrInfluence;
    }
    
    
    
    
}
