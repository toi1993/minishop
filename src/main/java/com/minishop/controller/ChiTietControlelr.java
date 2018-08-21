package com.minishop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by HP 8300 on 8/20/2018.
 */
@Controller
@RequestMapping("chitiet/")
public class ChiTietControlelr {
    @GetMapping
    public String view() {
        return "chitiet";
    }
}
