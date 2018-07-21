package com.minishop.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by HP 8300 on 7/21/2018.
 */
@Entity
@Table(name = "chitietsanpham", schema = "dbminishop", catalog = "")
public class ChitietsanphamEntity {
    private int machitietsanpham;
    private Integer soluong;
    private String ngaynhap;
    private Collection<ChitiethoadonEntity> chitiethoadonsByMachitietsanpham;
    private SanphamEntity sanphamByMasanpham;
    private SizesanphamEntity sizesanphamByMasize;
    private MausanphamEntity mausanphamByMamau;

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
    @Column(name = "ngaynhap")
    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChitietsanphamEntity that = (ChitietsanphamEntity) o;

        if (machitietsanpham != that.machitietsanpham) return false;
        if (soluong != null ? !soluong.equals(that.soluong) : that.soluong != null) return false;
        if (ngaynhap != null ? !ngaynhap.equals(that.ngaynhap) : that.ngaynhap != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = machitietsanpham;
        result = 31 * result + (soluong != null ? soluong.hashCode() : 0);
        result = 31 * result + (ngaynhap != null ? ngaynhap.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "chitietsanphamByMachitietsanpham")
    public Collection<ChitiethoadonEntity> getChitiethoadonsByMachitietsanpham() {
        return chitiethoadonsByMachitietsanpham;
    }

    public void setChitiethoadonsByMachitietsanpham(Collection<ChitiethoadonEntity> chitiethoadonsByMachitietsanpham) {
        this.chitiethoadonsByMachitietsanpham = chitiethoadonsByMachitietsanpham;
    }

    @ManyToOne
    @JoinColumn(name = "masanpham", referencedColumnName = "masanpham")
    public SanphamEntity getSanphamByMasanpham() {
        return sanphamByMasanpham;
    }

    public void setSanphamByMasanpham(SanphamEntity sanphamByMasanpham) {
        this.sanphamByMasanpham = sanphamByMasanpham;
    }

    @ManyToOne
    @JoinColumn(name = "masize", referencedColumnName = "masize")
    public SizesanphamEntity getSizesanphamByMasize() {
        return sizesanphamByMasize;
    }

    public void setSizesanphamByMasize(SizesanphamEntity sizesanphamByMasize) {
        this.sizesanphamByMasize = sizesanphamByMasize;
    }

    @ManyToOne
    @JoinColumn(name = "mamau", referencedColumnName = "mamau")
    public MausanphamEntity getMausanphamByMamau() {
        return mausanphamByMamau;
    }

    public void setMausanphamByMamau(MausanphamEntity mausanphamByMamau) {
        this.mausanphamByMamau = mausanphamByMamau;
    }
}
