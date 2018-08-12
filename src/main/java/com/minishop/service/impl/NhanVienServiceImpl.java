package com.minishop.service.impl;

import com.minishop.dao.NhanVienDao;
import com.minishop.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NhanVienServiceImpl implements NhanVienService {

    @Autowired
    NhanVienDao nhanVienDao;

    public boolean kiemTraDangNhap(String tendangnhap, String matKhau) {
        boolean kiemTra = nhanVienDao.kiemTraDangNhap(tendangnhap, matKhau);
        return kiemTra;
    }
}
