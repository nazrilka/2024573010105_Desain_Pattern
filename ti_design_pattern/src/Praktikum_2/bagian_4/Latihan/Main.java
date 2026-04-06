package Praktikum_2.bagian_4.Latihan;

public class Main {
    public static void main(String[] args){

        // Membuat object Mahasiswa
        Mahasiswa mhs = new Mahasiswa();

        // Mengisi nilai pakai setter
        mhs.setNama("Nazril");
        mhs.setNim("2024573010105");

        // Menampilkan pakai getter
        System.out.println("Nama: " + mhs.getNama());
        System.out.println("NIM: " + mhs.getNim());
    }
}
