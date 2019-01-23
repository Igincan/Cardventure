/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaklad;

/**
 * Generická trieda, ktorá slúži ako kontajner na uskladňovanie elementov
 * takým spôsobom, aby nemenili svoje indexy pri odstraňovaní a pri ich
 * pridávaní sa plnil od prvý voľných miest. Použil som to na hráčovú ruku.
 * @author Iginčan
 */
public class MojKontajner<E> {
    
    private int zakladnaVelkost;
    private int velkost;
    private Object[] zoznamElementov;

    /**
     * Vytvára MojKontajner.
     * @param zakladnaVelkost určuje základnú veľkosť alebo maximálnu veľkosť
     */
    public MojKontajner(int zakladnaVelkost) {
        this.zakladnaVelkost = zakladnaVelkost;
        this.velkost = 0;
        this.zoznamElementov = new Object[zakladnaVelkost];
    }
    
    /**
     * Pridáva elementy do kontajnera.
     * @param element element
     * @return 
     */
    public boolean pridaj(E element) {
        for (int i = 0; i < this.zakladnaVelkost; i++) {
            if (this.velkost < this.zakladnaVelkost) {
                if (this.zoznamElementov[i] == null) {
                    this.zoznamElementov[i] = element;
                    this.velkost++;
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Odstraňuje elementy z kontajnera.
     * @param element
     * @return 
     */
    public boolean odstran(E element) {
        for (int i = 0; i < this.zakladnaVelkost; i++) {
            if (element != null) {
                if (this.zoznamElementov[i] == element) {
                    this.zoznamElementov[i] = null;
                    this.velkost--;
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Vracia elementy podľa indexu.
     * @param index index
     * @return 
     */
    public E daj(int index) {
        return (E) this.zoznamElementov[index];
    }
    
    /**
     * Vracia aktuálnu veľkosť alebo počet použitých miest v kontajneri.
     * @return veľkosť kontajnera
     */
    public int getVelkost() {
        return this.velkost;
    }

    /**
     * Vracia celkovú veľkosť vrátane nepoužitých miest.
     * @return veľkosť kontajnera
     */
    public int getZakladnaVelkost() {
        return this.zakladnaVelkost;
    }
    
}
