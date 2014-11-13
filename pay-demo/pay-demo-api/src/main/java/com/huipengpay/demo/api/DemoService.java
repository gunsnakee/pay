package com.huipengpay.demo.api;

import com.huipengpay.demo.api.dto.DemoDto;

import java.util.List;

/**
 * Created by Administrator on 2014/11/13.
 */
public interface DemoService  {
     int inert(DemoDto demoDto);
     int update(DemoDto demoDto);
     DemoDto findById(int id);
     List<DemoDto> list();
}
