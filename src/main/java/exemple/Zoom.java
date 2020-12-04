/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Font;

/**
 *
 * @author cecil
 */
public class Zoom extends Effet {
    
    public Zoom(int nbRepetition, Bandeau bandeau, String message) {
        super(nbRepetition, bandeau, message);
    }

    public void jouer() {
        bandeau.setMessage(this.message);
        for (int r = 0; r < this.nbRepetition; r++) {
            for (int i = 5; i <= 100; i += 5) {
                this.bandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
                this.bandeau.sleep(100);
            }
        }
        bandeau.setFont(new Font("SansSerif", Font.PLAIN, 50));
        bandeau.sleep(500);
    }
    
}
