package com.minishop.dao.impl;

import com.minishop.dao.NhanVienDao;
import com.minishop.entity.Nhanvien;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by HP 8300 on 8/11/2018.
 */
@Repository
public class NhanVienDaoImpl implements NhanVienDao {
    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public boolean kiemTraDangNhap(String tendangnhap, String matKhau) {

        Session session = sessionFactory.getCurrentSession();
        try {
            StringBuilder sql = new StringBuilder();
            sql.append("select *from nhanvien where tendangnhap =:email and matkhau=:matkhau");
            Query query = session.createNativeQuery(sql.toString()).addEntity(Nhanvien.class);
            query.setParameter("tendangnhap", tendangnhap);
            query.setParameter("matkhau", matKhau);
            Nhanvien nhanvien = (Nhanvien) query.getSingleResult();
            if (nhanvien != null) {
                return true;
            } else {
                return false;
            }
        } catch (HibernateException e) {
            return false;
        }
    }
}
