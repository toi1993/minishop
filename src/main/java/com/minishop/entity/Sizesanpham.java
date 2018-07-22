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
    @NamedQuery(name = "Sizesanpham.findAll", query = "SELECT s FROM Sizesanpham s")
    , @NamedQuery(name = "Sizesanpham.findByMasize", query = "SELECT s FROM Sizesanpham s WHERE s.masize = :masize")
    , @NamedQuery(name = "Sizesanpham.findBySize", query = "SELECT s FROM Sizesanpham s WHERE s.size = :size")})
public class Sizesanpham implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer masize;
    @Column(length = 20)
    private String size;
    @OneToMany(mappedBy = "masize")
    private List<Chitietsanpham> chitietsanphamList;

    public Sizesanpham() {
    }

    public Sizesanpham(Integer masize) {
        this.masize = masize;
    }

    public Integer getMasize() {
        return masize;
    }

    public void setMasize(Integer masize) {
        this.masize = masize;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @XmlTransient
    public List<Chitietsanpham> getChitietsanphamList() {
        return chitietsanphamList;
    }

    public void setChitietsanphamList(List<Chitietsanpham> chitietsanphamList) {
        this.chitietsanphamList = chitietsanphamList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (masize != null ? masize.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sizesanpham)) {
            return false;
        }
        Sizesanpham other = (Sizesanpham) object;
        if ((this.masize == null && other.masize != null) || (this.masize != null && !this.masize.equals(other.masize))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Sizesanpham[ masize=" + masize + " ]";
    }
    
}
