package com.minishop.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by HP 8300 on 7/21/2018.
 */
@Entity
@Table(name = "sizesanpham", schema = "dbminishop", catalog = "")
public class SizesanphamEntity {
    private int masize;
    private String size;
    private Collection<ChitietsanphamEntity> chitietsanphamsByMasize;

    @Id
    @Column(name = "masize")
    public int getMasize() {
        return masize;
    }

    public void setMasize(int masize) {
        this.masize = masize;
    }

    @Basic
    @Column(name = "size")
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SizesanphamEntity that = (SizesanphamEntity) o;

        if (masize != that.masize) return false;
        if (size != null ? !size.equals(that.size) : that.size != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = masize;
        result = 31 * result + (size != null ? size.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "sizesanphamByMasize")
    public Collection<ChitietsanphamEntity> getChitietsanphamsByMasize() {
        return chitietsanphamsByMasize;
    }

    public void setChitietsanphamsByMasize(Collection<ChitietsanphamEntity> chitietsanphamsByMasize) {
        this.chitietsanphamsByMasize = chitietsanphamsByMasize;
    }
}
