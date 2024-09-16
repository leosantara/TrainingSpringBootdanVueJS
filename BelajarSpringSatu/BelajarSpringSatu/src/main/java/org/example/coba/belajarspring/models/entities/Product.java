package org.example.coba.belajarspring.models.entities;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "pegawai")
public class Product implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "nip", length = 12)
    private String nip;

    private String name;

    @Column(name = "tempatKerja", length = 50)
    private String Instansi;

    public Product() {
        super();
    }

    public Product(String nip, String namaPegawai, String namaInstansi) {
        this.Instansi = namaInstansi;
        this.name = namaPegawai;
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstansi() {
        return Instansi;
    }

    public void setInstansi(String Instansi) {
        this.Instansi = Instansi;
    }
}
