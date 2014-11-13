package com.huipengpay.demo.api;

import com.huipengpay.demo.api.dto.DemoDto;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2014/11/13.
 */
public interface DemoService  {

     int transInt(int i);
     byte transByte(byte b);
     boolean transBool(boolean b);
     String transStr(String s);

     Map<String,DemoDto> transMap(Map<String,DemoDto> map);
     Set<DemoDto> transSet(Set<DemoDto> set);
     List<DemoDto> transList(List<DemoDto> list);
     DemoDto[] transArray(DemoDto[] array);

     int insert(DemoDto demoDto);
     int update(DemoDto demoDto);
     DemoDto findById(int id);
     List<DemoDto> list();
}
