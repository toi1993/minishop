package com.minishop.entity;

/**
 * @author ToiTD
 */
public class NhanVien {

    private String tenNhanVien;
    private String diaChi;
    private int tuoi;

    public NhanVien() {
    }

    public void getThongBao() {
        System.out.println("Hello ban"+tenNhanVien);
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
}
