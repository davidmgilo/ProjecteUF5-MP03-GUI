/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuf5gui;

import java.io.Serializable;
import java.util.Comparator;

/**
 *
 * @author alumne
 */
public class Aliment implements Comparable, Serializable{ 
    private String _1nom;
    private String _2tipus;
    private int _3cal; 
    static final Comparator<Aliment> CAL_ORDER =
            new Comparator<Aliment> (){
        @Override
        public int compare(Aliment a1, Aliment a2) {
            return (a1.get3cal() < a2.get3cal() ? -1 :
                    (a1.get3cal() == a2.get3cal() ? 0 : 1));
        }
    };
    static final Comparator<Aliment> TYPE_ORDER =
            new Comparator<Aliment> (){
        @Override
        public int compare(Aliment a1, Aliment a2) {
            return a1.get2tipus().compareTo(a2.get2tipus());
        }
    };

    public Aliment(String nom, String tipus, int cal) {
        this._1nom = nom;
        this._2tipus = tipus;
        this._3cal = cal;
    }

    public String get1nom() {
        return _1nom;
    }

    public void set1nom(String _1nom) {
        this._1nom = _1nom;
    }

    public int get3cal() {
        return _3cal;
    }

    public void set3cal(int _3cal) {
        this._3cal = _3cal;
    }

    public String get2tipus() {
        return _2tipus;
    }

    public void set2tipus(String _2tipus) {
        this._2tipus = _2tipus;
    }

    @Override
    public String toString() {
        return "Aliment{" + "nom=" + _1nom + ", tipus=" + _2tipus + ", cal=" + _3cal + '}';
    }
        
    @Override
    public int compareTo(Object o) {
        Aliment a = (Aliment)o;
        return _1nom.compareTo(a.get1nom());
    }
}
