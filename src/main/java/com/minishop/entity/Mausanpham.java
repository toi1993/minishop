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
    @NamedQuery(name = "Mausanpham.findAll", query = "SELECT m FROM Mausanpham m")
    , @NamedQuery(name = "Mausanpham.findByMamau", query = "SELECT m FROM Mausanpham m WHERE m.mamau = :mamau")
    , @NamedQuery(name = "Mausanpham.findByTenmau", query = "SELECT m FROM Mausanpham m WHERE m.tenmau = :tenmau")})
public class Mausanpham implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer mamau;
    @Column(length = 50)
    private String tenmau;
    @OneToMany(mappedBy = "mamau")
    private List<Chitietsanpham> chitietsanphamList;

    public Mausanpham() {
    }

    public Mausanpham(Integer mamau) {
        this.mamau = mamau;
    }

    public Integer getMamau() {
        return mamau;
    }

    public void setMamau(Integer mamau) {
        this.mamau = mamau;
    }

    public String getTenmau() {
        return tenmau;
    }

    public void setTenmau(String tenmau) {
        this.tenmau = tenmau;
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
        hash += (mamau != null ? mamau.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mausanpham)) {
            return false;
        }
        Mausanpham other = (Mausanpham) object;
        if ((this.mamau == null && other.mamau != null) || (this.mamau != null && !this.mamau.equals(other.mamau))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Mausanpham[ mamau=" + mamau + " ]";
    }
    
}
