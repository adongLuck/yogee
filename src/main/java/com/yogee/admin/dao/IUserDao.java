package com.yogee.admin.dao;

/**
 * 日志拦截器
 *
 * @author Jackqth
 * @date 2017/10/30
 */
import com.yogee.admin.model.User;

public interface IUserDao {

    User selectUser(long id);

}