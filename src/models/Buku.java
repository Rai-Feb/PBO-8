package models;

public class Buku {
    public String judul;
    public String penulis;
    public String tahunTerbit;
    private boolean isDipinjam; 

    public Buku(String judul, String penulis, String tahunTerbit, boolean isDipinjam) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.isDipinjam = isDipinjam;
    }

    public void tampilkanDataBuku() {
        String status = this.isDipinjam ? "Dipinjam" : "Tersedia";
        System.out.println("------------------------------------");
        System.out.println("Judul      : " + this.judul);
        System.out.println("Penulis    : " + this.penulis);
        System.out.println("Terbit     : " + this.tahunTerbit);
        System.out.println("Status     : " + status);
    }

    public boolean pinjam() {
        if (!this.isDipinjam) {
            this.isDipinjam = true;
            return true;
        }
        return false;
    }

    public boolean kembalikan() {
        if (this.isDipinjam) {
            this.isDipinjam = false;
            return true;
        }
        return false;
    }

    public boolean isDipinjam() {
        return isDipinjam;
    }
}
