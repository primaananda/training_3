/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_6.Jurnal_2;

/**
 *
 * @author PrimaAnanda-PC
 */
public class KelasMK {
    private String namamatakuliah;
    private Mahasiswa[] daftarMahasiswa;
    private int nMahasiswa = 0;

    public KelasMK(int maxMahasiswa) {
        daftarMahasiswa[nMahasiswa] = new Mahasiswa(maxMahasiswa);
        nMahasiswa++;
    }
    
    public void tambahMahasiswa(Mahasiswa m){
        
    }
}
