/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaklad;

import levely.Level;
import levely.Prvy;

/**
 * Trieda sa stará o rozvrhnutie levelov a ich postupné spúšťanie.
 * @author Iginčan
 */
public class Mapa {
    
    private final Level[] levely;

    /**
     * Vytvára Mapu.
     */
    public Mapa() {
        this.levely = new Level[] {
            new Prvy()
        };
    }
    
    /**
     * Spúšťa konkrétny level podľa indexu.
     * @param index index
     */
    public void spustiLevel(int index) {
        this.levely[index].spusti();
    }
    
}
