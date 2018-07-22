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
    @NamedQuery(name = "Chucvu.findAll", query = "SELECT c FROM Chucvu c")
    , @NamedQuery(name = "Chucvu.findByMachucvu", query = "SELECT c FROM Chucvu c WHERE c.machucvu = :machucvu")
    , @NamedQuery(name = "Chucvu.findByTenchucvu", query = "SELECT c FROM Chucvu c WHERE c.tenchucvu = :tenchucvu")})
public class Chucvu implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer machucvu;
    @Column(length = 20)
    private String tenchucvu;
    @OneToMany(mappedBy = "machucvu")
    private List<Nhanvien> nhanvienList;

    public Chucvu() {
    }

    public Chucvu(Integer machucvu) {
        this.machucvu = machucvu;
    }

    public Integer getMachucvu() {
        return machucvu;
    }

    public void setMachucvu(Integer machucvu) {
        this.machucvu = machucvu;
    }

    public String getTenchucvu() {
        return tenchucvu;
    }

    public void setTenchucvu(String tenchucvu) {
        this.tenchucvu = tenchucvu;
    }

    @XmlTransient
    public List<Nhanvien> getNhanvienList() {
        return nhanvienList;
    }

    public void setNhanvienList(List<Nhanvien> nhanvienList) {
        this.nhanvienList = nhanvienList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (machucvu != null ? machucvu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Chucvu)) {
            return false;
        }
        Chucvu other = (Chucvu) object;
        if ((this.machucvu == null && other.machucvu != null) || (this.machucvu != null && !this.machucvu.equals(other.machucvu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Chucvu[ machucvu=" + machucvu + " ]";
    }
    
}
