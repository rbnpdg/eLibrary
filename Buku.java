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
public class Buku {
    private String isbn;
    private String judul;
    private String pengarang;
    private boolean ketersediaan;
    
    public Buku(String isbn, String judul, String pengarang, boolean ketersediaan){
        this.isbn = isbn;
        this.judul = judul;
        this.pengarang = pengarang;
        this.ketersediaan = ketersediaan;
        
    }
    
    public Buku(String isbn, String judul, String pengarang, String nomorISBN){
        this.isbn = isbn;
        this.judul = judul;
        this.pengarang = pengarang;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isKetersediaan() {
        return ketersediaan;
    }

    public void setKetersediaan(boolean ketersediaan) {
        this.ketersediaan = ketersediaan;
    }
    
    public void menambahKoleksi(){
        System.out.println("ISBN        : " + isbn);
        System.out.println("Judul       : " + judul);
        System.out.println("Pengarang   : " + pengarang);
    }
    
    public void menghapusKoleksi(){
        
    }
}
