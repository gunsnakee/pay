package com.huipengpay.demo.s1;

import com.huipengpay.demo.model.Demo;
import com.huipengpay.demo.s1.dto.DemoDto;
import com.huipengpay.demo.dao.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2014/11/13.
 */
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoMapper demoMapper;

    @Override
    public int transInt(int i) {
        return i;
    }

    @Override
    public byte transByte(byte b) {
        return b;
    }

    @Override
    public boolean transBool(boolean b) {
        return b;
    }

    @Override
    public String transStr(String s) {
        return s;
    }

    @Override
    public Map<String, DemoDto> transMap(Map<String, DemoDto> map) {
        return map;
    }

    @Override
    public Set<DemoDto> transSet(Set<DemoDto> set) {
        return set;
    }

    @Override
    public List<DemoDto> transList(List<DemoDto> list) {
        return list;
    }

    @Override
    public DemoDto[] transArray(DemoDto[] array) {
        return  array;
    }

    @Override
    @Transactional
    public int insert(Demo demo) {
        return demoMapper.insert(demo);
    }

    @Override
    @Transactional
    public int update(Demo demo) {
        return demoMapper.updateByPrimaryKey(demo);
    }

    @Override
    public Demo findById(int id) {
        return demoMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Demo> list() {
        return demoMapper.selectAll();
    }

    @Override
    public List<Demo> listBySelective(Demo para) {
        if(para==null){
            return null;
        }
        return demoMapper.selectBySelective(para);
    }

    @Override
    public List<Demo> listBySearch(Demo para) {
        return demoMapper.selectBySearch(para);
    }

    @Override
    public List<Demo> listByPage(Demo para, int currPage, int pageSize) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("demo",para);
        map.put("currPage",currPage);
        map.put("pageSize",pageSize);
        return demoMapper.selectByPage(map);
    }
}

