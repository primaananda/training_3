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
public class RacingGame extends GameAndroid implements TouchInput, AccelerometerSensor {

    public RacingGame(String nama, String LayoutOrientation, int size) {
        super(nama, LayoutOrientation, size);
    }

    @Override
    public String getGoal() {
        return "mencapai finish dengan waktu tercepat";
    }

    @Override
    public String tap() {
        return "NoS activate";
    }

    @Override
    public String tiltRight() {
        return "belok kanan";
    }

    @Override
    public String tiltLeft() {
        return "belok kiri";
    }
    
}
