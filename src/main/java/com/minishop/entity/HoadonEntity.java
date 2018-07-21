package com.minishop.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by HP 8300 on 7/21/2018.
 */
@Entity
@Table(name = "hoadon", schema = "dbminishop", catalog = "")
public class HoadonEntity {
    private int mahoadon;
    private String tenkhachhang;
    private String sodt;
    private String diachigiaohang;
    private Byte tinhtrang;
    private String ngaylap;
    private Collection<ChitiethoadonEntity> chitiethoadonsByMahoadon;

    @Id
    @Column(name = "mahoadon")
    public int getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(int mahoadon) {
        this.mahoadon = mahoadon;
    }

    @Basic
    @Column(name = "tenkhachhang")
    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    @Basic
    @Column(name = "sodt")
    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    @Basic
    @Column(name = "diachigiaohang")
    public String getDiachigiaohang() {
        return diachigiaohang;
    }

    public void setDiachigiaohang(String diachigiaohang) {
        this.diachigiaohang = diachigiaohang;
    }

    @Basic
    @Column(name = "tinhtrang")
    public Byte getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(Byte tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    @Basic
    @Column(name = "ngaylap")
    public String getNgaylap() {
        return ngaylap;
    }

    public void setNgaylap(String ngaylap) {
        this.ngaylap = ngaylap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HoadonEntity that = (HoadonEntity) o;

        if (mahoadon != that.mahoadon) return false;
        if (tenkhachhang != null ? !tenkhachhang.equals(that.tenkhachhang) : that.tenkhachhang != null) return false;
        if (sodt != null ? !sodt.equals(that.sodt) : that.sodt != null) return false;
        if (diachigiaohang != null ? !diachigiaohang.equals(that.diachigiaohang) : that.diachigiaohang != null)
            return false;
        if (tinhtrang != null ? !tinhtrang.equals(that.tinhtrang) : that.tinhtrang != null) return false;
        if (ngaylap != null ? !ngaylap.equals(that.ngaylap) : that.ngaylap != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mahoadon;
        result = 31 * result + (tenkhachhang != null ? tenkhachhang.hashCode() : 0);
        result = 31 * result + (sodt != null ? sodt.hashCode() : 0);
        result = 31 * result + (diachigiaohang != null ? diachigiaohang.hashCode() : 0);
        result = 31 * result + (tinhtrang != null ? tinhtrang.hashCode() : 0);
        result = 31 * result + (ngaylap != null ? ngaylap.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "hoadonByMahoadon")
    public Collection<ChitiethoadonEntity> getChitiethoadonsByMahoadon() {
        return chitiethoadonsByMahoadon;
    }

    public void setChitiethoadonsByMahoadon(Collection<ChitiethoadonEntity> chitiethoadonsByMahoadon) {
        this.chitiethoadonsByMahoadon = chitiethoadonsByMahoadon;
    }
}
