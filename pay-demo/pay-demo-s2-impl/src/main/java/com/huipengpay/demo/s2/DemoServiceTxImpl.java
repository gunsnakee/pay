package com.huipengpay.demo.s2;

import com.huipengpay.demo.dao.TbOptMapper;
import com.huipengpay.demo.dao.TbTestMapper;
import com.huipengpay.demo.model.TbOpt;
import com.huipengpay.demo.model.TbTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2014/11/15.
 */
public class DemoServiceTxImpl implements DemoServiceTx {
    @Autowired
    private TbOptMapper tbOptMapper;
    @Autowired
    private TbTestMapper tbTestMapper;

    @Override
    @Transactional
    public boolean service(TbOpt tbOpt,TbTest tbTest) {
        tbOptMapper.insert(tbOpt);
        tbTestMapper.insert(tbTest);
        return true;
    }
}
