package com.yogee.controller;

/**
 * Created by Jackqth on 2017/10/30.
 */
import javax.servlet.http.HttpServletRequest;

import com.yogee.model.User;
import com.yogee.service.IUserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/index")
    public String selectUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        return "index";
    }

}