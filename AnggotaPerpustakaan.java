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

//kelas ini merepresentasikan anggota perpustakaan yang berisi informasi mengenai nama, nomor anggota, alamat dan riwayat peminjaman buku.
public class AnggotaPerpustakaan {
    private String nama;
    private String nomoranggota;
    private String alamat;
    private List<PeminjamanBuku> riwayat;
    
    //konstruktor untuk membuat objek AnggotaPerpustakaan dengan parameter nama, nomoranggota, alamat, dan sejaranpeminjaman
    public AnggotaPerpustakaan(String nama, String nomoranggota, String alamat, List<PeminjamanBuku> sejarahpeminjaman){
        this.nama = nama;
        this.nomoranggota = nomoranggota;
        this.alamat = alamat;
        this.riwayat = riwayat;
    }
    
    //getter setter nama anggota
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    //getter setter nomor anggota
    public String getNomoranggota() {
        return nomoranggota;
    }

    public void setNomoranggota(String nomoranggota) {
        this.nomoranggota = nomoranggota;
    }

    //getter setter alamat
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    //getter dan setter riwayat peminjaman buku
    public List<PeminjamanBuku> getRiwayat() {
        return riwayat;
    }

    public void setRiwayat(List<PeminjamanBuku> riwayat) {
        this.riwayat = riwayat;
    }
    
    //metode untuk mencari buku oleh anggota
    public void cariBuku(Buku buku) {
        
    }
}
