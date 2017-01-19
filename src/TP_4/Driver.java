/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_4;

import java.text.ParseException;

/**
 *
 * @author primaananda
 */
public class Driver {
    public static void main(String[] args) throws ParseException {
        //<tabunganDeposito>
        System.out.println("===================== : Tabungan Deposito");
        TabunganDeposito tabungan2 = new TabunganDeposito("Prima","130", 450, "2016.01.07");
        tabungan2.kredit(40);
        System.out.println("Tanggal Deposit : 2016.01.07");
        System.out.println("Tanggal Kredit : "+tabungan2.getTanggal());
        System.out.print("Saldo anda "+tabungan2.getSaldo()+"\n");
        System.out.print("selisih : ");
        tabungan2.siasia();
        //</tabunganDeposito>
        
        //<TabunganBank>
        System.out.println("===================== : Tabungan");
        TabunganBank tabungan = new TabunganBank("Anton","Jakarta",400);
        tabungan.kredit(5);
        tabungan.kredit(60);
        tabungan.tambahBunga();
        tabungan.tambahBunga();
        System.out.println("Saldo anda : "+tabungan.getSaldo());
        //</TabunganBank>
        
        //<TabunganHaji>
        System.out.println("===================== : Tabunan Haji");
        TabunganHaji tabungan3 = new TabunganHaji("88970","Andik",2670);
        tabungan3.kredit(50);
        tabungan3.debit(30);
        System.out.print("Saldo : "+tabungan3.lihatSaldo()+"\n");
        //</TabunganHaji>
        
        //<TabunganHariTua>
        System.out.println("===================== : Tabungan Hari Tua");
        TabunganHariTua tabungan4 = new TabunganHariTua("Dito", "34512310",999999999);
        tabungan4.kredit(45);
        tabungan4.debit(45);
        System.out.print("Saldo "+tabungan4.getSaldo()+"\n");
        //</TabunganHariTua>
    }
}
