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
    @NamedQuery(name = "Chitietkhuyenmai.findAll", query = "SELECT c FROM Chitietkhuyenmai c")
    , @NamedQuery(name = "Chitietkhuyenmai.findByMakhuyenmai", query = "SELECT c FROM Chitietkhuyenmai c WHERE c.chitietkhuyenmaiPK.makhuyenmai = :makhuyenmai")
    , @NamedQuery(name = "Chitietkhuyenmai.findByMasanpham", query = "SELECT c FROM Chitietkhuyenmai c WHERE c.chitietkhuyenmaiPK.masanpham = :masanpham")
    , @NamedQuery(name = "Chitietkhuyenmai.findByGiagia", query = "SELECT c FROM Chitietkhuyenmai c WHERE c.giagia = :giagia")})
public class Chitietkhuyenmai implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ChitietkhuyenmaiPK chitietkhuyenmaiPK;
    private Integer giagia;
    @JoinColumn(name = "masanpham", referencedColumnName = "masanpham", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Sanpham sanpham;

    public Chitietkhuyenmai() {
    }

    public Chitietkhuyenmai(ChitietkhuyenmaiPK chitietkhuyenmaiPK) {
        this.chitietkhuyenmaiPK = chitietkhuyenmaiPK;
    }

    public Chitietkhuyenmai(int makhuyenmai, int masanpham) {
        this.chitietkhuyenmaiPK = new ChitietkhuyenmaiPK(makhuyenmai, masanpham);
    }

    public ChitietkhuyenmaiPK getChitietkhuyenmaiPK() {
        return chitietkhuyenmaiPK;
    }

    public void setChitietkhuyenmaiPK(ChitietkhuyenmaiPK chitietkhuyenmaiPK) {
        this.chitietkhuyenmaiPK = chitietkhuyenmaiPK;
    }

    public Integer getGiagia() {
        return giagia;
    }

    public void setGiagia(Integer giagia) {
        this.giagia = giagia;
    }

    public Sanpham getSanpham() {
        return sanpham;
    }

    public void setSanpham(Sanpham sanpham) {
        this.sanpham = sanpham;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chitietkhuyenmaiPK != null ? chitietkhuyenmaiPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chitietkhuyenmai)) {
            return false;
        }
        Chitietkhuyenmai other = (Chitietkhuyenmai) object;
        if ((this.chitietkhuyenmaiPK == null && other.chitietkhuyenmaiPK != null) || (this.chitietkhuyenmaiPK != null && !this.chitietkhuyenmaiPK.equals(other.chitietkhuyenmaiPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Chitietkhuyenmai[ chitietkhuyenmaiPK=" + chitietkhuyenmaiPK + " ]";
    }
    
}
