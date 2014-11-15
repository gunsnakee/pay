package com.huipengpay.demo.web2.controllers;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.huipengpay.demo.s1.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2014/11/15.
 */
@Controller
public class Web2Controller {

    @RequestMapping("/index")
    public String index(Model model) throws UnknownHostException {
        InetAddress localhost = InetAddress.getLocalHost();
        model.addAttribute("localIp",localhost.getHostAddress());
        return "index";
    }

}
