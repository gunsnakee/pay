package com.huipengpay.demo.api;

import com.huipengpay.demo.api.dto.DemoDto;
import com.huipengpay.demo.api.model.Demo;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2014/11/13.
 */
public interface DemoService  {

     // 基本类型，对象类型，集合对象 传参
     int transInt(int i);
     byte transByte(byte b);
     boolean transBool(boolean b);
     String transStr(String s);
     Map<String,DemoDto> transMap(Map<String,DemoDto> map);
     Set<DemoDto> transSet(Set<DemoDto> set);
     List<DemoDto> transList(List<DemoDto> list);
     DemoDto[] transArray(DemoDto[] array);

     // 数据库相关操作
     int insert(Demo demo);
     int update(Demo demo);
     Demo findById(int id); // 根据主键查询得到实体
     List<Demo> list(); // 得到所有实体
     List<Demo> listBySelective(Demo para); // 根据实体非空参数精确查找，相当于 = 的查询
     List<Demo> listBySearch(Demo para); // 根据实体非空参数模糊查找，相当于 like %% 的查询
     List<Demo> listByPage(Demo para,int currPage,int pageSize);//根据实体非空参数模糊查找,并按照pageSize作为分页条数进行分页，得到第currPage页的数据，注意 currPage从0开始


}
