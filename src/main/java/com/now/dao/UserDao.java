package com.now.dao;
import com.now.domain.User;

/**
 * 功能概要：User的DAO类(Dao接口类，用来对应mapper文件)
 */
public interface UserDao {
	
	/**
	 * @param userId
	 * @return
	 */
	public User selectUserById(Integer userId);

}






