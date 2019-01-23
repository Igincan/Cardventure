/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karty.obrana;

import karty.rozhrania.IVylepsitelna;
import karty.Obrana;
import zaklad.Hrac;

/**
 *
 * @author Iginčan
 */
public class Doska extends Obrana implements IVylepsitelna {
    
    public Doska(Hrac majtelKarty) {
        super("Doska", majtelKarty, 1);
    }

    @Override
    public void vylepsi() {
        super.setNazov("*Doska*");
        super.pridajSilu(3);
    }
    
}
