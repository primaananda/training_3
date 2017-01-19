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
public class TabunganBank extends Tabungan{
    private String noRek;
    private double bunga;
    
    public TabunganBank(String nama, String noRek, int saldo) {
        super(nama);
        setSaldo(saldo);
        this.logBook = "Saldo awal"+saldo;
    }
    @Override
    public void kredit(int kredit){
        if ((kredit >= 10) && (kredit <= 250 )) {
            if(getSaldo() >= 50){
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
    public void tambahBunga(){
        int temp = (int)(getSaldo()+(getSaldo()*0.1));
        setSaldo(temp);
    }
}
