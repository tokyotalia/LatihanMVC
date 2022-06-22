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
public abstract class Dosen extends Staff{
    protected String departemen;
    protected List<MatKulAjar> listMataKuliah;

    public Dosen(String departemen, List<MatKulAjar> listMataKuliah, String nama, String alamat, String ttl, int telepon) {
        super(nama, alamat, ttl, telepon);
        this.departemen = departemen;
        this.listMataKuliah = listMataKuliah;
    }

}
