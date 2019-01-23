/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaklad;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.Timer;
import karty.Karta;
import levely.Level;

/**
 * Trieda ktorá sa stará o používateľa a aj oponenta. Všetky staty sú uložené tu. Taktiež sú tu uložené aj karty.
 * @author Iginčan
 */
public class Hrac {
    
    private final ArrayList<Karta> balik;
    private final MojKontajner<Karta> ruka;
    private int maximalnyPocetBodovZivota;
    private int pocetBodovZivota;
    private int pocetbodovObrany;
    private Level level;
    private int uplnaVelkostBalika;
    private Random random;
    private Hrac protivnik;

    /**
     * Vytvára inštanciu Hrac.
     * @param level priradený level hráčovi v ktorom bude hrať
     */
    public Hrac(Level level) {
        this.balik = new ArrayList<>();
        this.ruka = new MojKontajner<>(3);
        this.maximalnyPocetBodovZivota = 10;
        this.pocetBodovZivota = this.maximalnyPocetBodovZivota;
        this.pocetbodovObrany = 0;
        this.level = level;
        this.uplnaVelkostBalika = 0;
        this.random = new Random();
        this.protivnik = null;
    }
    
    /**
     * Nastavuje protivníka.
     * @param protivnik protivnik
     */
    public void setProtivnik(Hrac protivnik) {
        this.protivnik = protivnik;
    }

    /**
     * Vracia protivníka.
     * @return protivník
     */
    public Hrac getProtivnik() {
        return this.protivnik;
    }
    
    /**
     * Odstráni kartu z ruky podľa referencie z parametra.
     * @param karta referenica
     */
    public void odstranKartuZRuky(Karta karta) {
        this.ruka.odstran(karta);
    }
    
    /**
     * Pridáva konkrétnu kartu do balíka.
     * @param karta karta
     */
    public void pridajKartuDoBalika(Karta karta) {
        this.balik.add(karta);
    }
    
    /**
     * Hráč si vytiahne náhodnú kartu z balíka.
     */
    public void vytiahniNahodnuKartuZBalika() {
        if (this.balik.size() > 0 && this.ruka.getVelkost() < 3) {
            this.ruka.pridaj(this.balik.remove(this.random.nextInt(this.balik.size())));
        }
    }
    
    /**
     * Vracia aktuálny počet kariet v balíku.
     * @return veľkosť balíka
     */
    public int getAktualnaVelkostBalika() {
        return this.balik.size();
    }

    /**
     * Vracia začiatočnú veľkosť balíka.
     * @return 
     */
    public int getUplnaVelkostBalika() {
        return this.uplnaVelkostBalika;
    }

    /**
     * Vracia počet bodov obrany.
     * @return počet bodov obrany
     */
    public int getPocetbodovObrany() {
        return this.pocetbodovObrany;
    }

    /**
     * Nastavuje úplnu veľkosť balíka.
     * @param uplnaVelkostBalika úplna veľkosť balíka
     */
    public void setUplnaVelkostBalika(int uplnaVelkostBalika) {
        this.uplnaVelkostBalika = uplnaVelkostBalika;
    }

    /**
     * Nastavuje maximálny možný počet bodov života.
     * @param maximalnyPocetBodovZivota počet bodov života
     */
    public void setMaximalnyPocetBodovZivota(int maximalnyPocetBodovZivota) {
        this.maximalnyPocetBodovZivota = maximalnyPocetBodovZivota;
    }

    /**
     * Odoberá hráčovi život.
     * @param pocetBodov počet bodov odoberaného života
     */
    public void odoberZivot(int pocetBodov) {
        if (pocetBodov > this.pocetbodovObrany) {
            this.pocetBodovZivota -= pocetBodov - this.pocetbodovObrany;
            this.pocetbodovObrany = 0;
            Timer ukonci = new Timer(2000, (e) -> {
                System.exit(0);
            });
            if (this.pocetBodovZivota <= 0) {
                ukonci.start();
            }
        } else {
            this.pocetbodovObrany -= pocetBodov;
        }
    }

    /**
     * Pridáva hráčovi život.
     * @param pocetBodov počet bodov pridavaného života
     */
    public void pridajZivot(int pocetBodov) {
        if (this.pocetBodovZivota + pocetBodov <= this.maximalnyPocetBodovZivota) {
            this.pocetBodovZivota += pocetBodov;
        } else {
            this.pocetBodovZivota = this.maximalnyPocetBodovZivota;
        }
    }

    /**
     * Pridáva hráčovi obranu.
     * @param pocetBodov počet bodov pridanej obrany
     */
    public void pridajObranu(int pocetBodov) {
        this.pocetbodovObrany += pocetBodov;
    }
    
    /**
     * Vynuluje obranu.
     */
    public void zrusObranu() {
        this.pocetbodovObrany = 0;
    }

    /**
     * Vracia kartu z ruky podľa indexu.
     * @param index index
     * @return 
     */
    public Karta getKartuZRuky(int index) {
        return this.ruka.daj(index - 1);
    }

    /**
     * Vracia aktuálny počet bodov života.
     * @return počet bodov života
     */
    public int getPocetBodovZivota() {
        return this.pocetBodovZivota;
    }
    
    /**
     * Zisťuje či má hráč plný počet bodov života.
     * @return true aj má plný počet bodov života
     */
    public boolean maPlnyPocetBodovZivota() {
        return this.pocetBodovZivota == this.maximalnyPocetBodovZivota;
    }
    
}
