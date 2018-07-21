package com.minishop.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by HP 8300 on 7/21/2018.
 */
@Entity
@Table(name = "danhmucsanpham", schema = "dbminishop", catalog = "")
public class DanhmucsanphamEntity {
    private int madanhmuc;
    private String tendanhmuc;
    private String hinhdanhmuc;
    private Collection<SanphamEntity> sanphamsByMadanhmuc;

    @Id
    @Column(name = "madanhmuc")
    public int getMadanhmuc() {
        return madanhmuc;
    }

    public void setMadanhmuc(int madanhmuc) {
        this.madanhmuc = madanhmuc;
    }

    @Basic
    @Column(name = "tendanhmuc")
    public String getTendanhmuc() {
        return tendanhmuc;
    }

    public void setTendanhmuc(String tendanhmuc) {
        this.tendanhmuc = tendanhmuc;
    }

    @Basic
    @Column(name = "hinhdanhmuc")
    public String getHinhdanhmuc() {
        return hinhdanhmuc;
    }

    public void setHinhdanhmuc(String hinhdanhmuc) {
        this.hinhdanhmuc = hinhdanhmuc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DanhmucsanphamEntity that = (DanhmucsanphamEntity) o;

        if (madanhmuc != that.madanhmuc) return false;
        if (tendanhmuc != null ? !tendanhmuc.equals(that.tendanhmuc) : that.tendanhmuc != null) return false;
        if (hinhdanhmuc != null ? !hinhdanhmuc.equals(that.hinhdanhmuc) : that.hinhdanhmuc != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = madanhmuc;
        result = 31 * result + (tendanhmuc != null ? tendanhmuc.hashCode() : 0);
        result = 31 * result + (hinhdanhmuc != null ? hinhdanhmuc.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "danhmucsanphamByMadanhmuc")
    public Collection<SanphamEntity> getSanphamsByMadanhmuc() {
        return sanphamsByMadanhmuc;
    }

    public void setSanphamsByMadanhmuc(Collection<SanphamEntity> sanphamsByMadanhmuc) {
        this.sanphamsByMadanhmuc = sanphamsByMadanhmuc;
    }
}
