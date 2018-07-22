/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minishop.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/**
 *
 * @author HP 8300
 */
@Entity
@Table(catalog = "dbminishop", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Khuyenmai.findAll", query = "SELECT k FROM Khuyenmai k")
    , @NamedQuery(name = "Khuyenmai.findByMakhuyenmai", query = "SELECT k FROM Khuyenmai k WHERE k.makhuyenmai = :makhuyenmai")
    , @NamedQuery(name = "Khuyenmai.findByTenkhuyenmai", query = "SELECT k FROM Khuyenmai k WHERE k.tenkhuyenmai = :tenkhuyenmai")
    , @NamedQuery(name = "Khuyenmai.findByThoigianbardau", query = "SELECT k FROM Khuyenmai k WHERE k.thoigianbardau = :thoigianbardau")
    , @NamedQuery(name = "Khuyenmai.findByThoigianketthuc", query = "SELECT k FROM Khuyenmai k WHERE k.thoigianketthuc = :thoigianketthuc")})
public class Khuyenmai implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer makhuyenmai;
    @Column(length = 200)
    private String tenkhuyenmai;
    @Column(length = 50)
    private String thoigianbardau;
    @Column(length = 50)
    private String thoigianketthuc;
    @Lob
    @Column(length = 65535)
    private String mota;
    @Lob
    @Column(length = 65535)
    private String hinhkhuyenmai;

    public Khuyenmai() {
    }

    public Khuyenmai(Integer makhuyenmai) {
        this.makhuyenmai = makhuyenmai;
    }

    public Integer getMakhuyenmai() {
        return makhuyenmai;
    }

    public void setMakhuyenmai(Integer makhuyenmai) {
        this.makhuyenmai = makhuyenmai;
    }

    public String getTenkhuyenmai() {
        return tenkhuyenmai;
    }

    public void setTenkhuyenmai(String tenkhuyenmai) {
        this.tenkhuyenmai = tenkhuyenmai;
    }

    public String getThoigianbardau() {
        return thoigianbardau;
    }

    public void setThoigianbardau(String thoigianbardau) {
        this.thoigianbardau = thoigianbardau;
    }

    public String getThoigianketthuc() {
        return thoigianketthuc;
    }

    public void setThoigianketthuc(String thoigianketthuc) {
        this.thoigianketthuc = thoigianketthuc;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getHinhkhuyenmai() {
        return hinhkhuyenmai;
    }

    public void setHinhkhuyenmai(String hinhkhuyenmai) {
        this.hinhkhuyenmai = hinhkhuyenmai;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (makhuyenmai != null ? makhuyenmai.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Khuyenmai)) {
            return false;
        }
        Khuyenmai other = (Khuyenmai) object;
        if ((this.makhuyenmai == null && other.makhuyenmai != null) || (this.makhuyenmai != null && !this.makhuyenmai.equals(other.makhuyenmai))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Khuyenmai[ makhuyenmai=" + makhuyenmai + " ]";
    }
    
}
