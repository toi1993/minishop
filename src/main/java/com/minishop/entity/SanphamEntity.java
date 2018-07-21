package com.minishop.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by HP 8300 on 7/21/2018.
 */
@Entity
@Table(name = "sanpham", schema = "dbminishop", catalog = "")
public class SanphamEntity {
    private int masanpham;
    private String tensanpham;
    private String giatien;
    private String mota;
    private String hinhsanpham;
    private String gianhcho;
    private Collection<ChitietkhuyenmaiEntity> chitietkhuyenmaisByMasanpham;
    private Collection<ChitietsanphamEntity> chitietsanphamsByMasanpham;
    private DanhmucsanphamEntity danhmucsanphamByMadanhmuc;

    @Id
    @Column(name = "masanpham")
    public int getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(int masanpham) {
        this.masanpham = masanpham;
    }

    @Basic
    @Column(name = "tensanpham")
    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    @Basic
    @Column(name = "giatien")
    public String getGiatien() {
        return giatien;
    }

    public void setGiatien(String giatien) {
        this.giatien = giatien;
    }

    @Basic
    @Column(name = "mota")
    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    @Basic
    @Column(name = "hinhsanpham")
    public String getHinhsanpham() {
        return hinhsanpham;
    }

    public void setHinhsanpham(String hinhsanpham) {
        this.hinhsanpham = hinhsanpham;
    }

    @Basic
    @Column(name = "gianhcho")
    public String getGianhcho() {
        return gianhcho;
    }

    public void setGianhcho(String gianhcho) {
        this.gianhcho = gianhcho;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SanphamEntity that = (SanphamEntity) o;

        if (masanpham != that.masanpham) return false;
        if (tensanpham != null ? !tensanpham.equals(that.tensanpham) : that.tensanpham != null) return false;
        if (giatien != null ? !giatien.equals(that.giatien) : that.giatien != null) return false;
        if (mota != null ? !mota.equals(that.mota) : that.mota != null) return false;
        if (hinhsanpham != null ? !hinhsanpham.equals(that.hinhsanpham) : that.hinhsanpham != null) return false;
        if (gianhcho != null ? !gianhcho.equals(that.gianhcho) : that.gianhcho != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = masanpham;
        result = 31 * result + (tensanpham != null ? tensanpham.hashCode() : 0);
        result = 31 * result + (giatien != null ? giatien.hashCode() : 0);
        result = 31 * result + (mota != null ? mota.hashCode() : 0);
        result = 31 * result + (hinhsanpham != null ? hinhsanpham.hashCode() : 0);
        result = 31 * result + (gianhcho != null ? gianhcho.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "sanphamByMasanpham")
    public Collection<ChitietkhuyenmaiEntity> getChitietkhuyenmaisByMasanpham() {
        return chitietkhuyenmaisByMasanpham;
    }

    public void setChitietkhuyenmaisByMasanpham(Collection<ChitietkhuyenmaiEntity> chitietkhuyenmaisByMasanpham) {
        this.chitietkhuyenmaisByMasanpham = chitietkhuyenmaisByMasanpham;
    }

    @OneToMany(mappedBy = "sanphamByMasanpham")
    public Collection<ChitietsanphamEntity> getChitietsanphamsByMasanpham() {
        return chitietsanphamsByMasanpham;
    }

    public void setChitietsanphamsByMasanpham(Collection<ChitietsanphamEntity> chitietsanphamsByMasanpham) {
        this.chitietsanphamsByMasanpham = chitietsanphamsByMasanpham;
    }

    @ManyToOne
    @JoinColumn(name = "madanhmuc", referencedColumnName = "madanhmuc")
    public DanhmucsanphamEntity getDanhmucsanphamByMadanhmuc() {
        return danhmucsanphamByMadanhmuc;
    }

    public void setDanhmucsanphamByMadanhmuc(DanhmucsanphamEntity danhmucsanphamByMadanhmuc) {
        this.danhmucsanphamByMadanhmuc = danhmucsanphamByMadanhmuc;
    }
}
