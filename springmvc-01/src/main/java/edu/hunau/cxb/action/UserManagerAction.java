package edu.hunau.cxb.action;

import edu.hunau.cxb.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller //表示该类作为一个控制器的类
@RequestMapping("/user") //提供了请求的名空间
public class UserManagerAction {

    @RequestMapping("/showlist")
    public @ResponseBody List<User> showList(){
        List<User> lists = new ArrayList<>();
        lists.add(new User(1,"haoren1","haoren1",LocalDate.now()));
        lists.add(new User(2,"haoren2","haoren1",LocalDate.now()));
        lists.add(new User(4,"haoren4","haoren1",LocalDate.now()));
        lists.add(new User(3,"haoren3","haoren1",LocalDate.now()));
        lists.add(new User(5,"haoren5","haoren1",LocalDate.now()));
        return lists;
    }
    @RequestMapping("/showjson")
    public @ResponseBody  User showJSON(){
        User u=new User();
        u.setId(1001);
        u.setUsername("haoren");
        u.setPwd("250");
        u.setBirthday(LocalDate.now());
        return u;
    }


    //@RequestMapping("/showAll") //绑定一个请求
    //只能处理post方法
    @RequestMapping(path="/showAll", method={RequestMethod.GET})
    public ModelAndView showAll(){

        //封装数据
        List<String> datas = new ArrayList<>();
        Collections.addAll(datas,"wangfei","luiu","batman");
        //实例化一个ModelAndView对象封装数据
        ModelAndView mv = new ModelAndView();
        //绑定数据
        mv.addObject("datas",datas);
        //绑定视图资源
        //mv.setViewName("/WEB-INF/jsp/list.jsp");
        //mv.setViewName("user/list");//视图资源优化之后的绑定
        mv.setViewName("user/list");//将list.jsp放在user文件夹中 http://localhost:8088/springmvc/user/showAll.do
        return mv;
    }
}
