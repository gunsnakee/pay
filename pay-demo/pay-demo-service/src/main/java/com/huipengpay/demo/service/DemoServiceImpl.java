package com.huipengpay.demo.service;

import com.huipengpay.demo.api.DemoService;
import com.huipengpay.demo.api.dto.DemoDto;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Administrator on 2014/11/13.
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public int transInt(int i) {
        return 0;
    }

    @Override
    public byte transByte(byte b) {
        return 0;
    }

    @Override
    public boolean transBool(boolean b) {
        return false;
    }

    @Override
    public String transStr(String s) {
        return null;
    }

    @Override
    public Map<String, DemoDto> transMap(Map<String, DemoDto> map) {
        return null;
    }

    @Override
    public Set<DemoDto> transSet(Set<DemoDto> set) {
        return null;
    }

    @Override
    public List<DemoDto> transList(List<DemoDto> list) {
        return null;
    }

    @Override
    public DemoDto[] transArray(DemoDto[] array) {
        return new DemoDto[0];
    }

    @Override
    public int insert(DemoDto demoDto) {
        return 0;
    }

    @Override
    public int update(DemoDto demoDto) {
        return 0;
    }

    @Override
    public DemoDto findById(int id) {
        return null;
    }

    @Override
    public List<DemoDto> list() {
        return null;
    }
}

