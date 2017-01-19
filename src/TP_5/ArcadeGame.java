/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_5;

/**
 *
 * @author primaananda
 */
public class ArcadeGame extends GameAndroid implements TouchInput{

    public ArcadeGame(String nama, String LayoutOrientation, int size) {
        super(nama, LayoutOrientation, size);
    }

    @Override
    public String getGoal() {
        return "goal dari arcade game adalah mencapai finish dengan score setinggi-tingginy";
    }

    @Override
    public String tap() {
        return "meloncat";
    }
    
}
