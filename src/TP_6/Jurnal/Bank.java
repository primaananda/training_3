/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_6.Jurnal;

import TP_6.Jurnal.Rekening;

/**
 *
 * @author primaananda
 */
public class Bank {
    private String nama_bank;
    private Rekening[] daftar_nasabah;
    private int n_nasabah = 0;

    public Bank(int max_nasabah) {
        daftar_nasabah = new Rekening[max_nasabah];
    }
    
    public void tambahNasabah(Rekening akun){
        //n_nasabah -1 karena array mulai dari 0
        if(daftar_nasabah.length == n_nasabah-1){
            throw new IllegalArgumentException("melebihi batas");
        }else{
            daftar_nasabah[n_nasabah] = akun;
            n_nasabah++;
        }              
    }
    
    public Rekening cariNasabah(int no_rek){
        Rekening x = null;
        for(int i=0; i <n_nasabah;i++){
            if(daftar_nasabah[i].getNoRek() == no_rek){
                x = daftar_nasabah[i];
            }                
        }
        return x;
    }

    @Override
    public String toString() {
        String out = "";
        for (int i = 0; i < n_nasabah; i++) {
            out = daftar_nasabah[i].toString();
        }
        return out;
    }
    
    
}
