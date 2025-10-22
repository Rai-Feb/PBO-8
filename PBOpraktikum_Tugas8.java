/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbopraktikum_tugas8;

import java.util.Scanner;
import models.Book;

/**
 *
 * @author Raihan
 */
public class pbopraktikum_tugas8 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Data Buku
        Book[] koleksi = new Book[5];
        koleksi[0] = new Book("Mein Kamf", "Raihan", "1930", false);
        koleksi[1] = new Book("Bumi Manusia", "Pramoedya Ananta Toer", "1980", false);
        koleksi[2] = new Book("Laskar Pelangi", "Andrea Hiratai", "2005", false);
        koleksi[3] = new Book("Filosofi Teras", "Henry Manamping", "2018", false);
        koleksi[4] = new Book("Madilog", "Tan Malaka", "1943", false);
        
        int pilihan;
        
        do {
            System.out.println("\n===== SISTEM PERPUSTAKAAN =====");
            System.out.println("1. Lihat semua Book");
            System.out.println("2. Cari Book berdasarkan judul");
            System.out.println("3. Pinjam Book");
            System.out.println("4. Kembalikan Book");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Daftar Book ---");
                    // Lakukan perulangan untuk tampilkan info buku disini
                    for(Book b : koleksi) {
                        b.tampilkanDataBuku();
                    }
                    System.out.println("\n Tekan enter untuk melanjutkan...");
                    input.nextLine();
                    break;

                case 2:
                    System.out.print("Masukkan judul Book yang dicari: ");
                    String cari = input.nextLine();
                    boolean ditemukan = false;
                    
                    // Lakukan logika untuk mencari buku disini
                    for(Book b : koleksi){
                        if(b.judul.equalsIgnoreCase(cari)){
                            b.tampilkanDataBuku();
                            ditemukan = true;
                            break;
                        }
                    }
                    if(!ditemukan) {
                        System.out.println("Buku tidak ditemukan");
                    }

		    break;
                    
                case 3:
                    System.out.print("Masukkan judul Book yang ingin dipinjam: ");
                    String pinjam = input.nextLine();
                    boolean ada = false;
                    
                    // Lakukan logika untuk meminjam buku disini
                    
                    break;
                case 4:
                    System.out.print("Masukkan judul Book yang dikembalikan: ");
                    String kembali = input.nextLine();
                    boolean ditemukanKembali = false;
                    
                    // Silakan masukan logika untuk mengembalikan buku disini
                    
                    break;

                case 0:
                    System.out.println("Keluar dari sistem...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);
        
        input.close();
    }
    
}