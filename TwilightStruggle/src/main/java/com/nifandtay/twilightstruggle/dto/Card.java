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
public class Card {

    private String name;
    private int opsValue;

    private enum PhaseOfWar {

        EARLYWAR, MIDWAR, LATEWAR
    };
    private PhaseOfWar phaseOfWar;

    public Card(String name, int ops, String phase) {
        this.name = name;
        this.opsValue = ops;
        this.phaseOfWar = phase.equals("early") ? PhaseOfWar.EARLYWAR : (phase.equals("mid") ? PhaseOfWar.MIDWAR : PhaseOfWar.LATEWAR);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOpsValue() {
        return opsValue;
    }

    public void setOpsValue(int ops) {
        this.opsValue = ops;
    }

    public PhaseOfWar getPhaseOfWar() {
        return phaseOfWar;
    }

    public void setPhaseOfWar(PhaseOfWar phaseOfWar) {
        this.phaseOfWar = phaseOfWar;
    }

}
