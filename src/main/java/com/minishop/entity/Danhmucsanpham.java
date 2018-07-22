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
    @NamedQuery(name = "Danhmucsanpham.findAll", query = "SELECT d FROM Danhmucsanpham d")
    , @NamedQuery(name = "Danhmucsanpham.findByMadanhmuc", query = "SELECT d FROM Danhmucsanpham d WHERE d.madanhmuc = :madanhmuc")
    , @NamedQuery(name = "Danhmucsanpham.findByTendanhmuc", query = "SELECT d FROM Danhmucsanpham d WHERE d.tendanhmuc = :tendanhmuc")})
public class Danhmucsanpham implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer madanhmuc;
    @Column(length = 100)
    private String tendanhmuc;
    @Lob
    @Column(length = 65535)
    private String hinhdanhmuc;
    @OneToMany(mappedBy = "madanhmuc")
    private List<Sanpham> sanphamList;

    public Danhmucsanpham() {
    }

    public Danhmucsanpham(Integer madanhmuc) {
        this.madanhmuc = madanhmuc;
    }

    public Integer getMadanhmuc() {
        return madanhmuc;
    }

    public void setMadanhmuc(Integer madanhmuc) {
        this.madanhmuc = madanhmuc;
    }

    public String getTendanhmuc() {
        return tendanhmuc;
    }

    public void setTendanhmuc(String tendanhmuc) {
        this.tendanhmuc = tendanhmuc;
    }

    public String getHinhdanhmuc() {
        return hinhdanhmuc;
    }

    public void setHinhdanhmuc(String hinhdanhmuc) {
        this.hinhdanhmuc = hinhdanhmuc;
    }

    @XmlTransient
    public List<Sanpham> getSanphamList() {
        return sanphamList;
    }

    public void setSanphamList(List<Sanpham> sanphamList) {
        this.sanphamList = sanphamList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (madanhmuc != null ? madanhmuc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Danhmucsanpham)) {
            return false;
        }
        Danhmucsanpham other = (Danhmucsanpham) object;
        if ((this.madanhmuc == null && other.madanhmuc != null) || (this.madanhmuc != null && !this.madanhmuc.equals(other.madanhmuc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Danhmucsanpham[ madanhmuc=" + madanhmuc + " ]";
    }
    
}
