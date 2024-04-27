package org.example;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Pasien> daftarPasien;

    public Database() {
        this.daftarPasien = new ArrayList<>();
    }

    // Metode untuk menambah data pasien
    public void tambahPasien(Pasien pasien) {
        // Periksa apakah NIK sudah ada dalam database
        for (Pasien p : daftarPasien) {
            if (p.getNIK() == pasien.getNIK()) {
                System.out.println("NIK sudah ada dalam database. Tidak dapat menambahkan pasien.");
                return;
            }
        }
        // Jika NIK belum ada, tambahkan pasien ke database
        daftarPasien.add(pasien);
        System.out.println("Pasien berhasil ditambahkan.");
    }

    // Metode untuk mengambil data pasien
    public Pasien getPasienByNIK(long NIK) {
        for (Pasien p : daftarPasien) {
            if (p.getNIK() == NIK) {
                return p;
            }
        }
        return null;
    }

    // Metode untuk memperbarui data pasien
    public void updatePasien(long NIK, Pasien newPasien) {
        for (int i = 0; i < daftarPasien.size(); i++) {
            if (daftarPasien.get(i).getNIK() == NIK) {
                daftarPasien.set(i, newPasien);
                System.out.println("Data pasien berhasil diperbarui.");
                return;
            }
        }
        System.out.println("Data pasien tidak ditemukan.");
    }

    // Metode untuk menghapus data pasien
    public void hapusPasien(long NIK) {
        for (int i = 0; i < daftarPasien.size(); i++) {
            if (daftarPasien.get(i).getNIK() == NIK) {
                daftarPasien.remove(i);
                System.out.println("Data pasien berhasil dihapus.");
                return;
            }
        }
        System.out.println("Data pasien tidak ditemukan.");
    }

    // Metode untuk mendapatkan daftar pasien
    public List<Pasien> getDaftarPasien() {
        return daftarPasien;
    }
}
