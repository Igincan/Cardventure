/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karty;

import java.awt.Color;
import zaklad.Hrac;

/**
 * Trieda dedí od karty a je určená na dedenie ďalej. Jej potomkovia liečia
 * majteľa karty.
 * @author Iginčan
 */
public abstract class Liecenie extends Karta{
    
    /**
     * Vytvára Liecenie.
     * @param nazov názov karty
     * @param majtelKarty majteľ karty
     * @param liecenie sila liečenia karty
     */
    public Liecenie(String nazov, Hrac majtelKarty, int liecenie) {
        super(nazov, majtelKarty, "Liečenie", liecenie, Color.GREEN);
    }

    /**
     * Pridáva život majteľovi karty.
     */
    @Override
    public void pouzi() {
        super.getMajtelKarty().pridajZivot(super.getSila());
    }
    
}
