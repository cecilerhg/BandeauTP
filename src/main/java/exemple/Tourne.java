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
public class Tourne extends Effet {
        public Tourne(int nbRepetition, Bandeau bandeau, String message) {
        super(nbRepetition, bandeau, message);
    }

    public void jouer() {
        bandeau.setMessage(this.message);
        for (int r = 0; r < this.nbRepetition; r++) {
            for (int i = 5; i <= 100; i++) {
                bandeau.setRotation(2 * Math.PI * i / 100);
                bandeau.sleep(100);
            }
        }
    }
    
}
