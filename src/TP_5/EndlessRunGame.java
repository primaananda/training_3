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
public class EndlessRunGame extends GameAndroid implements SwipeInput, AccelerometerSensor{

    public EndlessRunGame(String nama, String LayoutOrientation, int size) {
        super(nama, LayoutOrientation, size);
    }

    @Override
    public String getGoal() {
        return "berusaha menghindari obstacle yang ada untuk mendapatkan poin tertinggi";
    }

    @Override
    public String swipeUp() {
        return "meloncat";
    }

    @Override
    public String swipeDown() {
        return "meluncur";
    }

    @Override
    public String swipeRight() {
        return "ke kanan";
    }

    @Override
    public String swipeLeft() {
        return "ke kiri";
    }

    @Override
    public String tiltRight() {
        return "menghindari obstacle ke kanan";
    }

    @Override
    public String tiltLeft() {
        return "menghindari obstacle ke kiri";
    }
    
}
