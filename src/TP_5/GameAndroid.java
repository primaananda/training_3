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
public abstract class GameAndroid {
    private String nama;
    private String LayoutOrientation;
    private int size;

    public GameAndroid(String nama, String LayoutOrientation, int size) {
        this.nama = nama;
        this.LayoutOrientation = LayoutOrientation;
        this.size = size;
    }

    public String getNama() {
        return nama;
    }

    public String getLayoutOrientation() {
        return LayoutOrientation;
    }

    public int getSize() {
        return size;
    }
    
    public abstract String getGoal();
}
