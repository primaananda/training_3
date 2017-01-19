/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP_2;

/**
 *
 * @author primaananda
 */
public class MahasiswaNIM {
    private String nama;
    private String nim;
    private double uts;
    private double uas;
    private double tugas;
    private char indeksMK;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double getTugas() {
        return tugas;
    }

    public void setTugas(double tugas) {
        this.tugas = tugas;
    }

    public char getIndeksMK() {
        return indeksMK;
    }

    public void setIndeksMK(double temp) {
        if (100 >= temp && temp>= 80) {
            this.indeksMK = 'A';
        }else if(80 > temp && temp>= 75){
            this.indeksMK = 'A';
        }else if (75 > temp && temp>= 70){
            this.indeksMK = 'B';
        }else if (70 > temp && temp>= 40){
            this.indeksMK = 'C';
        }else if (40 > temp && temp>= 30){
            this.indeksMK = 'D';
        }else{
            this.indeksMK = 'E';
        }
    }
    
    public void hitungIndeks(){
        double temp;
        temp = (0.4*getUas())+(0.4*getUas())+(0.2*getTugas());
        setIndeksMK(temp);
    }

    @Override
    public String toString() {
        return "MahasiswaNIM{" + "nama=" + getNama() + ", nim=" + getNim() + ", uts=" + getUts() + ", uas=" + getUas() + ", tugas=" + getTugas() + ", indeksMK=" + getIndeksMK() + '}';
    }

    
    
}
