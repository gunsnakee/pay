package com.huipengpay.demo.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2014/11/15.
 */
@Controller
public class DemoController {
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("welcome","hi wujiawu! "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        return "index";
    }
}
