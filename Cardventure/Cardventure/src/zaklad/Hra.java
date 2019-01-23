/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaklad;

/**
 * Základná trieda ktorá vytvára mapu a spúšťa hlavný level.
 * @author Iginčan
 */
public class Hra {
    
    private final Mapa mapa;

    /**
     * Vytvára inštanciu Hra.
     */
    public Hra() {
        this.mapa = new Mapa();
        this.mapa.spustiLevel(0);
    }
    
}
