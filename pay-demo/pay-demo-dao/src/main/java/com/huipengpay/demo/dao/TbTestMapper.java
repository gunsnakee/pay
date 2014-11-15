package com.huipengpay.demo.dao;

import com.huipengpay.demo.model.TbTest;
import org.springframework.stereotype.Component;

@Component
public interface TbTestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbTest record);

    int insertSelective(TbTest record);

    TbTest selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbTest record);

    int updateByPrimaryKey(TbTest record);
}