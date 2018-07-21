package com.minishop.entity;

import javax.persistence.*;

/**
 * Created by HP 8300 on 7/21/2018.
 */
@Entity
@Table(name = "khuyenmai", schema = "dbminishop", catalog = "")
public class KhuyenmaiEntity {
    private int makhuyenmai;
    private String tenkhuyenmai;
    private String thoigianbardau;
    private String thoigianketthuc;
    private String mota;
    private String hinhkhuyenmai;

    @Id
    @Column(name = "makhuyenmai")
    public int getMakhuyenmai() {
        return makhuyenmai;
    }

    public void setMakhuyenmai(int makhuyenmai) {
        this.makhuyenmai = makhuyenmai;
    }

    @Basic
    @Column(name = "tenkhuyenmai")
    public String getTenkhuyenmai() {
        return tenkhuyenmai;
    }

    public void setTenkhuyenmai(String tenkhuyenmai) {
        this.tenkhuyenmai = tenkhuyenmai;
    }

    @Basic
    @Column(name = "thoigianbardau")
    public String getThoigianbardau() {
        return thoigianbardau;
    }

    public void setThoigianbardau(String thoigianbardau) {
        this.thoigianbardau = thoigianbardau;
    }

    @Basic
    @Column(name = "thoigianketthuc")
    public String getThoigianketthuc() {
        return thoigianketthuc;
    }

    public void setThoigianketthuc(String thoigianketthuc) {
        this.thoigianketthuc = thoigianketthuc;
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
    @Column(name = "hinhkhuyenmai")
    public String getHinhkhuyenmai() {
        return hinhkhuyenmai;
    }

    public void setHinhkhuyenmai(String hinhkhuyenmai) {
        this.hinhkhuyenmai = hinhkhuyenmai;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KhuyenmaiEntity that = (KhuyenmaiEntity) o;

        if (makhuyenmai != that.makhuyenmai) return false;
        if (tenkhuyenmai != null ? !tenkhuyenmai.equals(that.tenkhuyenmai) : that.tenkhuyenmai != null) return false;
        if (thoigianbardau != null ? !thoigianbardau.equals(that.thoigianbardau) : that.thoigianbardau != null)
            return false;
        if (thoigianketthuc != null ? !thoigianketthuc.equals(that.thoigianketthuc) : that.thoigianketthuc != null)
            return false;
        if (mota != null ? !mota.equals(that.mota) : that.mota != null) return false;
        if (hinhkhuyenmai != null ? !hinhkhuyenmai.equals(that.hinhkhuyenmai) : that.hinhkhuyenmai != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = makhuyenmai;
        result = 31 * result + (tenkhuyenmai != null ? tenkhuyenmai.hashCode() : 0);
        result = 31 * result + (thoigianbardau != null ? thoigianbardau.hashCode() : 0);
        result = 31 * result + (thoigianketthuc != null ? thoigianketthuc.hashCode() : 0);
        result = 31 * result + (mota != null ? mota.hashCode() : 0);
        result = 31 * result + (hinhkhuyenmai != null ? hinhkhuyenmai.hashCode() : 0);
        return result;
    }
}
