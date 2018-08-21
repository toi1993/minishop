package com.minishop.dao;

import com.minishop.entity.Sanpham;

import java.util.List;

/**
 * @author ToiTD
 */
public interface SanPhamDao {
    public List<Sanpham> getListSanPham(int sanPhamBatDau);
}
