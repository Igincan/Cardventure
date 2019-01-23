/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karty;

import java.awt.Color;
import zaklad.Hrac;

/**
 * Trieda dedí od karty a je určená na dedenie ďalej. Jej potomkovia útočia
 * na protivníka majteľa karty.
 * @author Iginčan
 */
public abstract class Utok extends Karta {

    /**
     * Vytvára Utok.
     * @param nazov názov karty
     * @param majtelKarty majteľ karty
     * @param utok sila útoku karty
     */
    public Utok(String nazov, Hrac majtelKarty, int utok) {
        super(nazov, majtelKarty, "Útok", utok, Color.RED);
    }

    /**
     * Odoberá život protivníkovi majteľa.
     */
    @Override
    public void pouzi() {
        super.getMajtelKarty().getProtivnik().odoberZivot(super.getSila());
    }
}
