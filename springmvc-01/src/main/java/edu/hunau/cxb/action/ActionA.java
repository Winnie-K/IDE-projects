package edu.hunau.cxb.action;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calla")
public class ActionA {

    @RequestMapping("/aa")
    public String call(){
        System.out.println("ActionA....call");
        return "forward:/callb/ab.do";
    }
}
