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

// Kelas ini mempresentasikan buku dalam perpustakaan yang berisi informasi mengenai buku seperti isbn, judul, pengarang dan ketersediaan.
// Serta terdapat metode untuk menambah dan menghapus buku dari koleksi perpustakaan

public class Buku {
    private String isbn;
    private String judul;
    private String pengarang;
    private boolean ketersediaan;

    //konstruktor untuk membuat objek dengan parameter isbn, judul, pengarang dan ketersediaan
    public Buku(String isbn, String judul, String pengarang, boolean ketersediaan){
        this.isbn = isbn;
        this.judul = judul;
        this.pengarang = pengarang;
        this.ketersediaan = ketersediaan;
        
    }
    
    //konstruktor untuk membuat objek dengan parameter isbn, judul, pengarang dan nomorISBN
    public Buku(String isbn, String judul, String pengarang, String nomorISBN){
        this.isbn = isbn;
        this.judul = judul;
        this.pengarang = pengarang;
    }
    
    // getter dan setter judul buku
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
    
    //getter dan setter pengarang
    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    //getter dan setter isbn
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    //getter dan setter ketersiaan buku
    public boolean isKetersediaan() {
        return ketersediaan;
    }

    public void setKetersediaan(boolean ketersediaan) {
        this.ketersediaan = ketersediaan;
    }
    
    //metode untuk menambah koleksi buku di perpustakaan
    public void menambahKoleksi(){
        System.out.println("ISBN        : " + isbn);
        System.out.println("Judul       : " + judul);
        System.out.println("Pengarang   : " + pengarang);
    }
    
    //metode untuk menghapus koleksi buku di perpustakaan
    public void menghapusKoleksi(){
        
    }
}
