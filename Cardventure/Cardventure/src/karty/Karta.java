/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karty;

import java.awt.Color;
import zaklad.Hrac;

/**
 * Trieda ktorá je predkom všetkých kariet. Ukladá v sebe všetky základné
 * informácie o kartách a pracuje s nimi.
 * @author Iginčan
 */
public abstract class Karta {
    
    private String nazov;
    private Hrac majtelKarty;
    private String typ;
    private int sila;
    private Color farba;

    /**
     * Vytvára Karta.
     * @param nazov názov karty
     * @param majtelKarty majteľ katy
     * @param typ typ karty
     * @param sila sila karty
     * @param farba farba karty
     */
    public Karta(String nazov, Hrac majtelKarty, String typ, int sila, Color farba) {
        this.nazov = nazov;
        this.majtelKarty = majtelKarty;
        this.typ = typ;
        this.sila = sila;
        this.farba = farba;
    }

    /**
     * Vracia silu karty.
     * @return sila karty
     */
    public int getSila() {
        return this.sila;
    }

    /**
     * Vracia názov karty.
     * @return názov karty
     */
    public String getNazov() {
        return this.nazov;
    }

    /**
     * Vracia majteľa karty.
     * @return majteľ karty
     */
    public Hrac getMajtelKarty() {
        return this.majtelKarty;
    }

    /**
     * Nastavuje majteľa karty.
     * @param majtelKarty 
     */
    public void setMajtelKarty(Hrac majtelKarty) {
        this.majtelKarty = majtelKarty;
    }

    /**
     * Vracia typ karty.
     * @return typ karty
     */
    public String getTyp() {
        return this.typ;
    }

    /**
     * Vracia farbu karty.
     * @return farba karty
     */
    public Color getFarba() {
        return this.farba;
    }

    /**
     * Nastavuje názov karty.
     * @param nazov názov karty
     */
    protected void setNazov(String nazov) {
        this.nazov = nazov;
    }
    
    /**
     * Nastavuje silu používateľa.
     * @param sila sila karty
     */
    protected void setSila(int sila) {
        this.sila = sila;
    }

    /**
     * Pridáva silu karte.
     * @param sila sila karty
     */
    protected void pridajSilu(int sila) {
        this.sila += sila;
    }
    
    /**
     * Odoberá silu karty.
     * @param sila sila karty
     */
    protected void odoberSilu(int sila) {
        this.sila -= sila;
    }
    
    /**
     * Vygeneruje HTML kód pre buttony na zobrazenie karty.
     * @return HTML kód
     */
    public String toHTMLString() {
        return "<html><i>" + this.getTyp() + "</i><br><br><br><br><b><font size=5>" + this.getNazov() + "</font><br><br><br><br><font size=4>" + this.getSila() + "</font></b></html>";
    }
    
    /**
     * Implementuje použitie karty.
     */
    public abstract void pouzi();
    
}