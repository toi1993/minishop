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
    @NamedQuery(name = "Sanpham.findAll", query = "SELECT s FROM Sanpham s")
    , @NamedQuery(name = "Sanpham.findByMasanpham", query = "SELECT s FROM Sanpham s WHERE s.masanpham = :masanpham")
    , @NamedQuery(name = "Sanpham.findByTensanpham", query = "SELECT s FROM Sanpham s WHERE s.tensanpham = :tensanpham")
    , @NamedQuery(name = "Sanpham.findByGiatien", query = "SELECT s FROM Sanpham s WHERE s.giatien = :giatien")
    , @NamedQuery(name = "Sanpham.findByGianhcho", query = "SELECT s FROM Sanpham s WHERE s.gianhcho = :gianhcho")})
public class Sanpham implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer masanpham;
    @Column(length = 100)
    private String tensanpham;
    @Column(length = 50)
    private String giatien;
    @Lob
    @Column(length = 65535)
    private String mota;
    @Lob
    @Column(length = 65535)
    private String hinhsanpham;
    @Column(length = 4)
    private String gianhcho;
    @JoinColumn(name = "madanhmuc", referencedColumnName = "madanhmuc")
    @ManyToOne
    private Danhmucsanpham madanhmuc;
    @OneToMany(mappedBy = "masanpham")
    private List<Chitietsanpham> chitietsanphamList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sanpham")
    private List<Chitietkhuyenmai> chitietkhuyenmaiList;

    public Sanpham() {
    }

    public Sanpham(Integer masanpham) {
        this.masanpham = masanpham;
    }

    public Integer getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(Integer masanpham) {
        this.masanpham = masanpham;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public String getGiatien() {
        return giatien;
    }

    public void setGiatien(String giatien) {
        this.giatien = giatien;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getHinhsanpham() {
        return hinhsanpham;
    }

    public void setHinhsanpham(String hinhsanpham) {
        this.hinhsanpham = hinhsanpham;
    }

    public String getGianhcho() {
        return gianhcho;
    }

    public void setGianhcho(String gianhcho) {
        this.gianhcho = gianhcho;
    }

    public Danhmucsanpham getMadanhmuc() {
        return madanhmuc;
    }

    public void setMadanhmuc(Danhmucsanpham madanhmuc) {
        this.madanhmuc = madanhmuc;
    }

    @XmlTransient
    public List<Chitietsanpham> getChitietsanphamList() {
        return chitietsanphamList;
    }

    public void setChitietsanphamList(List<Chitietsanpham> chitietsanphamList) {
        this.chitietsanphamList = chitietsanphamList;
    }

    @XmlTransient
    public List<Chitietkhuyenmai> getChitietkhuyenmaiList() {
        return chitietkhuyenmaiList;
    }

    public void setChitietkhuyenmaiList(List<Chitietkhuyenmai> chitietkhuyenmaiList) {
        this.chitietkhuyenmaiList = chitietkhuyenmaiList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (masanpham != null ? masanpham.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sanpham)) {
            return false;
        }
        Sanpham other = (Sanpham) object;
        if ((this.masanpham == null && other.masanpham != null) || (this.masanpham != null && !this.masanpham.equals(other.masanpham))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Sanpham[ masanpham=" + masanpham + " ]";
    }
    
}
