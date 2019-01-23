/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karty.utok;

import karty.rozhrania.IDegradovatelna;
import karty.Utok;
import zaklad.Hrac;

/**
 *
 * @author Iginčan
 */
public class Ohen extends Utok implements IDegradovatelna {
    
    public Ohen(Hrac majtelKarty) {
        super("Ohen", majtelKarty, 3);
    }

    @Override
    public void degraduj() {
        super.odoberSilu(2);
        super.setNazov("-Ohen-");
    }
    
}
