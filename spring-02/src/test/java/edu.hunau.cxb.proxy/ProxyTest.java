package edu.hunau.cxb.proxy;

import edu.hunau.cxb.aop.proxy.jdk.CGLIBProxyFactory;
import edu.hunau.cxb.aop.proxy.jdk.JDKProxyFactory;
import edu.hunau.cxb.aop.target.UserService;
import edu.hunau.cxb.aop.target.UserServiceImpl;
import org.junit.Test;

public class ProxyTest {

    @Test
    public void testJDKProxy(){
        //获得目标对象
        UserService userBiz = new UserServiceImpl();
        //通过目标对象获得代理对象
        UserService userProxy = (UserService) new JDKProxyFactory(userBiz).createProxy();
        System.out.println(userBiz.getClass());
        System.out.println(userProxy.getClass());

        userProxy.addUser();
    }

    @Test
    public void testCglib() {
        //获得目标对象
        UserServiceImpl userBiz = new UserServiceImpl();
        //通过目标对象获得代理对象
        UserServiceImpl userProxy = (UserServiceImpl) new CGLIBProxyFactory(userBiz).createProxy();

        System.out.println(userBiz.getClass());
        System.out.println(userProxy.getClass());

        userProxy.addUser();
    }
}
