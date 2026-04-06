package Praktikum_2.bagian_3.Latihan;

public class Main {
    public static void main(String[] args) {

        AkunBank akun = new AkunBank();

        // Mengisi saldo lewat method
        akun.setSaldo(1000000);

        // Menampilkan saldo
        akun.tampilkanSaldo();

        // Coba akses langsung (INI AKAN ERROR)
        // System.out.println(akun.saldo);
    }
}