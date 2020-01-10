/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.afifradityanugraha.latihanmvc.model;

import edu.afifradityanugraha.latihanmvc.event.PelangganListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Aradnu
 */
public class PelangganModel {

    private String nama;
    private String email;
    private String noTelp;

    private PelangganListener PelangganListener;

    public PelangganListener getPelangganListener() {
        return PelangganListener;
    }

    public void setPelangganListener(PelangganListener PelangganListener) {
        this.PelangganListener = PelangganListener;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
        fireOnChange();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        fireOnChange();
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
        fireOnChange();
    }

    protected void fireOnChange() {
        if (PelangganListener != null) {
            PelangganListener.onChange(this);
        }

    }

    public void resetForm() {
        setNama("");
        setEmail("");
        setNoTelp("");

    }

    public void simpanForm() {
        JOptionPane.showMessageDialog(null, "Berhasil Disimpan");
        resetForm();
    }

}
