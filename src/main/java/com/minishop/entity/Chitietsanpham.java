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
    @NamedQuery(name = "Chitietsanpham.findAll", query = "SELECT c FROM Chitietsanpham c")
    , @NamedQuery(name = "Chitietsanpham.findByMachitietsanpham", query = "SELECT c FROM Chitietsanpham c WHERE c.machitietsanpham = :machitietsanpham")
    , @NamedQuery(name = "Chitietsanpham.findBySoluong", query = "SELECT c FROM Chitietsanpham c WHERE c.soluong = :soluong")
    , @NamedQuery(name = "Chitietsanpham.findByNgaynhap", query = "SELECT c FROM Chitietsanpham c WHERE c.ngaynhap = :ngaynhap")})
public class Chitietsanpham implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer machitietsanpham;
    private Integer soluong;
    @Column(length = 50)
    private String ngaynhap;
    @JoinColumn(name = "mamau", referencedColumnName = "mamau")
    @ManyToOne
    private Mausanpham mamau;
    @JoinColumn(name = "masanpham", referencedColumnName = "masanpham")
    @ManyToOne
    private Sanpham masanpham;
    @JoinColumn(name = "masize", referencedColumnName = "masize")
    @ManyToOne
    private Sizesanpham masize;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "chitietsanpham")
    private List<Chitiethoadon> chitiethoadonList;

    public Chitietsanpham() {
    }

    public Chitietsanpham(Integer machitietsanpham) {
        this.machitietsanpham = machitietsanpham;
    }

    public Integer getMachitietsanpham() {
        return machitietsanpham;
    }

    public void setMachitietsanpham(Integer machitietsanpham) {
        this.machitietsanpham = machitietsanpham;
    }

    public Integer getSoluong() {
        return soluong;
    }

    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    public String getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(String ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public Mausanpham getMamau() {
        return mamau;
    }

    public void setMamau(Mausanpham mamau) {
        this.mamau = mamau;
    }

    public Sanpham getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(Sanpham masanpham) {
        this.masanpham = masanpham;
    }

    public Sizesanpham getMasize() {
        return masize;
    }

    public void setMasize(Sizesanpham masize) {
        this.masize = masize;
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
        hash += (machitietsanpham != null ? machitietsanpham.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chitietsanpham)) {
            return false;
        }
        Chitietsanpham other = (Chitietsanpham) object;
        if ((this.machitietsanpham == null && other.machitietsanpham != null) || (this.machitietsanpham != null && !this.machitietsanpham.equals(other.machitietsanpham))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Chitietsanpham[ machitietsanpham=" + machitietsanpham + " ]";
    }
    
}
