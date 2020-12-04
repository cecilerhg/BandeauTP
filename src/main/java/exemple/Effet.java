/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;

/**
 *
 * @author cecil
 */
public abstract class Effet {
    
    protected int nbRepetition;
    public Bandeau bandeau;
    protected String message;

    public Effet(int nbRepetition, Bandeau bandeau, String message) {
        this.nbRepetition = nbRepetition;
        this.bandeau = bandeau;
        this.message = message;
    }

    public abstract void jouer();
    
}
