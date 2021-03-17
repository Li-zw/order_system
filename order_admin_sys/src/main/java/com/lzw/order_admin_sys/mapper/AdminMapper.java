package com.lzw.order_admin_sys.mapper;

import com.lzw.order_admin_sys.entity.Admin;


public interface AdminMapper {
    Admin queryAdmin(String username, String password);

    Admin queryAdminName(String username);

    boolean insertAdmin(Admin Admin);

}
