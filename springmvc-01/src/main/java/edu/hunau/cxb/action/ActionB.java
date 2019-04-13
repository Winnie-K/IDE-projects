package edu.hunau.cxb.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/callb")
public class ActionB {

    @RequestMapping("/ab")
    public String call(){
        System.out.println("ActionB....call");
        return "success";//返回success.jsp页面
    }
}
