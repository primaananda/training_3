/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author primaananda
 */
public class TabunganHariTua extends Tabungan{
    private String noRek;
    private Date terakhirDebit = new Date();
    private Date date = new Date();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");

    public TabunganHariTua(String nama, String noRek, int saldo) {
        super(nama);
        this.noRek = noRek;
        setSaldo(saldo);
        this.logBook = "Saldo awal"+saldo;
    }

    @Override
    public void kredit(int kredit) {
        if (kredit <= 50 ) {
            if(getSaldo() >= 100){
                setSaldo(getSaldo()-kredit);
                this.logBook = "User telah mengambil uang sebanyak "+kredit+" saldo sekarang "+getSaldo();
                System.out.println(getLogBook());
            }else{
                System.out.println("Maaf saldo anda tidak cukup {batas saldo untuk penarikan sebesar kurang dari 50}");
            }
        }else{
            System.out.println("anda melewati batas maksimal/minimal penarikan saldo");
        }
    }
    
    public String getTanggal() {  
        return dateFormat.format(terakhirDebit);  
    }

    @Override
    public void debit(int debit) {
        if (debit >= 20) {
            setSaldo(getSaldo()+debit);
            this.logBook = "User telah nemabahkan saldo sebanyak "+debit+" saldo sekarang "+getSaldo();
            System.out.println(getLogBook());
            this.terakhirDebit = new Date();
            System.out.println("Tanggal debit : "+dateFormat.format(terakhirDebit));
            remainderDebit();
        }else{
            System.out.println("Minimal debit adalah 20");
        }                    
    }
    
    public void remainderDebit(){
        //mengingat bila tanggal sekarang sudah 1 bulan dari tanggal terakhir debit
        if (selisihWaktu(terakhirDebit, date) == 30) {
            System.out.println("Tanggal hari ini sudah 1 bulan dari tanggal terakhir debit");
        }
    }
    
    public int selisihWaktu(Date waktu1, Date waktu2){
        double selisihw = Math.abs(waktu1.getTime()-waktu2.getTime());
        double selisihhari = selisihw/(24*60*60*1000);
        return (int)selisihhari;
    }
}
