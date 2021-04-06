package com.ck.service.lmpl;

import com.ck.dao.IUserDao;
import com.ck.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.registry.infomodel.User;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private IUserDao iUserDao;
    @Override
    public List<User> queryall() {
        return iUserDao.queryall();
    }
}
