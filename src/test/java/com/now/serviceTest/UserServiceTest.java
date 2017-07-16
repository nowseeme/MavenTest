package com.now.serviceTest;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.now.baseTest.SpringTestCase;
import com.now.domain.User;
import com.now.service.UserService;

/** 
 * 功能概要：UserService单元测试 
 *  
 */  
public class UserServiceTest extends SpringTestCase {  
    @Autowired  
    private UserService userService;  
    Logger logger = Logger.getLogger(UserServiceTest.class);  
   
    @Test  
    public void selectUserByIdTest(){  
        User user = userService.selectUserById(2);  
        logger.debug("查找结果" + user);  
    }  
}