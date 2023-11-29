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
public class PengembalianBuku {
    private Date tanggal;
    private String isbn;
    private int durasiPeminjaman;
    
    public PengembalianBuku(Date tanggal, int durasiPeminjaman){
        this.tanggal = tanggal;
        this.durasiPeminjaman = durasiPeminjaman;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public int getDurasiPeminjaman() {
        return durasiPeminjaman;
    }

    public void setDurasiPeminjaman(int durasi) {
        this.durasiPeminjaman = durasi;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
}
