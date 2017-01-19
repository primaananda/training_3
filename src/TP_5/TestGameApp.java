package TP_5;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author dee
 */
public class TestGameApp {

    GameAndroid g = null;
    Scanner sInt = new Scanner(System.in);
    Scanner sString = new Scanner(System.in);

    public void createGame() {
        int pil = 0;
        System.out.println("\n-----------------\ncreate new game");
        System.out.println("1. Endless Run");
        System.out.println("2. Racing");
        System.out.println("3. Arcade");
        System.out.print("input menu : ");
        pil = sInt.nextInt();
        System.out.print("game name : ");
        String name = sString.nextLine();
        System.out.print("screen orientation [landscape/portrait]: ");
        String orientation = sString.nextLine();
        System.out.print("game size [MB]: ");
        int size = sInt.nextInt();
        switch (pil) {
            case 1:
                g = new EndlessRunGame(name, orientation, size);
                break;
            case 2:
                g = new RacingGame(name, orientation, size);
                break;
            case 3:
                g = new ArcadeGame(name, orientation, size);
                break;
            default:
                System.out.println("wrong input");
        }
    }

    public void start() {
        int pil = 0;
        do {
            System.out.println("\n-----------------\nmenu");
            System.out.println("0. exit");
            System.out.println("1. create new game");
            if (g != null) {
                System.out.println("2. view info");
                if (g instanceof TouchInput) {
                    System.out.println("3. tap");
                }
                if (g instanceof AccelerometerSensor) {
                    System.out.println("4. tilt left");
                    System.out.println("5. tilt right");
                }
                if (g instanceof SwipeInput) {
                    System.out.println("6. swipe up");
                    System.out.println("7. swipe down");
                    System.out.println("8. swipe left");
                    System.out.println("9. swipe right");
                }
            }
            System.out.print("input menu : ");
            pil = sInt.nextInt();
            switch (pil) {
                case 1:
                    createGame();
                    break;
                case 2:
                    System.out.println(g.getGoal());
                    break;
                case 3:
                    if (g instanceof TouchInput) {
                        System.out.println(((TouchInput) g).tap());
                    }else{
                        System.out.println("wrong input");
                    }
                    break;
                case 4:
                    if (g instanceof AccelerometerSensor) {
                        System.out.println(((AccelerometerSensor) g).tiltLeft());
                    }else{
                        System.out.println("wrong input");
                    }
                    break;
                case 5:
                    if (g instanceof AccelerometerSensor) {
                        System.out.println(((AccelerometerSensor) g).tiltRight());
                    }else{
                        System.out.println("wrong input");
                    }
                    break;
                case 6:
                    if (g instanceof SwipeInput) {
                        System.out.println(((SwipeInput) g).swipeUp());
                    }else{
                        System.out.println("wrong input");
                    }
                    break;
                case 7:
                    if (g instanceof SwipeInput) {
                        System.out.println(((SwipeInput) g).swipeDown());
                    }else{
                        System.out.println("wrong input");
                    }
                    break;
                case 8:
                    if (g instanceof SwipeInput) {
                        System.out.println(((SwipeInput) g).swipeLeft());
                    }else{
                        System.out.println("wrong input");
                    }
                    break;
                case 9:
                    if (g instanceof SwipeInput) {
                        System.out.println(((SwipeInput) g).swipeRight());
                    }else{
                        System.out.println("wrong input");
                    }
                    break;
                case 0:
                    System.out.println("thank you");
                    break;
                default:
                    System.out.println("wrong input");
            }
        } while (pil != 0);
    }
}
