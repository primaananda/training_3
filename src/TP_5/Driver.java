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
public class Driver {
    public static void main(String[] args) {
        ArcadeGame ag = new ArcadeGame("BlueBild", "30", 5);
        RacingGame rg = new RacingGame("BlueSpeed", "30", 9);
        EndlessRunGame eg = new EndlessRunGame("BlueRun", "30", 5);
        
        System.out.println("Game : "+ag.getNama());
        System.out.println("Goal game : "+ag.getGoal());
        System.out.println(ag.tap());
        System.out.println("=============== \n");
        System.out.println("Game : "+rg.getNama());
        System.out.println("Goal game : "+rg.getGoal());
        System.out.println(rg.tap()+"\n"+rg.tiltLeft()+"\n"+rg.tiltRight());
        System.out.println("=============== \n");
        System.out.println("Game : "+eg.getNama());
        System.out.println("Goal game : "+eg.getGoal());
        System.out.println(eg.swipeDown()+"\n"+eg.swipeLeft()+
                "\n"+eg.swipeRight()+"\n"+eg.swipeUp()+"\n"+
                eg.tiltLeft()+"\n"+eg.tiltRight());
    }
}
