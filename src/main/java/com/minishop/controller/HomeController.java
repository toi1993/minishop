package com.minishop.controller;

import com.minishop.entity.NhanVien;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public ModelAndView login() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        String name = "Tran Duc Toi";
        String pass = "123456";
        modelAndView.addObject("tendangnhap", name);
        modelAndView.addObject("matkhau", pass);

        return modelAndView;
    }

    @RequestMapping(value = "/login")
    public String login1(ModelMap modelMap) {

        String name = "Tran Duc Toi";
        String pass = "123456";
        modelMap.addAttribute("tendangnhap",name);
        modelMap.addAttribute("pass", pass);
        return "login";
    }
}
