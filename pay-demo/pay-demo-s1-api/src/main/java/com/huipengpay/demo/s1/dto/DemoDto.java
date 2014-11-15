package com.huipengpay.demo.s1.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2014/11/13.
 */
public class DemoDto implements Serializable {

    public DemoDto(){}

    public DemoDto(Integer id,String name,Date date){
        this.id = id;
        this.name = name;
        this.date = date;
    }

    private int id;
    private String name;
    private Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
