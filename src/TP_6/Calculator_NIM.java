/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_6;

/**
 *
 * @author primaananda
 */
public class Calculator_NIM implements TPModul6{
    private String nama;
    private String nim;
    private double angka1;
    private double angka2;
    
    public String getNama(){
        return nama;
    }
    
    public String getNim(){
        return nim;
    }
    
    public void setAngka1(double angka1){
        this.angka1 = angka1;
    }
    
    public void setAngka2(double angka2){
        this.angka2 = angka2;
    }
    
    public double tambah(){
        return this.angka1+this.angka2;
    }
    public double kurang(){
        return angka1-angka2;
    }
    public double kali(){
        return angka1*angka2;
    }
    public double bagi(){
        try {
            double hasil = angka1/angka2;
            if(angka2 == 0){
                throw new ArithmeticException("terdapat nol .");
            }            
            return hasil;            
        } catch (ArithmeticException e) {
            System.out.print(e);
            return 0;
        }
    }
}
