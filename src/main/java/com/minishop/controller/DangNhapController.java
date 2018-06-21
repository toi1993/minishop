package com.minishop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by HP 8300 on 6/10/2018.
 */
@Controller
@RequestMapping("dangnhap/")
public class DangNhapController {

    @GetMapping
    public String Default(ModelMap modelMap) {
        modelMap.addAttribute("ten","tranductoi");
        modelMap.addAttribute("tuoi",26);
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
