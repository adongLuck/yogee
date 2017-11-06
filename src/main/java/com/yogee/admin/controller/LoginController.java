package com.yogee.admin.controller;
/**
 * Demo class
 *
 * @author Jackqth
 * @date 2017/11/1
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@Controller
@RequestMapping("/a")
public class LoginController {

    @RequestMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response){
        return "/admin/login";
    }

    @RequestMapping("/demo")
    public String demo(){
        return "/WEB-INF/view/admin/demo.jsp";
    }
}
