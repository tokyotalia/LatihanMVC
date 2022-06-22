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
public class Magister extends Mahasiswa {
    List<MatKulAmbil> listMataKuliah;
    String judulPenelitianTesis;
    

    public Magister(List<MatKulAmbil> listMataKuliah, String judulPenelitianTesis, int nim, String jurusan, String nama, String alamat, String ttl, int telepon) {
        super(nim, jurusan, nama, alamat, ttl, telepon);
        this.listMataKuliah = listMataKuliah;
        this.judulPenelitianTesis = judulPenelitianTesis;
    }

    public List<MatKulAmbil> getListMataKuliah() {
        return listMataKuliah;
    }

    public void setListMataKuliah(List<MatKulAmbil> listMataKuliah) {
        this.listMataKuliah = listMataKuliah;
    }

    public String getJudulPenelitianTesis() {
        return judulPenelitianTesis;
    }

    public void setJudulPenelitianTesis(String judulPenelitianTesis) {
        this.judulPenelitianTesis = judulPenelitianTesis;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
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
        return "Magister{" + "nama=" + nama + ", alamat=" + alamat + 
                ", ttl=" + ttl + ", telepon=" + telepon + "nim=" + nim + 
                ", jurusan=" + jurusan + "listMataKuliah=" + listMataKuliah 
                + ", judulPenelitianTesis=" + judulPenelitianTesis + '}';
    }

    
    
}
