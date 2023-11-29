/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.util.List;

/**
 *
 * @author adita
 */

//kelas ini merepresentasikan pustakawan yang berisi informasi yaitu id dan nama pustakawan
//serta terdapat metode tambah buku dan hapus buku
public class Pustakawan {
    private String id;
    private String nama;
    
    //konstruktor untuk membuat objek Pustakawan dengan parameter id dan nama
    public Pustakawan(String id, String nama){
        this.id = id;
        this.nama = nama;
    }
    
    //getter dan setter nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    //getter dan setter id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    //metode untuk menambahkan buku dari perpustakaan
    public void tambahBuku(Buku buku, List<Buku> daftarBuku) {
        daftarBuku.add(buku);
        System.out.println("Buku dengan judul " + buku.getJudul() + " berhasil ditambahkan.");
    }
    
    //metode untuk menghapus buku dari perpustakaan
    public void hapusBuku (Buku buku){
        
    }
}
