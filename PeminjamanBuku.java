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

//kelas ini merepresentasikan peminjaman buku yang berisi tanggal pinjam, isbn, dan durasi peminjaman
public class PeminjamanBuku {
    private Date tanggal;
    private String isbn;
    private int durasi;
    
    //konstruktor untuk membuat objek PeminjamanBuku dengan parameter tanggal dan durasi
    public PeminjamanBuku(Date tanggal, int durasi){
        this.tanggal = tanggal;
        this.durasi = durasi;
    }
    
    //getter dan setter tanggal
    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
    
    //getter dan setter durasi
    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }
    
    //getter dan setter isbn
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
}
