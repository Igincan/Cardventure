/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karty.utok;

import karty.rozhrania.IVylepsitelna;
import karty.Utok;
import zaklad.Hrac;

/**
 *
 * @author Iginčan
 */
public class Palica extends Utok implements IVylepsitelna {

    public Palica(Hrac majtelKarty) {
        super("Palica", majtelKarty, 2);
    }

    @Override
    public void vylepsi() {
        super.setNazov("*Palica*");
        super.pridajSilu(2);
    }
    
}
