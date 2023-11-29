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
public class PeminjamanBuku {
    private Date tanggal;
    private String isbn;
    private int durasi;
    
    public PeminjamanBuku(Date tanggal, int durasi){
        this.tanggal = tanggal;
        this.durasi = durasi;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public int getDurasi() {
        return durasi;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
}
