/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author primaananda
 */
public class Aplikasi {
    private Calculator_NIM model;
    private Scanner s;
    private double angka;
    private int pil;

    public Aplikasi() {
        model = new Calculator_NIM();
        s = new Scanner(System.in);
    }
    public double inputAngka(){
        try {
            angka = s.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println(e+" : masukan anda bukan angka");
        } finally {
            s = new Scanner(System.in);
        }
        return angka;
    }
    
    public int inputOperator(){
        try {
            pil = s.nextInt();
            if (pil < 0 || pil > 4) {
                throw new RuntimeException();
            }
        } catch (InputMismatchException e) {
            System.out.println(e+" : masukan harus angka");
        } catch (RuntimeException ex) {
            System.out.println(ex+" : masukan harus 0-4");
        }finally {
            s = new Scanner(System.in);
        }
        return pil;
    }
    
    public void jalankanAplikasi(int pil){
        switch (pil){
            case 1 :
                try{
                    model.tambah();
                }finally {
                System.out.println("Hasil : "+model.tambah());
            }
                break;
            case 2 :
                try{
                    model.kurang();
                }finally {
                System.out.println("Hasil : "+model.kurang());
            }
                break;
            case 3 : 
                try{
                    model.kali();
                }finally {
                System.out.println("Hasil : "+model.kali());
            }
                break;
            case 4 :
                try{
                    model.bagi();
                }finally {
                System.out.println("Hasil : "+model.bagi());
            }
                break;
        }
    }
    public void menu(){
        do {            
            System.out.println("nama : "+model.getNama()+"NIM : "+model.getNim());
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3. Kali");
            System.out.println("4. Bagi");
            System.out.println("0. Exit");
            System.out.print("Masukkan Pilihan : ");
            inputOperator();
            if (pil == 0) {
                System.out.println("Terimakasih");
            }else if (pil >= 1 && pil <= 4){
                System.out.print("Input Angka 1 : ");
                inputAngka();
                model.setAngka1(angka);
                System.out.print("Input Angka 2 : ");
                inputAngka();
                model.setAngka2(angka);
            }
            jalankanAplikasi(pil);
        } while (pil != 0);
        
        
    }
}
