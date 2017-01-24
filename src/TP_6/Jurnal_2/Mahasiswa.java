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
public class Mahasiswa {
    private int nim;
    private double uts, uas, quis;

    public Mahasiswa(int nim) {
        try {
            if (nim <0 && String.valueOf(nim).length() != 11) {
                throw new IllegalArgumentException();
            }
            this.nim = nim;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()+"-> terdapat error");
        }
    }

    public void setUts(double uts) {
        try {
            if (uts < 0 || uts > 100) {
                throw new IllegalArgumentException();
            }
            this.uts = uts;
        } catch (Exception e) {
            System.out.println(e.getMessage()+"-> terdapat error");
        }
    }

    public void setUas(double uas) {
        try {
            if (uas < 0 || uas > 100) {
                throw new IllegalArgumentException();
            }
            this.uas = uas;
        } catch (Exception e) {
            System.out.println(e.getMessage()+"-> terdapat error");
        }
    }

    public void setQuis(double quis) {
        try {
            if (quis < 0 || quis > 100) {
                throw new IllegalArgumentException();
            }
            this.quis = quis;
        } catch (Exception e) {
            System.out.println(e.getMessage()+"-> terdapat error");
        }
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", uts=" + uts + ", uas=" + uas + ", quis=" + quis + '}';
    }
}
