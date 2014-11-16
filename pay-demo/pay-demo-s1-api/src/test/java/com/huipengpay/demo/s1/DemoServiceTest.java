package com.huipengpay.demo.s1;

import com.huipengpay.demo.model.Demo;
import junit.framework.TestCase;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoServiceTest extends TestCase {


    public void testInsert() throws Exception {
       /* ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"demo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService");
        Demo demo = new Demo();
        demo.setName("p" + new Random(47).nextInt(1000));
        demo.setUpdateTime(new Date());
        assertEquals(1 == demoService.insert(demo), true);*/
    }

    public void testUpdate() throws Exception {
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"demo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService");
        Demo demo = new Demo();
        demo.setId(1);
        String name = "p" + new Random(47).nextInt(1000);
        demo.setName(name);
        demo.setUpdateTime(new Date());
        assertEquals(1 == demoService.update(demo), true);
        Demo updateAff = demoService.findById(1);
        assertEquals(name.equals(updateAff.getName()),true);*/
    }

    public void testFindById() throws Exception {
       /* ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"demo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService");
        Demo demo = demoService.findById(1);
        assertNotNull(demo);
        assertEquals(demo.getId() == 1, true);
        assertNotNull(demo.getUpdateTime());*/
    }

    public void testList() throws Exception {
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"demo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService");
        List<Demo> demoList = demoService.list();
        assertNotNull(demoList);
        assertEquals(demoList.size()>0,true);
        assertNotNull(demoList.get(0).getUpdateTime());*/
    }

    public void testListBySelective() throws Exception {
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"demo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService");
        Demo demo = null;
        assertNull(demoService.listBySelective(demo));
        demo = new Demo();
        demo.setId(0);
        List<Demo> demos = demoService.listBySelective(demo);
        assertNotNull(demos);
        assertEquals(demos.size()==0,true);

        demo.setId(1);
        demos = demoService.listBySelective(demo);
        assertNotNull(demos);
        assertEquals(demos.size()==1,true);

        demo.setName("uyjdstr");
        demos = demoService.listBySelective(demo);
        assertEquals(demos.size()==0,true);

        Demo dbDemo = demoService.findById(1);
        demo.setName(dbDemo.getName());
        demos = demoService.listBySelective(demo);
        assertEquals(demos.size()==1,true);

        demo.setUpdateTime(new Date());
        demos = demoService.listBySelective(demo);
        assertEquals(demos.size()==0,true);

        demo.setUpdateTime(dbDemo.getUpdateTime());
        demos = demoService.listBySelective(demo);
        assertEquals(demos.size()==1,true);*/
    }

    public void testTransInt() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"demo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService");
        int rs = demoService.transInt(-123);
        assertEquals(0 == rs,false);
        assertEquals(-123 == rs,true);
    }

    public void testTransByte() throws Exception {
       /* ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"demo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService");
        byte a = 'Z';
        byte rs = demoService.transByte(a);
        assertEquals(0 == rs,false);
        assertEquals(a == rs,true);*/
    }

    public void testTransBool() throws Exception {
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"demo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService");
        boolean rs = demoService.transBool(true);
        assertEquals(false == rs ,false);
        assertEquals(true == rs,true);*/
    }


    public void testTransStr() throws Exception {
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"demo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService");
        String s = "{dgrgtert}\\!@#$*((~`";
        String rs = demoService.transStr(s);
        assertEquals("-0Uyg".equals(rs),false);
        assertEquals(s.equals(rs),true);*/
    }


    public void testTransMap() throws Exception {
       /* ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"demo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService");
        Map<String,DemoDto> map = new HashMap<String,DemoDto>();
        Date d = new Date();
        map.put("a",new DemoDto(1,"p123",d));
        Map<String,DemoDto> rs = demoService.transMap(map);
        assertNotNull(rs);
        assertEquals(rs.size()==3,false);
        assertEquals(rs.size()==1,true);
        assertEquals(rs.containsKey("b"),false);
        assertEquals(rs.containsKey("a"),true);
        assertEquals(rs.get("a")==null,false);
        assertEquals(rs.get("a").getId()==1,true);
        assertEquals(rs.get("a").getName().equals("p123"),true);
        assertEquals(rs.get("a").getDate().compareTo(d)==0,true);*/
    }

    public void testTransSet() throws Exception {
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"demo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService");
        Set<DemoDto> set = new HashSet<DemoDto>();
        Date date = new Date();
        set.add(new DemoDto(22,"p8998<>",date));
        Set<DemoDto> rs = demoService.transSet(set);
        assertNotNull(rs);
        assertEquals(rs.size()==1,true);
        for(DemoDto demoDto:rs){
            assertEquals(22 == demoDto.getId(),true);
            assertEquals("p8998<>".equals(demoDto.getName()),true);
            assertEquals(date.compareTo(demoDto.getDate())==0,true);
        }*/
    }

    public void testTransList() throws Exception {
       /* ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"demo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService");
        List<DemoDto> demoDtos = new ArrayList<DemoDto>();
        demoDtos.add(new DemoDto(1,"p1",new Date()));
        Thread.sleep(100);
        demoDtos.add(new DemoDto(2,"p2",new Date()));
        Thread.sleep(100);
        demoDtos.add(new DemoDto(3,"p3",new Date()));
        Thread.sleep(100);
        demoDtos.add(new DemoDto(2,"p2",new Date()));

        List<DemoDto> rs = demoService.transList(demoDtos);

        assertNotNull(rs);
        assertEquals(rs.size()==4,true);

        for(int i=0,len=rs.size();i<len;i++){
            assertEquals(demoDtos.get(i).getId()==rs.get(i).getId(),true);
            assertEquals(demoDtos.get(i).getName().equals(rs.get(i).getName()),true);
            assertEquals(demoDtos.get(i).getDate().compareTo(rs.get(i).getDate())==0,true);
        }*/

    }

    public void testTransArray() throws Exception {
       /* ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"demo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService");
        DemoDto[] demoDtos = {new DemoDto(1,"p1",new Date()),new DemoDto(934,"p2",new Date()),new DemoDto(-9,"p3",new Date())};
        DemoDto[] rs = demoService.transArray(demoDtos);
        assertNotNull(rs);
        assertEquals(rs.length==3,true);
        for(int i=0;i<3;i++){
            assertEquals(demoDtos[i].getId() == rs[i].getId(),true);
            assertEquals(demoDtos[i].getName().equals(rs[i].getName()),true);
            assertEquals(demoDtos[i].getDate().compareTo(rs[i].getDate())==0,true);
        }*/
    }

    public void testListBySearch() throws Exception {
       /* ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"demo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService");
        Demo demo = new Demo();
        demo.setName("p");
        List<Demo> rs = demoService.listBySearch(demo);
        assertNotNull(rs);
        assertEquals(5==rs.size(),true);

        demo.setName("fd");
        rs = demoService.listBySearch(demo);
        assertNotNull(rs);
        assertEquals(2==rs.size(),true);

        demo.setName("987sdfestrwtrwetewtt");
        rs = demoService.listBySearch(demo);
        assertNotNull(rs);
        assertEquals(0==rs.size(),true);*/
    }

    public void testListByPage() throws Exception {
       /* ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"demo-consumer.xml"});
        context.start();
        DemoService demoService = (DemoService)context.getBean("demoService");
        Demo demo = new Demo();
        List<Demo> rs = demoService.listByPage(demo, 0, 2);
        assertNotNull(rs);
        assertEquals(rs.size()<=2,true);
        demo.setName("p");
        assertNotNull(rs);
        assertEquals(rs.size()<=2,true);
        assertEquals(rs.size()>0,true);*/
    }
}