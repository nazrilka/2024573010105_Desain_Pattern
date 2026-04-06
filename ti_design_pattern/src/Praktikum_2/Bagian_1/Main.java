package Praktikum_2.Bagian_1;

public class Main {
    public static  void main (String[] args) {
        //Membuat objek dari class Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa();

        //Mengisi niai atribut
        mhs1.nama = "Nazril";
        mhs1.umur = 20;

        //Menampilkan nilai atribut
        System.out.println("Nama: " + mhs1.nama);
        System.out.println("Nama: " + mhs1.umur);
    }

}
