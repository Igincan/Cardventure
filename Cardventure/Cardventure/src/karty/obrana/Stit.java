/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karty.obrana;

import karty.Obrana;
import zaklad.Hrac;
import karty.rozhrania.IDegradovatelna;
import karty.rozhrania.IVylepsitelna;

/**
 *
 * @author Iginčan
 */
public class Stit extends Obrana implements IDegradovatelna, IVylepsitelna {
    
    public Stit(Hrac majtelKarty) {
        super("Stit", majtelKarty, 2);
    }

    @Override
    public void degraduj() {
        super.setSila(1);
        super.setNazov("-Stit-");
    }
    
    @Override
    public void vylepsi() {
        super.setSila(5);
        super.setNazov("*Stit*");
    }
    
}
