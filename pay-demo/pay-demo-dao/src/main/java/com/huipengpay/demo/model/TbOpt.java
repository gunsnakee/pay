package com.huipengpay.demo.model;

import java.io.Serializable;

public class TbOpt implements Serializable {
    private Integer id;

    private String descr;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }
}