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
public class Honorer extends Dosen{
    int honorPerSKS;

    public Honorer(int salary, String departemen, List<MatKulAjar> listMataKuliah, String nama, String alamat, String ttl, int telepon) {
        super(departemen, listMataKuliah, nama, alamat, ttl, telepon);
        this.honorPerSKS = salary;
    }

    public int getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public List<MatKulAjar> getListMataKuliah() {
        return listMataKuliah;
    }

    public void setListMataKuliah(List<MatKulAjar> listMataKuliah) {
        this.listMataKuliah = listMataKuliah;
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
        return "Honorer{" + "nama=" + nama + ", alamat=" + alamat + ", ttl=" + ttl + ", telepon=" + telepon + "nik=" + nik + "departemen=" + departemen + ", listMataKuliah=" + listMataKuliah + "honorPerSKS=" + honorPerSKS + '}';
    }
    
    
}
