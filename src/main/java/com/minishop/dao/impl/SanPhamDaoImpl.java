package com.minishop.dao.impl;

import com.minishop.dao.SanPhamDao;
import com.minishop.entity.Sanpham;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author ToiTD
 */
@Repository
public class SanPhamDaoImpl implements SanPhamDao {

    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public List<Sanpham> getListSanPham(int sanPhamBatDau) {

        Session session = sessionFactory.getCurrentSession();
        StringBuilder sql = new StringBuilder();
        sql.append(" SELECT *FROM sanpham ");
        Query query = session.createNativeQuery(sql.toString()).addEntity(Sanpham.class);
        query.setFirstResult(sanPhamBatDau);
        query.setMaxResults(20);
        List<Sanpham> sanphamList = query.getResultList();
        return sanphamList;
    }
}
