package com.minishop.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by HP 8300 on 7/21/2018.
 */
public class ChitietkhuyenmaiEntityPK implements Serializable {
    private int makhuyenmai;
    private int masanpham;

    @Column(name = "makhuyenmai")
    @Id
    public int getMakhuyenmai() {
        return makhuyenmai;
    }

    public void setMakhuyenmai(int makhuyenmai) {
        this.makhuyenmai = makhuyenmai;
    }

    @Column(name = "masanpham")
    @Id
    public int getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(int masanpham) {
        this.masanpham = masanpham;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChitietkhuyenmaiEntityPK that = (ChitietkhuyenmaiEntityPK) o;

        if (makhuyenmai != that.makhuyenmai) return false;
        if (masanpham != that.masanpham) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = makhuyenmai;
        result = 31 * result + masanpham;
        return result;
    }
}
