package com.minishop.controller;

import com.minishop.entity.NhanVien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ToiTD
 */
@Controller
@RequestMapping("dangnhap/")
public class DangNhapController {

    @GetMapping
    public String Default(ModelMap modelMap) {
        NhanVien nhanVien = new NhanVien();
        nhanVien.setTenNhanVien("Tran Duc Toi");
        nhanVien.setTuoi(26);

        NhanVien nhanVien1 = new NhanVien();
        nhanVien1.setTenNhanVien("Nguyen Thi Quynh");
        nhanVien1.setTuoi(23);

        List<NhanVien> nhanVienList = new ArrayList<NhanVien>();
        nhanVienList.add(nhanVien);
        nhanVienList.add(nhanVien1);

        modelMap.addAttribute("listNhanVien", nhanVienList);
        return "dangnhap";
    }

    @PostMapping
    public String xuLyDangNhap(@RequestParam String tendangnhap, @RequestParam String pass) {
        if (tendangnhap.equals("ductoi") && pass.equals("123456")) {
            return "redirect:/";
        } else {
            return "dangnhap";
        }
    }
}
