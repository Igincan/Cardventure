/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karty.kuzlo;

import karty.rozhrania.IDegradovatelna;
import karty.Karta;
import karty.Kuzlo;
import zaklad.Hrac;

/**
 *
 * @author Iginčan
 */
public class Hnis extends Kuzlo {

    public Hnis(Hrac majtelKarty) {
        super("Hnis", majtelKarty);
    }

    @Override
    public void pouzi() {
        for (int i = 1; i <= 3; i++) {
            Karta karta = super.getMajtelKarty().getKartuZRuky(i);
            if (karta instanceof IDegradovatelna) {
                ((IDegradovatelna) karta).degraduj();
            }
        }
    }
    
}
