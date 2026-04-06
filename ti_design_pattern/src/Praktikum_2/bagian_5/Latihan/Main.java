package Praktikum_2.bagian_5.Latihan;

public class Main {
    public static void main(String[] args){

        // Object dengan default constructor
        Barang barang1 = new Barang();

        // Object dengan parameterized constructor
        Barang barang2 = new Barang("Laptop", 7500000);

        // Menampilkan data
        barang1.tampilkanInfo();
        barang2.tampilkanInfo();
    }
}
