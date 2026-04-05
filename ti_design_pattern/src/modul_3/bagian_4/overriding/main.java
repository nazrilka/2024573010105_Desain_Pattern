package modul_3.bagian_4.overriding;

import laporan1.HelloWorld;

public class main {
    public static void main(String[] args){
        Hewan hewan1 = new kucing();
        Hewan hewan2 = new anjing();

        hewan1.bersuara();
        hewan2.bersuara();
    }
}
