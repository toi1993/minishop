/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minishop.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author HP 8300
 */
@Embeddable
public class ChitietkhuyenmaiPK implements Serializable {

    @Basic(optional = false)
    @Column(nullable = false)
    private int makhuyenmai;
    @Basic(optional = false)
    @Column(nullable = false)
    private int masanpham;

    public ChitietkhuyenmaiPK() {
    }

    public ChitietkhuyenmaiPK(int makhuyenmai, int masanpham) {
        this.makhuyenmai = makhuyenmai;
        this.masanpham = masanpham;
    }

    public int getMakhuyenmai() {
        return makhuyenmai;
    }

    public void setMakhuyenmai(int makhuyenmai) {
        this.makhuyenmai = makhuyenmai;
    }

    public int getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(int masanpham) {
        this.masanpham = masanpham;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) makhuyenmai;
        hash += (int) masanpham;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ChitietkhuyenmaiPK)) {
            return false;
        }
        ChitietkhuyenmaiPK other = (ChitietkhuyenmaiPK) object;
        if (this.makhuyenmai != other.makhuyenmai) {
            return false;
        }
        if (this.masanpham != other.masanpham) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.ChitietkhuyenmaiPK[ makhuyenmai=" + makhuyenmai + ", masanpham=" + masanpham + " ]";
    }
    
}
