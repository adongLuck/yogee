package com.yogee.service.impl;

/**
 * Created by Jackqth on 2017/10/30.
 */
import com.yogee.dao.IUserDao;
import com.yogee.model.User;
import com.yogee.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

}