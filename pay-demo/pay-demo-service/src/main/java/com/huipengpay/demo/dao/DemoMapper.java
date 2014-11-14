package com.huipengpay.demo.dao;

import com.huipengpay.demo.api.model.Demo;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;
import java.util.List;
import java.util.Map;

//@Retention(RetentionPolicy.RUNTIME)
//@Target(ElementType.TYPE)
//@Documented
@Component
public interface DemoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Demo record);

    int insertSelective(Demo record);

    Demo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Demo record);

    int updateByPrimaryKey(Demo record);

    List<Demo> selectAll();

    List<Demo> selectBySelective(Demo record);

    List<Demo> selectBySearch(Demo record);

    List<Demo> selectByPage(Map<String,Object> record);
}