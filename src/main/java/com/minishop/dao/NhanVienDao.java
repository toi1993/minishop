package com.minishop.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by HP 8300 on 8/11/2018.
 */
@Repository
public interface NhanVienDao {
    public boolean kiemTraDangNhap(String tendangnhap, String matkhau);

}
