package com.fengjinqi.test;

import com.fengjinqi.dao.UserDao;
import com.fengjinqi.web.User;
import org.junit.Test;

public class TestLogin {
    @Test
    public void testLogin(){
        User user = new User();
        user.setUsername("1218525402@qq.com");
        UserDao userDao = new UserDao();
        User login = userDao.login(user);
       System.out.println(login);
    }
}
