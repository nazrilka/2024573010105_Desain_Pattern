package Praktikum_2.bagian_5.Latihan;

public class Barang {
    String namaBarang;
    double harga;

    // Default Constructor
    public Barang() {
        namaBarang = "Tidak diketahui";
        harga = 0;
    }

    // Parameterized Constructor
    public Barang(String namaBarang, double harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    // Method untuk menampilkan info
    public void tampilkanInfo() {
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga: " + harga);
        System.out.println();
    }
}

