package com.ck.controller;

import com.ck.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.xml.registry.infomodel.User;
import java.util.HashMap;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("queryall")
    public String queryall(ModelMap map){
        List<User> queryall = userService.queryall();
        map.put("list", queryall);
        return "index";
    }
}
