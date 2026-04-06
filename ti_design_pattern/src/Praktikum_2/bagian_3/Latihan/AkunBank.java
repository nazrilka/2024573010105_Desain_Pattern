package Praktikum_2.bagian_3.Latihan;

public class AkunBank {
    // atribut private
    private double saldo;

    // method untuk set saldo (biar bisa diisi dari luar)
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // method untuk menampilkan saldo
    public void tampilkanSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}

