package com.huipengpay.demo.s2;

import com.huipengpay.demo.model.TbOpt;
import com.huipengpay.demo.model.TbTest;
import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoServiceTxTest extends TestCase {

    public void testService() throws Exception {
       /* ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"demo-consumer-s2.xml"});
        context.start();
        DemoServiceTx demoService = (DemoServiceTx)context.getBean("demoService");
        String s1 = System.currentTimeMillis()+"";
        System.out.println("=== "+s1);
        TbOpt tbOpt = new TbOpt();
        tbOpt.setDescr(s1);
        TbTest tbTest = new TbTest();
        tbTest.setName(s1);
        assertEquals(demoService.service(tbOpt,tbTest),true);

        String s2 = s1 + System.currentTimeMillis();
        System.out.println("=== "+s2);
        tbOpt.setDescr(s1);
        tbTest.setName(s2);
        assertEquals(demoService.service(tbOpt,tbTest),false);*/
    }
}