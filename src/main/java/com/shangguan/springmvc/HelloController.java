package com.shangguan.springmvc;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;
/**
 * @ClassName: HelloController
 * @Description:
 * @Author: 李峰
 * @Date: 2020 年 09月 01 0:19
 * @Version 1.0
 */
public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest,
                                      HttpServletResponse httpServletResponse) throws Exception {
        List<String> list = Arrays.asList("Hello","World" ,"Spring","Spring MVC");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("list");
        //这里相当于setAttribute
        modelAndView.addObject("list",list);
        return modelAndView;
    }
}
