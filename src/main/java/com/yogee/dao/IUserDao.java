package com.yogee.dao;

/**
 * Created by Jackqth on 2017/10/30.
 */
import com.yogee.model.User;

public interface IUserDao {

    User selectUser(long id);

}