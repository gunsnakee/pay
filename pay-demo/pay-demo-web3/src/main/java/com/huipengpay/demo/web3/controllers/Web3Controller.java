package com.huipengpay.demo.web3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by Administrator on 2014/11/16.
 */
@Controller
public class Web3Controller {
    @RequestMapping("/index")
    public String index(Model model) throws UnknownHostException {
        InetAddress localhost = InetAddress.getLocalHost();
        model.addAttribute("localIp",localhost.getHostAddress());
        return "index";
    }
}
