package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Buat instance dari Database
        Database db = new Database();

        // Contoh menambahkan data pasien
        Pasien pasien1 = new Pasien("John Doe", "Jl. Merdeka No. 123", 123456789012345L, new Date(2000, 6, 15));
        db.tambahPasien(pasien1);

        // Contoh mengambil data pasien
        Pasien pasien2 = db.getPasienByNIK(123456789012345L);
        if (pasien2 != null) {
            System.out.println("Data Pasien:");
            System.out.println("Nama: " + pasien2.getNama());
            System.out.println("Alamat: " + pasien2.getAlamat());
            System.out.println("NIK: " + pasien2.getNIK());
            System.out.println("Tanggal Lahir: " + pasien2.formatTanggal());
        }

        // Contoh memperbarui data pasien
        Pasien pasienBaru = new Pasien("Jane Doe", "Jl. Maju No. 456", 123456789012345L, new Date(1995, 10, 20));
        db.updatePasien(123456789012345L, pasienBaru);

        // Contoh menghapus data pasien
        db.hapusPasien(123456789012345L);
    }
}
