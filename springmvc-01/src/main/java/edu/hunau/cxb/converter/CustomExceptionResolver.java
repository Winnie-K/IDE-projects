package edu.hunau.cxb.converter;

import edu.hunau.cxb.CustomException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomExceptionResolver  implements HandlerExceptionResolver{

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        CustomException ce = null;
        if(e instanceof CustomException){
            ce = (CustomException)e;
        }else{
            //实例化一个系统自定义的异常
            ce = new CustomException("系统错误!Call 管理员");
        }

        //实例化ModelAndView资源
        ModelAndView mv = new ModelAndView();
        mv.addObject("message",ce.getMessage());
        mv.setViewName("error");//跳转到/WEB-INF/error.jsp 错误处理页面

        return mv;
    }
}
