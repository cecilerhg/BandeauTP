/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Color;

/**
 *
 * @author cecil
 */
public class ColorChange extends Effet {
        
    public ColorChange(int nbRepetition, Bandeau bandeau, String message) {
        super(nbRepetition, bandeau, message);
    }
    
    public void jouer() {
        bandeau.setMessage(this.message);
        for (int r = 0; r < this.nbRepetition; r++) {
            bandeau.setBackground(Color.ORANGE);
            bandeau.sleep(1000);
            bandeau.setForeground(Color.WHITE);
            bandeau.sleep(100);
        }
        bandeau.sleep(1000);
        bandeau.setBackground(Color.WHITE);
        bandeau.setForeground(Color.black);
    }
    
}
