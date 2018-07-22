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
    @NamedQuery(name = "Nhanvien.findAll", query = "SELECT n FROM Nhanvien n")
    , @NamedQuery(name = "Nhanvien.findByManhanvien", query = "SELECT n FROM Nhanvien n WHERE n.manhanvien = :manhanvien")
    , @NamedQuery(name = "Nhanvien.findByHoten", query = "SELECT n FROM Nhanvien n WHERE n.hoten = :hoten")
    , @NamedQuery(name = "Nhanvien.findByDiachi", query = "SELECT n FROM Nhanvien n WHERE n.diachi = :diachi")
    , @NamedQuery(name = "Nhanvien.findByGioitinh", query = "SELECT n FROM Nhanvien n WHERE n.gioitinh = :gioitinh")
    , @NamedQuery(name = "Nhanvien.findByCmnd", query = "SELECT n FROM Nhanvien n WHERE n.cmnd = :cmnd")
    , @NamedQuery(name = "Nhanvien.findByEmail", query = "SELECT n FROM Nhanvien n WHERE n.email = :email")
    , @NamedQuery(name = "Nhanvien.findByTendangnhap", query = "SELECT n FROM Nhanvien n WHERE n.tendangnhap = :tendangnhap")
    , @NamedQuery(name = "Nhanvien.findByMatkhau", query = "SELECT n FROM Nhanvien n WHERE n.matkhau = :matkhau")})
public class Nhanvien implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer manhanvien;
    @Column(length = 30)
    private String hoten;
    @Column(length = 200)
    private String diachi;
    private Short gioitinh;
    @Column(length = 14)
    private String cmnd;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Column(length = 50)
    private String email;
    @Column(length = 50)
    private String tendangnhap;
    @Column(length = 50)
    private String matkhau;
    @JoinColumn(name = "machucvu", referencedColumnName = "machucvu")
    @ManyToOne
    private Chucvu machucvu;

    public Nhanvien() {
    }

    public Nhanvien(Integer manhanvien) {
        this.manhanvien = manhanvien;
    }

    public Integer getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(Integer manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public Short getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(Short gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTendangnhap() {
        return tendangnhap;
    }

    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public Chucvu getMachucvu() {
        return machucvu;
    }

    public void setMachucvu(Chucvu machucvu) {
        this.machucvu = machucvu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (manhanvien != null ? manhanvien.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nhanvien)) {
            return false;
        }
        Nhanvien other = (Nhanvien) object;
        if ((this.manhanvien == null && other.manhanvien != null) || (this.manhanvien != null && !this.manhanvien.equals(other.manhanvien))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Nhanvien[ manhanvien=" + manhanvien + " ]";
    }
    
}
