/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.util.Date;

/**
 *
 * @author adita
 */

//kelas ini merepresentasikan pengembalian buku yang berisi tanggal, isbn, dan durasi peminjaman
public class PengembalianBuku {
    private Date tanggal;
    private String isbn;
    private int durasiPeminjaman;
    
    //konstruktor untuk membuat objek PengembalianBuku dengan parameter tanggal dan durasi peminjaman
    public PengembalianBuku(Date tanggal, int durasiPeminjaman){
        this.tanggal = tanggal;
        this.durasiPeminjaman = durasiPeminjaman;
    }
    
    //getter dan setter tanggal
    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    //getter dan setter DurasiPeminjaman
    public int getDurasiPeminjaman() {
        return durasiPeminjaman;
    }

    public void setDurasiPeminjaman(int durasi) {
        this.durasiPeminjaman = durasi;
    }
    
    //getter dan setter isbn
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
}
