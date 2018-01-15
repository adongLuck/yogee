package com.yogee.admin.controller;
/**
 * Demo class
 *
 * @author Jackqth
 * @date 2017/11/1
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/a")
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login(HttpServletRequest request, HttpServletResponse response){
        return "/admin/login";
    }


    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String index(HttpServletRequest request, HttpServletResponse response){

        return "/admin/index";
    }
    @RequestMapping("/demo")
    public String demo(){
        return "/WEB-INF/view/admin/demo.jsp";
    }
}
