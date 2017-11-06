package com.yogee.admin.service.impl;
/**
 * 日志拦截器
 *
 * @author Jackqth
 * @date 2017/10/30
 */
import com.yogee.admin.dao.IUserDao;
import com.yogee.admin.model.User;
import com.yogee.admin.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    @Override
    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

}