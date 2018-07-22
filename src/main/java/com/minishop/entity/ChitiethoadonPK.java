/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minishop.entity;

import org.jetbrains.annotations.NotNull;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author HP 8300
 */
@Embeddable
public class ChitiethoadonPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private int mahoadon;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private int machitietsanpham;

    public ChitiethoadonPK() {
    }

    public ChitiethoadonPK(int mahoadon, int machitietsanpham) {
        this.mahoadon = mahoadon;
        this.machitietsanpham = machitietsanpham;
    }

    public int getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(int mahoadon) {
        this.mahoadon = mahoadon;
    }

    public int getMachitietsanpham() {
        return machitietsanpham;
    }

    public void setMachitietsanpham(int machitietsanpham) {
        this.machitietsanpham = machitietsanpham;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) mahoadon;
        hash += (int) machitietsanpham;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ChitiethoadonPK)) {
            return false;
        }
        ChitiethoadonPK other = (ChitiethoadonPK) object;
        if (this.mahoadon != other.mahoadon) {
            return false;
        }
        if (this.machitietsanpham != other.machitietsanpham) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.ChitiethoadonPK[ mahoadon=" + mahoadon + ", machitietsanpham=" + machitietsanpham + " ]";
    }
    
}
