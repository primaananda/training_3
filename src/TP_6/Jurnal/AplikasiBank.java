/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_6.Jurnal;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author primaananda
 */
public class AplikasiBank {
    private static Scanner input = new Scanner(System.in);
    private static int nomor_rekening;  
    private static boolean cek;
    private static double jumlah;
    private static int pil;
    
    static int inputNoRek(){
        System.out.print("Input No Rek : ");
        cek = false;
        while(cek == false){
            try {
                int rek = input.nextInt();
                nomor_rekening = rek;
                cek = true;
            } catch (Exception e) {
                System.out.println(e.getMessage()+" - masukan harus angka");
            } finally {
                input = new Scanner(System.in);
            }
        }
        return nomor_rekening;
    }
    
    static double inputJumlah(){
        System.out.print("Input jumlah uang : ");
        cek = false;
        while (cek == false){
            try {
                double jum = input.nextDouble();
                jumlah = jum;
                cek = true;
            } catch (Exception e) {
                System.out.println(e.getMessage()+" - masukan harus bernilai double");
            } finally {
                input = new Scanner(System.in);
            }
        }
        return jumlah;
    }
    
    static int inputMenu(){
        cek = false;
        while(cek != true){
            System.out.println("\n0. Keluar");
            System.out.println("1. Buat Akun Baru");
            System.out.println("2. Cari Akun");
            System.out.println("3. Tabung");
            System.out.println("4. Tarik Tunai");
            System.out.println("5. Print Semua Akun");
            System.out.print("\nMasukan Pilihan : ");
            try{
                pil = input.nextInt();
                if (pil < 0 || pil >5){
                    throw new RuntimeException(" ->masukan harus 0-5");
                }
                    cek = true;
                
            }catch (InputMismatchException e){
                System.out.println(e.getMessage()+"masukan harus angka");
            }catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
        }
        return pil;
    }
    
    public static void main(String[] args) {
        Rekening nasabahAktif = null;
        Bank bank = new Bank(10);
        boolean ceknilai = false;
        int pilihan, cari, carinorek, norek;
        double juml;
        
        while (ceknilai != true) {
            pilihan = inputMenu();
            switch (pilihan){
                case 0 :
                    nasabahAktif = null;
                    break;
                case 1 :
                    try {
                        norek = inputNoRek();
                        juml = inputJumlah();
                        Rekening a = new Rekening(norek, juml);
                        bank.tambahNasabah(a);
                        System.out.println("Sukses");
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2 :
                    System.out.print("Nasabah : ");
                    cari = inputNoRek();
                    if (bank.cariNasabah(cari) != null) {
                        nasabahAktif = bank.cariNasabah(cari);
                        System.out.println("Nasabah : "+nasabahAktif);
                    }else{
                        System.out.println("Nasabah tidak ditemukan");
                    }
                    System.out.println("Sukses");
                    break;
                case 3 : 
                    try{
                        juml = inputJumlah();
                        nasabahAktif.Tabung(juml);
                    }catch (NullPointerException e){
                        System.out.println(e.getMessage());
                    }catch (InputMismatchException ey){
                        System.out.println(ey.getMessage());
                    } catch (IllegalArgumentException ex){
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 4 :
                    try {
                        juml = inputJumlah();
                        nasabahAktif.ambil(juml);
                    } catch (NullPointerException e) {
                        System.out.println(e.getMessage()+" -> cari rekening dulu");
                    } catch (InputMismatchException ey){
                        System.out.println(ey.getMessage());
                    } catch (IllegalArgumentException e1){
                        System.out.println(e1.getMessage());
                    }
                    break;
                case 5 :
                    System.out.println(nasabahAktif.toString());
                    break;
                default : System.out.println("pilih lagi");
            }
        }
        
    }
}
