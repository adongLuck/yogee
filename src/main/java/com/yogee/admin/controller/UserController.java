package com.yogee.admin.controller;

/**
 * UserController class
 *
 * @author Jackqth
 * @date 2017/11/1
 */
import javax.servlet.http.HttpServletRequest;

import com.yogee.admin.model.User;
import com.yogee.admin.service.IUserService;
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
        return "/WEB-INF/admin/index";
    }

}