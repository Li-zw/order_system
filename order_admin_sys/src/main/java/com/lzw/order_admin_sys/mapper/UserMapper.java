package com.lzw.order_admin_sys.mapper;

import com.lzw.order_admin_sys.entity.User;

public interface UserMapper {
    User queryUser(String username, String password);

    User queryUserName(String username);

    boolean insertUser(User user);

}
