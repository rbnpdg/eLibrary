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
public class Pustakawan {
    private String id;
    private String nama;
    
    public Pustakawan(String id, String nama){
        this.id = id;
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void tambahBuku(Buku buku, List<Buku> daftarBuku) {
        daftarBuku.add(buku);
        System.out.println("Buku dengan judul " + buku.getJudul() + " berhasil ditambahkan.");
    }
    
    public void hapusBuku (Buku buku){
        
    }
}
