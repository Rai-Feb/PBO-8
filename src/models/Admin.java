package models;

public class Admin {
    private String idAdmin;
    private String nama;
    
    public Admin(String idAdmin, String nama) {
        this.idAdmin = idAdmin;
        this.nama = nama;
    }
    
    public String getIdAdmin() {
        return idAdmin;
    }
    
    public String getNama() {
        return nama;
    }

    public void tampilkanInfo() {
        System.out.println("ID Admin: " + idAdmin + ", Nama: " + nama);
    }
}