package com.minishop.entity;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by HP 8300 on 7/21/2018.
 */
@Entity
@Table(name = "chucvu", schema = "dbminishop", catalog = "")
public class ChucvuEntity {
    private int machucvu;
    private String tenchucvu;
    private Collection<NhanvienEntity> nhanviensByMachucvu;

    @Id
    @Column(name = "machucvu")
    public int getMachucvu() {
        return machucvu;
    }

    public void setMachucvu(int machucvu) {
        this.machucvu = machucvu;
    }

    @Basic
    @Column(name = "tenchucvu")
    public String getTenchucvu() {
        return tenchucvu;
    }

    public void setTenchucvu(String tenchucvu) {
        this.tenchucvu = tenchucvu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChucvuEntity that = (ChucvuEntity) o;

        if (machucvu != that.machucvu) return false;
        if (tenchucvu != null ? !tenchucvu.equals(that.tenchucvu) : that.tenchucvu != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = machucvu;
        result = 31 * result + (tenchucvu != null ? tenchucvu.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "chucvuByMachucvu")
    public Collection<NhanvienEntity> getNhanviensByMachucvu() {
        return nhanviensByMachucvu;
    }

    public void setNhanviensByMachucvu(Collection<NhanvienEntity> nhanviensByMachucvu) {
        this.nhanviensByMachucvu = nhanviensByMachucvu;
    }
}
