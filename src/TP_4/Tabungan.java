/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_4;

/**
 *
 * @author primaananda
 */
public class Tabungan {
    private String nama;
    private int saldo = 0;
    protected String logBook;

    public Tabungan(String nama) {
        this.nama = nama;
        this.logBook = "Saldo awal = "+this.saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNama() {
        return nama;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getLogBook() {
        return logBook;
    }
    
    public void debit(int debit){
        this.saldo += debit;
        this.logBook = "User telah nemabahkan saldo sebanyak "+debit+" saldo sekarang "+this.saldo;
        System.out.println(getLogBook());
    }
    
    public void kredit(int kredit){
        this.saldo -= kredit;
        this.logBook = "User telah mengambil uang sebanyak "+kredit+" saldo sekarang "+this.saldo;
        System.out.println(getLogBook());
    }
}
