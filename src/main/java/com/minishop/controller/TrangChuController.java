package com.minishop.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

/**
 * @author ToiTD1
 */
@Controller
@RequestMapping("/")
public class TrangChuController {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    @GetMapping
    public String defauil() {
        return "trangchu";
    }
}
