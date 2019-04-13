package edu.hunau.cxb.action;


import edu.hunau.cxb.CustomException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductAction {

    @RequestMapping("/{id}")
    public String queryById(@PathVariable int id){
        if(2>1){
            throw new CustomException("商品信息不存在!");
        }

        if(id<1000){
            throw new RuntimeException("抛出其他异常");
        }
        return "success";
    }
}
