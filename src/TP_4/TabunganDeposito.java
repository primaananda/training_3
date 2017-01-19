/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author primaananda
 */
public class TabunganDeposito extends Tabungan{
    private String noRek;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");  
    private Date date = new Date(); 
    private Date tglDeposito = new Date();

    public TabunganDeposito(String nama) {
        super(nama);
    }
    
    public TabunganDeposito(String nama, String noRek, int saldo, String tglDeposito) throws ParseException {
        super(nama);
        this.noRek = noRek;
        this.tglDeposito = dateFormat.parse(tglDeposito);
        setSaldo(saldo);
        this.logBook = "Saldo awal"+saldo;
    }
    
    @Override
    public void kredit(int kredit){
        if((selisihWaktu(tglDeposito, date) >= 365)){
            setSaldo(getSaldo()-kredit);
            this.logBook = "User telah mengambil uang sebanyak "+kredit+" saldo sekarang "+getSaldo();
            System.out.println(getLogBook());
        }else{
            System.out.println("maaf deposito harus setahun");
        }
    }
    
    public int selisihWaktu(Date waktu1, Date waktu2){
        double selisihw = Math.abs(waktu1.getTime()-waktu2.getTime());
        double selisihhari = selisihw/(24*60*60*1000);
        return (int)selisihhari;
    }
    public void siasia(){
        System.out.println(selisihWaktu(tglDeposito, date));
    }
    
    public String getTanggal() {  
        return dateFormat.format(date);  
    } 
}
