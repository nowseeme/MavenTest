package com.now.service;
import com.now.domain.User;
/**
 * 功能概要：UserService接口类 
 */
public interface UserService {
	
	User selectUserById(Integer userId);  
}