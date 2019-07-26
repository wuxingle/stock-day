package com.stock.socketcenter.webserver.user.service;



import com.stock.socketcenter.entity.UserInfoEntity;

import java.util.List;
import java.util.Map;

/**
 * 用户信息表
 * 
 * @author qiqiim
 * @email 1044053532@qq.com
 * @date 2017-11-27 09:38:52
 */
public interface UserInfoService {
	
	UserInfoEntity queryObject(Long id);
	
	List<UserInfoEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(UserInfoEntity userInfo);
	
	int update(UserInfoEntity userInfo);
	
	int delete(Long id);
	
	int deleteBatch(Long[] ids);
}
