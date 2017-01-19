/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_2;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author primaananda
 */
public class DriverNIM {
    public static void main(String[] args) throws IOException {
        MahasiswaNIM mhs = new MahasiswaNIM();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nama : ");
        String nama = sc.nextLine();
        mhs.setNama(nama);
        System.out.print("NIM : ");
        String nim = sc.nextLine();
        mhs.setNim(nim);
        System.out.print("UTS : ");
        double uts = sc.nextDouble();
        mhs.setUts(uts);
        System.out.print("UAS : ");
        double uas = sc.nextDouble();
        mhs.setUas(uas);
        System.out.print("Tugas : ");
        double tugas = sc.nextDouble();
        mhs.setTugas(tugas);
        System.out.println("---");
        mhs.hitungIndeks();
        System.out.println(mhs);
        System.out.println("---");
    }
}
