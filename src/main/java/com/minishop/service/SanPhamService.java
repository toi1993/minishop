package com.minishop.service;

import com.minishop.entity.Sanpham;

import java.util.List;

/**
 * Created by HP 8300 on 8/18/2018.
 */
public interface SanPhamService {
    public List<Sanpham> getListSanPham(int sanPhamBatDau);
}
