/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karty.kuzlo;

import java.util.Random;
import karty.Karta;
import karty.Kuzlo;
import karty.utok.Ohen;
import karty.utok.Palica;
import karty.utok.Plamienok;
import zaklad.Hrac;

/**
 *
 * @author Iginčan
 */
public class Portal extends Kuzlo {

    public Portal(Hrac majtelKarty) {
        super("Portal", majtelKarty);
    }

    @Override
    public void pouzi() {
        Random random = new Random();
        Karta karta;
        switch (random.nextInt(3)) {
            case 0:
                karta = new Ohen(super.getMajtelKarty());
                break;
            case 1:
                karta = new Palica(super.getMajtelKarty());
                break;
            case 2:
                karta = new Plamienok(super.getMajtelKarty());
                break;
            default:
                karta = null;
                break;
        }
        super.getMajtelKarty().pridajKartuDoBalika(karta);
    }
    
}
