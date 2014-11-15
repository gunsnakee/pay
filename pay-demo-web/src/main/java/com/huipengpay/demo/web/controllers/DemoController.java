package com.huipengpay.demo.web.controllers;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.huipengpay.demo.api.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by Administrator on 2014/11/15.
 */
@Controller
public class DemoController {

    @Reference
    private DemoService demoService;


    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("welcome","hi wujiawu! "+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        return "index";
    }
    @RequestMapping(value = "/json",produces  = "application/json")
    @ResponseBody
    public String json(){
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("id",11);
        data.put("name","wujiawu");
        data.put("status",true);
        return JSON.toJSONString(data);
    }

    @RequestMapping("/demo")
    public String demo(Model model){
        model.addAttribute("demolist",demoService.list());
        return "demo";
    }
}
