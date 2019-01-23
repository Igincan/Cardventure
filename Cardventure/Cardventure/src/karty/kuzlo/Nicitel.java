/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karty.kuzlo;

import karty.Kuzlo;
import zaklad.Hrac;

/**
 *
 * @author Iginčan
 */
public class Nicitel extends Kuzlo {

    public Nicitel(Hrac majtelKarty) {
        super("Ničiteľ", majtelKarty);
    }

    @Override
    public void pouzi() {
        super.getMajtelKarty().getProtivnik().zrusObranu();
    }
    
}
