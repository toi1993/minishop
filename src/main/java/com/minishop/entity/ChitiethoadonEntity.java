package com.minishop.entity;

import javax.persistence.*;

/**
 * Created by HP 8300 on 7/21/2018.
 */
@Entity
@Table(name = "chitiethoadon", schema = "dbminishop", catalog = "")
@IdClass(ChitiethoadonEntityPK.class)
public class ChitiethoadonEntity {
    private int mahoadon;
    private int machitietsanpham;
    private Integer soluong;
    private String giatien;
    private HoadonEntity hoadonByMahoadon;
    private ChitietsanphamEntity chitietsanphamByMachitietsanpham;

    @Id
    @Column(name = "mahoadon")
    public int getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(int mahoadon) {
        this.mahoadon = mahoadon;
    }

    @Id
    @Column(name = "machitietsanpham")
    public int getMachitietsanpham() {
        return machitietsanpham;
    }

    public void setMachitietsanpham(int machitietsanpham) {
        this.machitietsanpham = machitietsanpham;
    }

    @Basic
    @Column(name = "soluong")
    public Integer getSoluong() {
        return soluong;
    }

    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    @Basic
    @Column(name = "giatien")
    public String getGiatien() {
        return giatien;
    }

    public void setGiatien(String giatien) {
        this.giatien = giatien;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChitiethoadonEntity that = (ChitiethoadonEntity) o;

        if (mahoadon != that.mahoadon) return false;
        if (machitietsanpham != that.machitietsanpham) return false;
        if (soluong != null ? !soluong.equals(that.soluong) : that.soluong != null) return false;
        if (giatien != null ? !giatien.equals(that.giatien) : that.giatien != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mahoadon;
        result = 31 * result + machitietsanpham;
        result = 31 * result + (soluong != null ? soluong.hashCode() : 0);
        result = 31 * result + (giatien != null ? giatien.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "mahoadon", referencedColumnName = "mahoadon", nullable = false)
    public HoadonEntity getHoadonByMahoadon() {
        return hoadonByMahoadon;
    }

    public void setHoadonByMahoadon(HoadonEntity hoadonByMahoadon) {
        this.hoadonByMahoadon = hoadonByMahoadon;
    }

    @ManyToOne
    @JoinColumn(name = "machitietsanpham", referencedColumnName = "machitietsanpham", nullable = false)
    public ChitietsanphamEntity getChitietsanphamByMachitietsanpham() {
        return chitietsanphamByMachitietsanpham;
    }

    public void setChitietsanphamByMachitietsanpham(ChitietsanphamEntity chitietsanphamByMachitietsanpham) {
        this.chitietsanphamByMachitietsanpham = chitietsanphamByMachitietsanpham;
    }
}
