package app;

import java.util.Scanner;
import models.Buku;

/**
 * @author Raihan
 */
public class main {
    
    private static Buku cariBuku(Buku[] koleksi, String judulCari) { 
        for (Buku b : koleksi) { 
            if (b.judul.equalsIgnoreCase(judulCari)) {
                return b;
            }
        }
        return null; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Buku[] koleksi = new Buku[5]; 
        koleksi[0] = new Buku("Cara memasak", "Raihan", "1930", false); 
        koleksi[1] = new Buku("Bumi Manusia", "Pramoedya Ananta Toer", "1980", false); 
        koleksi[2] = new Buku("Laskar Pelangi", "Andrea Hiratai", "2005", false); 
        koleksi[3] = new Buku("Filosofi Teras", "Henry Manamping", "2018", false); 
        koleksi[4] = new Buku("Madilo", "Tan Malaka", "1943", false); 
        
        int pilihan;
        
        do {
            System.out.println("\n===== SISTEM PERPUSTAKAAN =====");
            System.out.println("1. Lihat semua Buku"); 
            System.out.println("2. Cari Buku berdasarkan judul"); 
            System.out.println("3. Pinjam Buku"); 
            System.out.println("4. Kembalikan Buku"); 
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            
            if (input.hasNextInt()) {
                pilihan = input.nextInt();
                input.nextLine(); 
            } else {
                System.out.println("\n[ERROR] Input tidak valid. Harap masukkan angka menu.");
                input.nextLine(); 
                pilihan = -1; 
            }
            
            String judulCari;
            Buku bukuDitemukan;

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Daftar Buku ---"); 
                    for(Buku b : koleksi) { 
                        b.tampilkanDataBuku();
                    }
                    System.out.println("\nTekan enter untuk melanjutkan...");
                    input.nextLine();
                    break;

                case 2:
                    System.out.print("Masukkan judul Buku yang dicari: "); 
                    judulCari = input.nextLine();
                    bukuDitemukan = cariBuku(koleksi, judulCari);
                    
                    if (bukuDitemukan != null) {
                        System.out.println("\n--- Hasil Pencarian ---");
                        bukuDitemukan.tampilkanDataBuku();
                    } else {
                        System.out.println("\n[INFO] Buku tidak ditemukan");
                    }
                    break;
                    
                case 3:
                    System.out.print("Masukkan judul Buku yang ingin dipinjam: "); 
                    judulCari = input.nextLine();
                    bukuDitemukan = cariBuku(koleksi, judulCari);
                    
                    if (bukuDitemukan != null) {
                        if (bukuDitemukan.pinjam()) {
                            System.out.println("\n[SUKSES] Buku \"" + judulCari + "\" berhasil dipinjam."); 
                        } else {
                            System.out.println("\n[GAGAL] Buku \"" + judulCari + "\" sudah/sedang dipinjam."); 
                        }
                    } else {
                        System.out.println("\n[INFO] Buku tidak ditemukan.");
                    }
                    break;
                    
                case 4:
                    System.out.print("Masukkan judul Buku yang dikembalikan: "); 
                    judulCari = input.nextLine();
                    bukuDitemukan = cariBuku(koleksi, judulCari);
                    
                    if (bukuDitemukan != null) {
                        if (bukuDitemukan.kembalikan()) {
                            System.out.println("\n[SUKSES] Buku \"" + judulCari + "\" berhasil dikembalikan."); 
                        } else {
                            System.out.println("\n[GAGAL] Buku \"" + judulCari + "\" tidak sedang dipinjam."); 
                        }
                    } else {
                        System.out.println("\n[INFO] Buku tidak ditemukan.");
                    }
                    break;

                case 0:
                    System.out.println("Keluar dari sistem. Terima kasih!");
                    break;

                default:
                    if (pilihan != -1) {
                         System.out.println("Pilihan tidak valid! Masukkan angka antara 0-4.");
                    }
            }

        } while (pilihan != 0);
        
        input.close();
    }
    
}
