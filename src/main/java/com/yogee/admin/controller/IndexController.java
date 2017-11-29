package com.yogee.admin.controller;
/**
 * Demo class
 *
 * @author Jackqth
 * @date 2017/11/6
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
@RequestMapping("/a")
public class IndexController {

    @RequestMapping("")
    public String login(HttpServletRequest request, HttpServletResponse response){
        return "redirect:/a/login";
    }
}
