package Crc;

import java.util.Scanner;

public class Mahasiswa {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        String nim;
        String nama;
        String kelas;
        String alamat;
        String no_hp;

        System.out.println("-------------------------------");
        System.out.println("Welcome to Kampus Muda Mendunia");
        System.out.println("-------------------------------");
        System.out.println("Masukkan NIM Anda : ");
        nim = x.next();
        System.out.println("Masukkan Nama Anda : ");
        nama = x.next();
        System.out.println("Masukkan Kelas : ");
        kelas = x.next();
        System.out.println("Masukkan alamat Anda : ");
        alamat = x.next();
        System.out.println("Masukkan Nomor Hp Anda : ");
        no_hp = x.next();

        System.out.println("=================================");
        System.out.println("Data Mahasiswa\nNIM : " + nim + "Nama : " + nama + "kelas : " + kelas + "Alamat : " + alamat
                + "No.Hp : " + no_hp);

    }

}
