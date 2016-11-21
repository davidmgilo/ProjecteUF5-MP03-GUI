/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuf5gui;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumne
 */
public class Animal implements Serializable{
    private String _1nom;
    private String _2tipus;
    private double _3pes;
    private double _4email_prop;
    //Ho faig en ArrayList perquè vull elements repetits i és més ràpid d'accés que una LinkedList.
    private ArrayList<Aliment> _5menja = new ArrayList<>();

    public Animal(String _1nom, String _2tipus, double _3pes, double _4email_prop) {
        this._1nom = _1nom;
        this._2tipus = _2tipus;
        this._3pes = _3pes;
        this._4email_prop = _4email_prop;
    }

    
    
    public String get1nom() {
        return _1nom;
    }

    public void set1nom(String _1nom) {
        this._1nom = _1nom;
    }

    public String get2tipus() {
        return _2tipus;
    }

    public void set2tipus(String _2tipus) {
        this._2tipus = _2tipus;
    }

    public double get3pes() {
        return _3pes;
    }

    public void set3pes(double _3pes) {
        this._3pes = _3pes;
    }

    public double get4email_prop() {
        return _4email_prop;
    }

    public void set4email_prop(double _4email_prop) {
        this._4email_prop = _4email_prop;
    }

    public ArrayList<Aliment> get5menja() {
        return _5menja;
    }

    public void set5menja(ArrayList<Aliment> _5menja) {
        this._5menja = _5menja;
    }
  
    
}
