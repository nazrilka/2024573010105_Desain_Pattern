package Praktikum_2.bagian_5;

import java.security.PublicKey;

public class Person {
    private String nama;
    private int umur;

    //Default Constructor
    public Person(){
        nama = "Unknown";
        umur = 0;
    }

    //Parameterize Constructor
    public Person(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    //method
    public void tampilkanInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Nama: " + umur);
    }
}
