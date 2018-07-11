package com.minishop.controller;

import com.minishop.entity.NhanVien;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author ToiTD1
 */
@Controller
@RequestMapping("/")
public class TrangChuController {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    @GetMapping
    public String defauil() {

        Session session = sessionFactory.getCurrentSession();
        StringBuilder sql = new StringBuilder();
        sql.append(" from NhanVien");
        List<NhanVien> nhanVienList = session.createQuery(sql.toString()).getResultList();
        for (NhanVien nhanVien : nhanVienList) {
            System.out.println(" nhan vien list " + nhanVien.getTenNhanVien());
            System.out.println(" nhan vien list " + nhanVien.getAddress());
            System.out.println(" nhan vien list " + nhanVien.getTuoi());
        }

        return "trangchu";
    }
}
