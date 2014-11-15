package com.huipengpay.demo.dao;

import com.huipengpay.demo.model.TbOpt;
import org.springframework.stereotype.Component;

@Component
public interface TbOptMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbOpt record);

    int insertSelective(TbOpt record);

    TbOpt selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbOpt record);

    int updateByPrimaryKey(TbOpt record);
}