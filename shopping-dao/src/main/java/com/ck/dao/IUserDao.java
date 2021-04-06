package com.ck.dao;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import javax.xml.registry.infomodel.User;
import java.util.List;

public interface IUserDao {
    @Select("select * from abc")
    @ResultMap("UserMappper")
    public List<User> queryall();
}
