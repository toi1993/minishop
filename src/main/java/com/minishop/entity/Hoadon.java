/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minishop.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author HP 8300
 */
@Entity
@Table(catalog = "dbminishop", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hoadon.findAll", query = "SELECT h FROM Hoadon h")
    , @NamedQuery(name = "Hoadon.findByMahoadon", query = "SELECT h FROM Hoadon h WHERE h.mahoadon = :mahoadon")
    , @NamedQuery(name = "Hoadon.findByTenkhachhang", query = "SELECT h FROM Hoadon h WHERE h.tenkhachhang = :tenkhachhang")
    , @NamedQuery(name = "Hoadon.findBySodt", query = "SELECT h FROM Hoadon h WHERE h.sodt = :sodt")
    , @NamedQuery(name = "Hoadon.findByDiachigiaohang", query = "SELECT h FROM Hoadon h WHERE h.diachigiaohang = :diachigiaohang")
    , @NamedQuery(name = "Hoadon.findByTinhtrang", query = "SELECT h FROM Hoadon h WHERE h.tinhtrang = :tinhtrang")
    , @NamedQuery(name = "Hoadon.findByNgaylap", query = "SELECT h FROM Hoadon h WHERE h.ngaylap = :ngaylap")})
public class Hoadon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer mahoadon;
    @Column(length = 100)
    private String tenkhachhang;
    @Column(length = 12)
    private String sodt;
    @Column(length = 200)
    private String diachigiaohang;
    private Short tinhtrang;
    @Column(length = 50)
    private String ngaylap;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hoadon")
    private List<Chitiethoadon> chitiethoadonList;

    public Hoadon() {
    }

    public Hoadon(Integer mahoadon) {
        this.mahoadon = mahoadon;
    }

    public Integer getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(Integer mahoadon) {
        this.mahoadon = mahoadon;
    }

    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    public String getSodt() {
        return sodt;
    }

    public void setSodt(String sodt) {
        this.sodt = sodt;
    }

    public String getDiachigiaohang() {
        return diachigiaohang;
    }

    public void setDiachigiaohang(String diachigiaohang) {
        this.diachigiaohang = diachigiaohang;
    }

    public Short getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(Short tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public String getNgaylap() {
        return ngaylap;
    }

    public void setNgaylap(String ngaylap) {
        this.ngaylap = ngaylap;
    }

    @XmlTransient
    public List<Chitiethoadon> getChitiethoadonList() {
        return chitiethoadonList;
    }

    public void setChitiethoadonList(List<Chitiethoadon> chitiethoadonList) {
        this.chitiethoadonList = chitiethoadonList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mahoadon != null ? mahoadon.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hoadon)) {
            return false;
        }
        Hoadon other = (Hoadon) object;
        if ((this.mahoadon == null && other.mahoadon != null) || (this.mahoadon != null && !this.mahoadon.equals(other.mahoadon))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Hoadon[ mahoadon=" + mahoadon + " ]";
    }
    
}
