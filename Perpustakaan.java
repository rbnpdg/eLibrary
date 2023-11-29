/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author adita
 */
public class Perpustakaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data Pustakawan
        System.out.print("Masukkan ID Pustakawan: ");
        String idPustakawan = scanner.nextLine();
        System.out.print("Masukkan Nama Pustakawan: ");
        String namaPustakawan = scanner.nextLine();

        Pustakawan pustakawan = new Pustakawan(idPustakawan, namaPustakawan);
        List<Buku> daftarBuku = new ArrayList<>();
        List<AnggotaPerpustakaan> daftarAnggota = new ArrayList<>();
        List<PeminjamanBuku> daftarPeminjaman = new ArrayList<>();
        List<PengembalianBuku> daftarPengembalian = new ArrayList<>();
        List<Notifikasi> daftarNotifikasi = new ArrayList<>();
        
        int menu;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Manajemen Anggota");
            System.out.println("2. Manajemen Buku");
            System.out.println("3. Peminjaman Buku");
            System.out.println("4. Pengembalian Buku");
            System.out.println("5. Riwayat Peminjaman");
            System.out.println("6. Notifikasi");
            System.out.println("7. Cari Buku");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu : ");
            menu = scanner.nextInt();
            scanner.nextLine();  // Menangani newline character setelah nextInt

            switch (menu) {
                case 1:
                    // Menu Anggota
                    int pilihanAnggota;
                    do {
                        System.out.println("\nMenu Anggota:");
                        System.out.println("1. Tambah Anggota");
                        System.out.println("2. Edit Anggota");
                        System.out.println("3. Hapus Anggota");
                        System.out.println("4. Lihat Anggota");
                        System.out.println("5. Kembali ke Menu Utama");
                        System.out.print("Pilih menu : ");
                        pilihanAnggota = scanner.nextInt();
                        scanner.nextLine();  // Menangani newline character setelah nextInt

                        switch (pilihanAnggota) {
                            case 1:
                                // Tambah Anggota
                                System.out.print("Masukkan Nama Anggota: ");
                                String namaAnggota = scanner.nextLine();
                                System.out.print("Masukkan Nomor Anggota: ");
                                String nomorAnggota = scanner.nextLine();
                                System.out.print("Masukkan Alamat Anggota: ");
                                String alamatAnggota = scanner.nextLine();

                                AnggotaPerpustakaan anggota = new AnggotaPerpustakaan(namaAnggota, nomorAnggota, alamatAnggota, new ArrayList<>());
                                daftarAnggota.add(anggota);
                                System.out.println("Anggota berhasil ditambahkan.");
                                break;

                            case 2:
                                // Edit Anggota
                                System.out.print("Masukkan Nomor Anggota yang akan diedit: ");
                                String nomorAnggotaEdit = scanner.nextLine();

                                AnggotaPerpustakaan anggotaEdit = null;
                                for (AnggotaPerpustakaan anggotaTemp : daftarAnggota) {
                                    if (anggotaTemp.getNomoranggota().equals(nomorAnggotaEdit)) {
                                        anggotaEdit = anggotaTemp;
                                        break;
                                    }
                                }

                                if (anggotaEdit != null) {
                                    System.out.print("Masukkan Nama Baru: ");
                                    String namaBaru = scanner.nextLine();
                                    System.out.print("Masukkan Alamat Baru: ");
                                    String alamatBaru = scanner.nextLine();

                                    anggotaEdit.setNama(namaBaru);
                                    anggotaEdit.setAlamat(alamatBaru);
                                    System.out.println("Anggota berhasil diedit.");
                                } else {
                                    System.out.println("Nomor Anggota tidak ditemukan.");
                                }
                                break;

                            case 3:
                                // Hapus Anggota
                                System.out.print("Masukkan Nomor Anggota yang akan dihapus: ");
                                String nomorAnggotaHapus = scanner.nextLine();

                                AnggotaPerpustakaan anggotaHapus = null;
                                for (AnggotaPerpustakaan anggotaTemp : daftarAnggota) {
                                    if (anggotaTemp.getNomoranggota().equals(nomorAnggotaHapus)) {
                                        anggotaHapus = anggotaTemp;
                                        break;
                                    }
                                }

                                if (anggotaHapus != null) {
                                    daftarAnggota.remove(anggotaHapus);
                                    System.out.println("Anggota berhasil dihapus.");
                                } else {
                                    System.out.println("Nomor Anggota tidak ditemukan.");
                                }
                                break;

                            case 4:
                                // Lihat Anggota
                                System.out.println("\nDaftar Anggota yang Telah Ditambahkan:");
                                for (AnggotaPerpustakaan anggotaTemp : daftarAnggota) {
                                    System.out.println("Nama Anggota: " + anggotaTemp.getNama());
                                    System.out.println("Nomor Anggota: " + anggotaTemp.getNomoranggota());
                                    System.out.println("Alamat: " + anggotaTemp.getAlamat());
                                    System.out.println("----------------------------");
                                }
                                break;

                            case 5:
                                System.out.println("Kembali ke Menu Utama.");
                                break;

                            default:
                                System.out.println("Pilihan tidak valid.");
                        }
                    } while (pilihanAnggota != 5);
                    break;

                case 2:
                    // Menu Buku
                    int pilihanBuku;
                    do {
                        System.out.println("\nMenu Buku:");
                        System.out.println("1. Tambah Buku");
                        System.out.println("2. Edit Buku");
                        System.out.println("3. Hapus Buku");
                        System.out.println("4. Lihat Buku");
                        System.out.println("5. Kembali ke Menu Utama");
                        System.out.print("Pilih menu : ");
                        pilihanBuku = scanner.nextInt();
                        scanner.nextLine();  // Menangani newline character setelah nextInt

                        switch (pilihanBuku) {
                            case 1:
                                // Tambah Buku
                                System.out.print("Masukkan ISBN Buku: ");
                                String isbnBuku = scanner.nextLine();
                                System.out.print("Masukkan Judul Buku: ");
                                String judulBuku = scanner.nextLine();
                                System.out.print("Masukkan Pengarang Buku: ");
                                String pengarangBuku = scanner.nextLine();

                                Buku buku = new Buku(isbnBuku, judulBuku, pengarangBuku, true);
                                daftarBuku.add(buku);
                                System.out.println("Buku berhasil ditambahkan.");
                                break;

                            case 2:
                                // Edit Buku
                                System.out.print("Masukkan ISBN Buku yang akan diedit: ");
                                String isbnBukuEdit = scanner.nextLine();

                                Buku bukuEdit = null;
                                for (Buku bukuTemp : daftarBuku) {
                                    if (bukuTemp.getIsbn().equals(isbnBukuEdit)) {
                                        bukuEdit = bukuTemp;
                                        break;
                                    }
                                }

                                if (bukuEdit != null) {
                                    System.out.print("Masukkan Judul Baru: ");
                                    String judulBaru = scanner.nextLine();
                                    System.out.print("Masukkan Pengarang Baru: ");
                                    String pengarangBaru = scanner.nextLine();

                                    bukuEdit.setJudul(judulBaru);
                                    bukuEdit.setPengarang(pengarangBaru);
                                    System.out.println("Buku berhasil diedit.");
                                } else {
                                    System.out.println("ISBN Buku tidak ditemukan.");
                                }
                                break;

                            case 3:
                                // Hapus Buku
                                System.out.print("Masukkan ISBN Buku yang akan dihapus: ");
                                String isbnBukuHapus = scanner.nextLine();

                                Buku bukuHapus = null;
                                for (Buku bukuTemp : daftarBuku) {
                                    if (bukuTemp.getIsbn().equals(isbnBukuHapus)) {
                                        bukuHapus = bukuTemp;
                                        break;
                                    }
                                }

                                if (bukuHapus != null) {
                                    daftarBuku.remove(bukuHapus);
                                    System.out.println("Buku berhasil dihapus.");
                                } else {
                                    System.out.println("ISBN Buku tidak ditemukan.");
                                }
                                break;

                            case 4:
                                // Lihat Buku
                                System.out.println("\nDaftar Buku yang Telah Ditambahkan:");
                                for (Buku bukuTemp : daftarBuku) {
                                    System.out.println("ISBN: " + bukuTemp.getIsbn());
                                    System.out.println("Judul: " + bukuTemp.getJudul());
                                    System.out.println("Pengarang: " + bukuTemp.getPengarang());
                                    System.out.println("Ketersediaan: " + (bukuTemp.isKetersediaan() ? "Tersedia" : "Tidak Tersedia"));
                                    System.out.println("----------------------------");
                                }
                                break;

                            case 5:
                                System.out.println("Kembali ke Menu Utama.");
                                break;

                            default:
                                System.out.println("Pilihan tidak valid.");
                        }
                    } while (pilihanBuku != 5);
                    break;

                case 3:
                    // Peminjaman Buku
                    System.out.print("Masukkan Nomor Anggota: ");
                    String nomorAnggotaPeminjaman = scanner.nextLine();
                    System.out.print("Masukkan ISBN Buku yang Dipinjam: ");
                    String isbnPeminjaman = scanner.nextLine();
                    System.out.print("Masukkan Durasi Peminjaman (dalam hari): ");
                    int durasiPeminjaman = scanner.nextInt();
                    scanner.nextLine();  // Menangani newline character setelah nextInt

                    AnggotaPerpustakaan anggotaPeminjaman = null;
                    for (AnggotaPerpustakaan anggotaTemp : daftarAnggota) {
                        if (anggotaTemp.getNomoranggota().equals(nomorAnggotaPeminjaman)) {
                            anggotaPeminjaman = anggotaTemp;
                            break;
                        }
                    }

                    if (anggotaPeminjaman != null) {
                        // Memeriksa apakah riwayat peminjaman tidak null sebelum mengakses
                        if (anggotaPeminjaman.getRiwayat() == null) {
                            anggotaPeminjaman.setRiwayat(new ArrayList<>());
                        }

                        Buku bukuPeminjaman = null;
                        for (Buku bukuTemp : daftarBuku) {
                            if (bukuTemp.getIsbn().equals(isbnPeminjaman) && bukuTemp.isKetersediaan()) {
                                bukuPeminjaman = bukuTemp;
                                bukuTemp.setKetersediaan(false);
                                break;
                            }
                        }

                        if (bukuPeminjaman != null) {
                            Date tanggalPeminjaman = new Date();
                            PeminjamanBuku peminjaman = new PeminjamanBuku(tanggalPeminjaman, durasiPeminjaman);
                            peminjaman.setIsbn(isbnPeminjaman);
                            anggotaPeminjaman.getRiwayat().add(peminjaman);
                            System.out.println("Peminjaman berhasil dilakukan.");
                        } else {
                            System.out.println("Buku tidak tersedia atau ISBN tidak valid.");
                        }
                    } else {
                        System.out.println("Nomor Anggota tidak valid.");
                    }
                    break;

                case 4:
                    // Pengembalian Buku
                    System.out.print("Masukkan ISBN Buku yang Dikembalikan: ");
                    String isbnPengembalian = scanner.nextLine();
                    System.out.print("Masukkan Durasi Peminjaman (dalam hari): ");
                    int durasiPengembalian = scanner.nextInt();
                    scanner.nextLine();  // Menangani newline character setelah nextInt

                    PengembalianBuku pengembalian = new PengembalianBuku(new Date(), durasiPengembalian);
                    pengembalian.setIsbn(isbnPengembalian);
                    daftarPengembalian.add(pengembalian);

                    for (Buku bukuTemp : daftarBuku) {
                        if (bukuTemp.getIsbn().equals(isbnPengembalian)) {
                            bukuTemp.setKetersediaan(true);
                            break;
                        }
                    }

                    System.out.println("Pengembalian berhasil dilakukan.");
                    break;

                case 5:
                     // Menampilkan Riwayat Peminjaman
                    System.out.println("\nRiwayat Peminjaman:");

    System.out.print("Masukkan Nomor Anggota: ");
    String nomorAnggotaRiwayat = scanner.nextLine();

    AnggotaPerpustakaan anggotaRiwayat = null;
    for (AnggotaPerpustakaan anggotaTemp : daftarAnggota) {
        if (anggotaTemp.getNomoranggota().equals(nomorAnggotaRiwayat)) {
            anggotaRiwayat = anggotaTemp;
            break;
        }
    }

    if (anggotaRiwayat != null) {
        List<PeminjamanBuku> riwayatPeminjaman = anggotaRiwayat.getRiwayat();
        for (PeminjamanBuku peminjamanTemp : riwayatPeminjaman) {
            System.out.println("Tanggal Peminjaman: " + peminjamanTemp.getTanggal());
            System.out.println("ISBN Buku: " + peminjamanTemp.getIsbn());
            System.out.println("Durasi Peminjaman: " + peminjamanTemp.getDurasi() + " hari");
            System.out.println("----------------------------");
        }
    } else {
        System.out.println("Nomor Anggota tidak valid.");
    }
    break;

                case 6:
                    // Notifikasi
                    System.out.print("Masukkan Judul Notifikasi: ");
                    String judulNotifikasi = scanner.nextLine();
                    System.out.print("Masukkan Isi Notifikasi: ");
                    String isiNotifikasi = scanner.nextLine();

                    Notifikasi notifikasi = new Notifikasi(judulNotifikasi, isiNotifikasi);
                    daftarNotifikasi.add(notifikasi);
                    notifikasi.mengirimNotifikasi();
                    break;
                
                case 7:
                    // Cari Buku berdasarkan ISBN
                    System.out.print("Masukkan ISBN Buku yang ingin dicari: ");
                    String isbnCari = scanner.nextLine();

                    Buku bukuCari = null;
                    for (Buku bukuTemp : daftarBuku) {
                        if (bukuTemp.getIsbn().equals(isbnCari)) {
                            bukuCari = bukuTemp;
                            break;
                        }
                    }

                    if (bukuCari != null) {
                        System.out.println("\nBuku ditemukan:");
                        System.out.println("ISBN: " + bukuCari.getIsbn());
                        System.out.println("Judul: " + bukuCari.getJudul());
                        System.out.println("Pengarang: " + bukuCari.getPengarang());
                        System.out.println("Ketersediaan: " + (bukuCari.isKetersediaan() ? "Tersedia" : "Tidak Tersedia"));
                    } else {
                        System.out.println("Buku dengan ISBN " + isbnCari + " tidak ditemukan.");
                    }
                    break;    
                    
                case 8:
                    System.out.println("Terima Kasih sudah menggunakan E-Library");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (menu != 8);

    }
}
