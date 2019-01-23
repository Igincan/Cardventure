/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package levely;

import karty.Liecenie;
import karty.Obrana;
import karty.Utok;
import karty.kuzlo.Hnis;
import karty.kuzlo.Vylepsovak;
import karty.liecenie.Naplast;
import karty.liecenie.Obvaz;
import karty.obrana.Doska;
import karty.obrana.Stit;
import karty.utok.Ohen;
import karty.utok.Palica;
import karty.utok.Plamienok;

/**
 * Trieda vytvára prvý level.
 * @author Iginčan
 */
public class Prvy extends Level {

    /**
     * Vytvára Prvy.
     */
    public Prvy() {
        super();
    }

    /**
     * Vytvára a pridáva karty oponetovi.
     */
    @Override
    protected void pridajKartyOponentovi() {
        super.pridajKartuOponentovi(new Plamienok(super.getOponent()));
        super.pridajKartuOponentovi(new Doska(super.getOponent()));
        super.pridajKartuOponentovi(new Naplast(super.getOponent()));
    }

    /**
     * Vytvára a pridáva karty používateľovi.
     */
    @Override
    protected void pridajKartyPouzivatelovi() {
        super.pridajKartuPouzivatelovi(new Plamienok(super.getPouzivatel()));
        super.pridajKartuPouzivatelovi(new Doska(super.getPouzivatel()));
        super.pridajKartuPouzivatelovi(new Naplast(super.getPouzivatel()));
        super.pridajKartuPouzivatelovi(new Ohen(super.getPouzivatel()));
        super.pridajKartuPouzivatelovi(new Ohen(super.getPouzivatel()));
        super.pridajKartuPouzivatelovi(new Ohen(super.getPouzivatel()));
        super.pridajKartuPouzivatelovi(new Stit(super.getPouzivatel()));
        super.pridajKartuPouzivatelovi(new Obvaz(super.getPouzivatel()));
        super.pridajKartuPouzivatelovi(new Palica(super.getPouzivatel()));
        super.pridajKartuPouzivatelovi(new Vylepsovak(super.getPouzivatel()));
        super.pridajKartuPouzivatelovi(new Hnis(super.getPouzivatel()));
    }

    /**
     * Inicializuje život oboch hráčov.
     */
    @Override
    protected void nastavZivot() {
        super.getOponent().setMaximalnyPocetBodovZivota(15);
        super.getPouzivatel().setMaximalnyPocetBodovZivota(5);
    }
}
