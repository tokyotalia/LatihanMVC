/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Mena
 */
public abstract class Staff extends User{
    protected int nik;

    public Staff(String nama, String alamat, String ttl, int telepon) {
        super(nama, alamat, ttl, telepon);
    }

}
