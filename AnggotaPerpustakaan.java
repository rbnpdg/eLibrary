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
public class AnggotaPerpustakaan {
    private String nama;
    private String nomoranggota;
    private String alamat;
    private List<PeminjamanBuku> riwayat;
    
    public AnggotaPerpustakaan(String nama, String nomoranggota, String alamat, List<PeminjamanBuku> sejarahpeminjaman){
        this.nama = nama;
        this.nomoranggota = nomoranggota;
        this.alamat = alamat;
        this.riwayat = riwayat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomoranggota() {
        return nomoranggota;
    }

    public void setNomoranggota(String nomoranggota) {
        this.nomoranggota = nomoranggota;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public List<PeminjamanBuku> getRiwayat() {
        return riwayat;
    }

    public void setRiwayat(List<PeminjamanBuku> riwayat) {
        this.riwayat = riwayat;
    }
    
    public void cariBuku(Buku buku) {
        
    }
}
