package com.minishop.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by HP 8300 on 7/21/2018.
 */
public class ChitiethoadonEntityPK implements Serializable {
    private int mahoadon;
    private int machitietsanpham;

    @Column(name = "mahoadon")
    @Id
    public int getMahoadon() {
        return mahoadon;
    }

    public void setMahoadon(int mahoadon) {
        this.mahoadon = mahoadon;
    }

    @Column(name = "machitietsanpham")
    @Id
    public int getMachitietsanpham() {
        return machitietsanpham;
    }

    public void setMachitietsanpham(int machitietsanpham) {
        this.machitietsanpham = machitietsanpham;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChitiethoadonEntityPK that = (ChitiethoadonEntityPK) o;

        if (mahoadon != that.mahoadon) return false;
        if (machitietsanpham != that.machitietsanpham) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mahoadon;
        result = 31 * result + machitietsanpham;
        return result;
    }
}
