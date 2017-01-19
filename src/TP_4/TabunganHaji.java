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
public class TabunganHaji extends Tabungan{
    private String noRek;

    public TabunganHaji(String noRek, String nama,int saldo) {
        super(nama);
        this.noRek = noRek;
        setSaldo(saldo);
        this.logBook = "Saldo awal"+saldo;
    }
    
    public int lihatSaldo(){
        return getSaldo();
    }

    @Override
    public void kredit(int kredit) {
        if ((kredit >= 10) && (kredit <= 100 )) {
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

    @Override
    public void debit(int debit) {
        setSaldo(getSaldo()+debit);
        this.logBook = "User telah nemabahkan saldo sebanyak "+debit+" saldo sekarang "+getSaldo();
        System.out.println(getLogBook());
        if (getSaldo()>=2500) {
            remainderHaji();
        }
    }
    
    public void remainderHaji(){
        System.out.println("Saldo Sudah cukup untuk untuk DP haji");
    }
}
