package edu.hunau.cxb.action;


import edu.hunau.cxb.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/req")
public class RequestParamDataAction {

    @RequestMapping("/{id}")
    public String byParamValue(@PathVariable int id){
        System.out.println(id);
        return "success";
    }

    @RequestMapping("/bean")
    //由Spring提供的拦截器完成自动的封装
    public String autoBean(User user){
        System.out.println(user);
        return "success";
    }

    @RequestMapping("/sr")
    //HttpServletRequest的实例通过spring容器进行注入
    public String  byServletRequest(HttpServletRequest request) {

        //获得data的值
        String data = request.getParameter("data");
        System.out.println(data);
        return "sucess";
    }


    @RequestMapping("/auto")
    public String byAuto(String data,int id){

        System.out.println(data+":"+id);
        return "success";
    }
}
