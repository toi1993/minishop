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
        @NamedQuery(name = "Chitiethoadon.findAll", query = "SELECT c FROM Chitiethoadon c")
        , @NamedQuery(name = "Chitiethoadon.findByMahoadon", query = "SELECT c FROM Chitiethoadon c WHERE c.chitiethoadonPK.mahoadon = :mahoadon")
        , @NamedQuery(name = "Chitiethoadon.findByMachitietsanpham", query = "SELECT c FROM Chitiethoadon c WHERE c.chitiethoadonPK.machitietsanpham = :machitietsanpham")
        , @NamedQuery(name = "Chitiethoadon.findBySoluong", query = "SELECT c FROM Chitiethoadon c WHERE c.soluong = :soluong")
        , @NamedQuery(name = "Chitiethoadon.findByGiatien", query = "SELECT c FROM Chitiethoadon c WHERE c.giatien = :giatien")})
public class Chitiethoadon implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ChitiethoadonPK chitiethoadonPK;
    private Integer soluong;
    @Column(length = 100)
    private String giatien;
    @JoinColumn(name = "machitietsanpham", referencedColumnName = "machitietsanpham", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Chitietsanpham chitietsanpham;
    @JoinColumn(name = "mahoadon", referencedColumnName = "mahoadon", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Hoadon hoadon;

    public Chitiethoadon() {
    }

    public Chitiethoadon(ChitiethoadonPK chitiethoadonPK) {
        this.chitiethoadonPK = chitiethoadonPK;
    }

    public Chitiethoadon(int mahoadon, int machitietsanpham) {
        this.chitiethoadonPK = new ChitiethoadonPK(mahoadon, machitietsanpham);
    }

    public ChitiethoadonPK getChitiethoadonPK() {
        return chitiethoadonPK;
    }

    public void setChitiethoadonPK(ChitiethoadonPK chitiethoadonPK) {
        this.chitiethoadonPK = chitiethoadonPK;
    }

    public Integer getSoluong() {
        return soluong;
    }

    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    public String getGiatien() {
        return giatien;
    }

    public void setGiatien(String giatien) {
        this.giatien = giatien;
    }

    public Chitietsanpham getChitietsanpham() {
        return chitietsanpham;
    }

    public void setChitietsanpham(Chitietsanpham chitietsanpham) {
        this.chitietsanpham = chitietsanpham;
    }

    public Hoadon getHoadon() {
        return hoadon;
    }

    public void setHoadon(Hoadon hoadon) {
        this.hoadon = hoadon;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (chitiethoadonPK != null ? chitiethoadonPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chitiethoadon)) {
            return false;
        }
        Chitiethoadon other = (Chitiethoadon) object;
        if ((this.chitiethoadonPK == null && other.chitiethoadonPK != null) || (this.chitiethoadonPK != null && !this.chitiethoadonPK.equals(other.chitiethoadonPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Chitiethoadon[ chitiethoadonPK=" + chitiethoadonPK + " ]";
    }

}
