package com.minishop.entity;

import javax.persistence.*;

/**
 * Created by HP 8300 on 7/21/2018.
 */
@Entity
@Table(name = "nhanvien", schema = "dbminishop", catalog = "")
public class NhanvienEntity {
    private int manhanvien;
    private String hoten;
    private String diachi;
    private Byte gioitinh;
    private String cmnd;
    private String email;
    private String tendangnhap;
    private String matkhau;
    private ChucvuEntity chucvuByMachucvu;

    @Id
    @Column(name = "manhanvien")
    public int getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(int manhanvien) {
        this.manhanvien = manhanvien;
    }

    @Basic
    @Column(name = "hoten")
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    @Basic
    @Column(name = "diachi")
    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Basic
    @Column(name = "gioitinh")
    public Byte getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(Byte gioitinh) {
        this.gioitinh = gioitinh;
    }

    @Basic
    @Column(name = "cmnd")
    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "tendangnhap")
    public String getTendangnhap() {
        return tendangnhap;
    }

    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    @Basic
    @Column(name = "matkhau")
    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NhanvienEntity that = (NhanvienEntity) o;

        if (manhanvien != that.manhanvien) return false;
        if (hoten != null ? !hoten.equals(that.hoten) : that.hoten != null) return false;
        if (diachi != null ? !diachi.equals(that.diachi) : that.diachi != null) return false;
        if (gioitinh != null ? !gioitinh.equals(that.gioitinh) : that.gioitinh != null) return false;
        if (cmnd != null ? !cmnd.equals(that.cmnd) : that.cmnd != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (tendangnhap != null ? !tendangnhap.equals(that.tendangnhap) : that.tendangnhap != null) return false;
        if (matkhau != null ? !matkhau.equals(that.matkhau) : that.matkhau != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = manhanvien;
        result = 31 * result + (hoten != null ? hoten.hashCode() : 0);
        result = 31 * result + (diachi != null ? diachi.hashCode() : 0);
        result = 31 * result + (gioitinh != null ? gioitinh.hashCode() : 0);
        result = 31 * result + (cmnd != null ? cmnd.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (tendangnhap != null ? tendangnhap.hashCode() : 0);
        result = 31 * result + (matkhau != null ? matkhau.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "machucvu", referencedColumnName = "machucvu")
    public ChucvuEntity getChucvuByMachucvu() {
        return chucvuByMachucvu;
    }

    public void setChucvuByMachucvu(ChucvuEntity chucvuByMachucvu) {
        this.chucvuByMachucvu = chucvuByMachucvu;
    }
}
