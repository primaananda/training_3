package TP_1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author primaananda
 */
public class TP_1 {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
        BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pwr = new PrintWriter(System.out, true);
        System.out.print("Nama          : ");
//        String nama = scanner.nextLine();
        String nama;
        nama = rdr.readLine();
        boolean nim3 = false;
        int nim2 = 0;
        do {            
            System.out.print("NIM           : ");
    //        String nim = scanner.nextLine();
            String nim = rdr.readLine();
            try {
                nim2 = Integer.parseInt(nim);
                nim3 = true;
            } catch (Exception e) {
                System.out.println("masukan anda bukan angka");
            }    
        } while (nim3 == false);
        System.out.print("Tanggal Lahir : ");
//        String ttl = scanner.nextLine();
        String ttl = rdr.readLine();
        pwr.println("");
        pwr.println("Nama                   : "+nama);
        pwr.println("NIM                    : "+nim2);
        pwr.println("Tempat Tanggal Lahir   : "+ttl);
    }
}
