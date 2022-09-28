/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum6;

/**
 *
 * @author Praktikan
 */
public class Praktikum6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        
        mhs1.nama = "Wangsa";
        mhs1.npm = "2117051086";
        
//        System.out.println("Nama :" + mhs1.nama);
//        System.out.println("Npm :" + mhs1.npm);
        
        mhs1.insertNilaiUas(90);
        mhs1.insertNilaiUts(90);
        
        mhs1.dataMhs();
    }
    
}
