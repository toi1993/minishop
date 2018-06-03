package com.minishop.entity;

import java.util.List;

/**
 * @author ToiTD
 */
public class NhanVien {

    private String tenNhanVien;
    private String diaChi;
    private int tuoi;
    private GiamDoc giamDoc;
    private List<String> list;

    public NhanVien() {

    }

    public NhanVien(GiamDoc giamDoc) {

    }

    public NhanVien(String tenNhanVien, String diaChi, int tuoi) {
        this.tenNhanVien = tenNhanVien;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
    }

    public NhanVien(String tenNhanVien, String diaChi) {
        this.tenNhanVien = tenNhanVien;
        this.diaChi = diaChi;
    }

    public NhanVien creatNhanVien() {
        NhanVien nhanVien = new NhanVien();
        nhanVien.setTenNhanVien("abc");
        return nhanVien;
    }


    public void getThongBao() {
        System.out.println("Hello ban" + tenNhanVien);
        System.out.println("Hello ban" + tuoi);
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
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

    public GiamDoc getGiamDoc() {
        return giamDoc;
    }

    public void setGiamDoc(GiamDoc giamDoc) {
        this.giamDoc = giamDoc;
    }

}
