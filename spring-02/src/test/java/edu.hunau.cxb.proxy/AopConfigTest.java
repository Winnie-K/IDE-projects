package edu.hunau.cxb.proxy;

import edu.hunau.cxb.aop.config.target.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//整合junit的类
@ContextConfiguration(locations = {"classpath:aop-config.xml"})
public class AopConfigTest {
    @Autowired
    private OrderService orderService;

    @Test
    public void testAop(){
        System.out.println(orderService.getClass());
        orderService.addOrder();

        System.out.println("\n\n\n");
        orderService.queryOrder();

        System.out.println("\n\n\n");
        orderService.queryId(1);
    }
}
