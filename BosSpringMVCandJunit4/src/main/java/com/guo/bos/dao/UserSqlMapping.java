package com.guo.bos.dao;
public final class UserSqlMapping {

    public static final String FIND_USERS = "select id, username from kiiwow.user where age > ?";

    public static final String DELETE_USER = "delete from kiiwow.user where id = ?";

}