

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dee
 */
public interface TPModul6 {

    /**
     * mengembalikan nama mahasiswa
     *
     * @return
     */
    public String getNama();

    /**
     * mengembalikan nim mahasiswa
     *
     * @return
     */
    public String getNIM();

    /**
     * mengeset angka pertama yang akan dihitung
     *
     * @param angka1
     */
    public void setAngka1(double angka1);

    /**
     * mengeset angka kedua yang akan dihitung
     *
     * @param angka2
     */
    public void setAngka2(double angka2);

    /**
     * mengembalikan hasil penambahan angka1 dengan angka2
     *
     * @return angka1 + angka2
     */
    public double tambah();

    /**
     * mengembalikan hasil pengurangan angka1 dengan angka2
     *
     * @return angka1 - angka2
     */
    public double kurang();

    /**
     * mengembalikan hasil pengalian angka1 dengan angka2
     *
     * @return angka1 * angka2
     */
    public double kali();

    /**
     * mengembalikan hasil pembagian angka1 dengan angka2
     *
     * @return angka1 / angka2
     */
    public double bagi();

}
