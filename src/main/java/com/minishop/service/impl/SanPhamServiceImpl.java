package com.minishop.service.impl;

import com.minishop.dao.SanPhamDao;
import com.minishop.entity.Sanpham;
import com.minishop.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ToiTD
 */
@Service
public class SanPhamServiceImpl implements SanPhamService {
    @Autowired
    SanPhamDao sanPhamDao;

    public List<Sanpham> getListSanPham(int sanPhamBatDau) {
        List<Sanpham> sanphamList = sanPhamDao.getListSanPham(sanPhamBatDau);
        return sanphamList;
    }
}
