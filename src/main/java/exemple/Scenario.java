/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.util.ArrayList;

/**
 *
 * @author cecil
 */
public class Scenario {
        private Bandeau bandeau;
    private ArrayList<Effet> effets = new ArrayList();

    public Scenario(Bandeau bandeau) {
        this.bandeau = bandeau;
    }

    public void ajoutEffet(Effet effet) {
        this.effets.add(effet);
    }

    public void jouerScenario() {
        for (Effet e : effets) {
            e.jouer();
            bandeau.sleep(1000);
        }
        bandeau.close();

    }
}
