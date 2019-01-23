/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package levely;

import karty.Karta;
import zaklad.Hrac;
import zaklad.Okno;

/**
 * Trieda slúži na fungovanie hry a jej logiky na konkrétnom leveli. Ďalej svoje informácie posiela oknu.
 * @author Iginčan
 */
public abstract class Level {
    
    private Hrac oponent;
    private Hrac pouzivatel;
    private Okno okno;
    private Karta pouzivanaKarta;

    /**
     * Vytvára Level.
     */
    public Level() {
        this.oponent = new Hrac(this);
        this.pouzivatel = new Hrac(this);
        this.oponent.setProtivnik(this.pouzivatel);
        this.pouzivatel.setProtivnik(this.oponent);
        this.okno = Okno.getOkno();
        this.pouzivanaKarta = null;
    }

    /**
     * Vracia používanú kartu, ktorú hráč zvolil ale ešte nepoužil.
     * @return používaná karta
     */
    public Karta getPouzivanaKarta() {
        return this.pouzivanaKarta;
    }

    /**
     * Nastavuje používanú kartu.
     * @param pouzivanaKarta používaná karta
     */
    public void setPouzivanaKarta(Karta pouzivanaKarta) {
        this.pouzivanaKarta = pouzivanaKarta;
    }

    /**
     * Vracia referenciu na oponenta.
     * @return referencia na oponenta
     */
    public Hrac getOponent() {
        return this.oponent;
    }

    /**
     * Vracia referenciu na používateľa
     * @return referencia na používateľa
     */
    public Hrac getPouzivatel() {
        return this.pouzivatel;
    }
    
    /**
     * Vracia referenciu na okno.
     * @return referencia na okno
     */
    protected Okno getOkno() {
        return this.okno;
    }
    
    /**
     * Pridáva kartu oponentovi.
     * @param karta karta
     */
    protected void pridajKartuOponentovi(Karta karta) {
        this.oponent.pridajKartuDoBalika(karta);
    }
    
    /**
     * Pridáva kartu používateľovi.
     * @param karta karta
     */
    protected void pridajKartuPouzivatelovi(Karta karta) {
        this.pouzivatel.pridajKartuDoBalika(karta);
    }
    
    /**
     * Spúšťa alebo inicializuje level.
     */
    public void spusti() {
        this.okno.priradLevel(this);
        this.pridajKartyOponentovi();
        this.pridajKartyPouzivatelovi();
        this.pouzivatel.setUplnaVelkostBalika(this.pouzivatel.getAktualnaVelkostBalika());
        this.oponent.setUplnaVelkostBalika(this.oponent.getAktualnaVelkostBalika());
        for (int i = 0; i < 3; i++) {
            this.pouzivatel.vytiahniNahodnuKartuZBalika();
        }
        this.okno.vykresli();
    }
    
    /**
     * Použije používanú kartu a odstráni ju.
     * @param hrac ten kto zahral kartu
     */
    public void zahrajPouzivanuKartu(Hrac hrac) {
        this.pouzivanaKarta.pouzi();
        hrac.odstranKartuZRuky(this.pouzivanaKarta);
        this.pouzivanaKarta = null;
    }

    protected abstract void pridajKartyOponentovi();
    
    protected abstract void pridajKartyPouzivatelovi();
    
    protected abstract void nastavZivot();
    
}
