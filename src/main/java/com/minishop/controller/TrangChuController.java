package com.minishop.controller;

import com.minishop.entity.Sanpham;
import com.minishop.service.SanPhamService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ToiTD1
 */
@Controller
@RequestMapping("/")
public class TrangChuController {
    @Autowired
    SanPhamService sanPhamService;

    @Transactional
    @GetMapping
    public String defauil(ModelMap modelMap) {
        List<Sanpham> sanphamList = sanPhamService.getListSanPham(0);
       modelMap.addAttribute("sanphamList",sanphamList);
        return "trangchu";
    }
}
