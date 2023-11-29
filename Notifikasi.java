/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

/**
 *
 * @author adita
 */

//kelas ini merepresentasikan notifikasi untuk dikirim ke anggota oleh pustakawan yang berisi judul dan isi notifikasi
public class Notifikasi {
    private String judul;
    private String isi;

    ///konstruktor untuk membuat objek dengan parameter judul dan isi
    public Notifikasi(String judul, String isi) {
        this.judul = judul;
        this.isi = isi;
    }    
    
    //getter dan setter judul
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    //getter dan setter isi
    public String getIsi() {
        return isi;
    }

    public void setIsi(String isi) {
        this.isi = isi;
    }
    
    //metode untuk menampilkan judul dan isi notifikasi
    public void mengirimNotifikasi(){
        System.out.println(judul);
        System.out.println(isi);
    }
}
