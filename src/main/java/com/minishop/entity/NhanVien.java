package com.minishop.entity;

import javax.persistence.*;

/**
 * @author ToiTD
 */
@Entity
@Table(name = "nhanvien")
public class NhanVien {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idNhanVien;

    @Column(name = "tenNhanVien")
    private String tenNhanVien;

    @Column(name = "tuoi")
    private int tuoi;

    @Column(name = "address")
    private String address;

    public NhanVien() {
    }

    public NhanVien(int idNhanVien, String tenNhanVien, int tuoi, String address) {
        this.idNhanVien = idNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.tuoi = tuoi;
        this.address = address;
    }

    public int getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(int idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
