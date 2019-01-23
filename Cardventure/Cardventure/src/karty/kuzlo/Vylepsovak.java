/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karty.kuzlo;

import java.awt.Color;
import karty.rozhrania.IVylepsitelna;
import karty.Karta;
import karty.Kuzlo;
import zaklad.Hrac;

/**
 *
 * @author Iginčan
 */
public class Vylepsovak extends Kuzlo {

    public Vylepsovak(Hrac majtelKarty) {
        super("Vylepsovak", majtelKarty);
    }

    @Override
    public void pouzi() {
        for (int i = 1; i <= 3; i++) {
            Karta karta = super.getMajtelKarty().getKartuZRuky(i);
            if (karta instanceof IVylepsitelna) {
                ((IVylepsitelna) karta).vylepsi();
            }
        }
    }
    
}
