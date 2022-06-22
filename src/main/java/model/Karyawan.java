/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author Mena
 */
public class Karyawan extends Staff {
    int salary;
    List<PresensiStaff> presensiStaff;

    public Karyawan(int salary, List<PresensiStaff> presensiStaff, String nama, String alamat, String ttl, int telepon) {
        super(nama, alamat, ttl, telepon);
        this.salary = salary;
        this.presensiStaff = presensiStaff;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public List<PresensiStaff> getPresensiStaff() {
        return presensiStaff;
    }

    public void setPresensiStaff(List<PresensiStaff> presensiStaff) {
        this.presensiStaff = presensiStaff;
    }

    public int getNik() {
        return nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public int getTelepon() {
        return telepon;
    }

    public void setTelepon(int telepon) {
        this.telepon = telepon;
    }

    @Override
    public String toString() {
        return "Karyawan{" + "nama=" + nama + ", alamat=" + alamat + ", ttl=" + ttl + ", telepon=" + telepon + "nik=" + nik + "salary=" + salary + ", presensiStaff=" + presensiStaff + '}';
    }
    
    
}
