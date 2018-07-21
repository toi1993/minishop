package com.minishop.entity;

import javax.persistence.*;

/**
 * Created by HP 8300 on 7/21/2018.
 */
@Entity
@Table(name = "chitietkhuyenmai", schema = "dbminishop", catalog = "")
@IdClass(ChitietkhuyenmaiEntityPK.class)
public class ChitietkhuyenmaiEntity {
    private int makhuyenmai;
    private int masanpham;
    private Integer giagia;
    private SanphamEntity sanphamByMasanpham;

    @Id
    @Column(name = "makhuyenmai")
    public int getMakhuyenmai() {
        return makhuyenmai;
    }

    public void setMakhuyenmai(int makhuyenmai) {
        this.makhuyenmai = makhuyenmai;
    }

    @Id
    @Column(name = "masanpham")
    public int getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(int masanpham) {
        this.masanpham = masanpham;
    }

    @Basic
    @Column(name = "giagia")
    public Integer getGiagia() {
        return giagia;
    }

    public void setGiagia(Integer giagia) {
        this.giagia = giagia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChitietkhuyenmaiEntity that = (ChitietkhuyenmaiEntity) o;

        if (makhuyenmai != that.makhuyenmai) return false;
        if (masanpham != that.masanpham) return false;
        if (giagia != null ? !giagia.equals(that.giagia) : that.giagia != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = makhuyenmai;
        result = 31 * result + masanpham;
        result = 31 * result + (giagia != null ? giagia.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "masanpham", referencedColumnName = "masanpham", nullable = false)
    public SanphamEntity getSanphamByMasanpham() {
        return sanphamByMasanpham;
    }

    public void setSanphamByMasanpham(SanphamEntity sanphamByMasanpham) {
        this.sanphamByMasanpham = sanphamByMasanpham;
    }
}
