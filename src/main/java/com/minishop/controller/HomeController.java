package com.minishop.controller;

import com.minishop.entity.NhanVien;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String login() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Ioc.xml");
        NhanVien nhanVien = (NhanVien) applicationContext.getBean("nhanvien");
        nhanVien.getThongBao();
        return "index";
    }

}
