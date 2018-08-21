package com.minishop.controller;

import com.minishop.service.NhanVienService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * dang nhap controller
 *
 * @author ToiTD
 */
@Controller
@RequestMapping("dangnhap/")
public class DangNhapController {

    @GetMapping
    public String viewDangNhap() {
        return "dangnhap";
    }

    @Autowired
    private NhanVienService nhanVienService;

    @PostMapping
    @Transactional
    public String xuLyDangNhap(@RequestParam("tendangnhap") String tendangnhap, @RequestParam("matkhau") String matKhau,ModelMap modelMap) {
        boolean kiemTra = nhanVienService.kiemTraDangNhap(tendangnhap, matKhau);
        if (kiemTra) {
            modelMap.addAttribute("kiemtradangnhap","thanhcong");
        } else {
            modelMap.addAttribute("kiemtradangnhap","that bai");
        }
        
        return "dangnhap";
    }
}
