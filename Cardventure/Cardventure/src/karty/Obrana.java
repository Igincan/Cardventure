/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karty;

import java.awt.Color;
import zaklad.Hrac;

/**
 * Trieda dedí od karty a je určená na dedenie ďalej. Jej potomkovia pridávajú
 * obranu majteľovi karty.
 * @author Iginčan
 */
public abstract class Obrana extends Karta {

    /**
     * Vytvára Obrana.
     * @param nazov názov karty
     * @param majtelKarty majteľ karty
     * @param obrana sila obrany karty
     */
    public Obrana(String nazov, Hrac majtelKarty, int obrana) {
        super(nazov, majtelKarty, "Obrana", obrana, Color.GRAY);
        
    }

    /**
     * Pridáva obranu majteľovi karty.
     */
    @Override
    public void pouzi() {
        super.getMajtelKarty().pridajObranu(super.getSila());
    }
}
