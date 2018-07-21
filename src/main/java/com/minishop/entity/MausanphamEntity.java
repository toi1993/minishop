package com.minishop.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by HP 8300 on 7/21/2018.
 */
@Entity
@Table(name = "mausanpham", schema = "dbminishop", catalog = "")
public class MausanphamEntity {
    private int mamau;
    private String tenmau;
    private Collection<ChitietsanphamEntity> chitietsanphamsByMamau;

    @Id
    @Column(name = "mamau")
    public int getMamau() {
        return mamau;
    }

    public void setMamau(int mamau) {
        this.mamau = mamau;
    }

    @Basic
    @Column(name = "tenmau")
    public String getTenmau() {
        return tenmau;
    }

    public void setTenmau(String tenmau) {
        this.tenmau = tenmau;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MausanphamEntity that = (MausanphamEntity) o;

        if (mamau != that.mamau) return false;
        if (tenmau != null ? !tenmau.equals(that.tenmau) : that.tenmau != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mamau;
        result = 31 * result + (tenmau != null ? tenmau.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "mausanphamByMamau")
    public Collection<ChitietsanphamEntity> getChitietsanphamsByMamau() {
        return chitietsanphamsByMamau;
    }

    public void setChitietsanphamsByMamau(Collection<ChitietsanphamEntity> chitietsanphamsByMamau) {
        this.chitietsanphamsByMamau = chitietsanphamsByMamau;
    }
}
