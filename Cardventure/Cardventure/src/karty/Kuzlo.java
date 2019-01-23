/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karty;

import java.awt.Color;
import zaklad.Hrac;

/**
 * Trieda dedí od karty a je určená na dedenie ďalej. Jej potomkovia majú
 * špeciálne použitia oproti ostatným kartám.
 * @author Iginčan
 */
public abstract class Kuzlo extends Karta {

    /**
     * Vytvára Kuzlo.
     * @param nazov názov karty
     * @param majtelKarty majteľ karty
     */
    public Kuzlo(String nazov, Hrac majtelKarty) {
        super(nazov, majtelKarty, "Kúzlo", 0, Color.BLUE);
    }
    
    /**
     * Pregeneruje HTML kód.
     * @return HTML kód
     */
    @Override
    public String toHTMLString() {
        return "<html><i>" + this.getTyp() + "</i><br><br><br><br><b><font size=5>" + this.getNazov();
    }
}
