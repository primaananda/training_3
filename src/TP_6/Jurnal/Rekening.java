/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_6.Jurnal;

/**
 *
 * @author primaananda
 */
public class Rekening {
    private int noRek;
    private double saldo;

    public Rekening(int noRek, double saldo_awal) {
        try {
            if (String.valueOf(noRek).length() != 5){
                throw new IllegalArgumentException("Panjang harus 5");
            }
            if (saldo_awal <0){
                throw new IllegalArgumentException("saldo awal kurang dari nol");
            }else{
                this.saldo = saldo_awal;
                this.noRek = noRek;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }            
    }

    public int getNoRek() {
        return noRek;
    }

    public double getSaldo() {
        return saldo;
    }
    
    
    public void Tabung(double jumlah){
        try {
            if(jumlah <0){
                throw new IllegalArgumentException("jumlah kurang dari 0");
            }else{
                this.saldo += jumlah;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ambil(double jumlah){
        try {
            if(jumlah <0){
                throw new IllegalArgumentException("jumlah kurang dari 0");
            }else if (saldo < jumlah){
                throw new InsufficientFundsException("penarikan lebih");
            }else {
                this.saldo -= jumlah;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Rekening{" + "noRek=" + noRek + ", saldo=" + saldo + '}';
    }
}
