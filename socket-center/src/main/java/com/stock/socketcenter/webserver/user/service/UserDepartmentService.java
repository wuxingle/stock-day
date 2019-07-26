package com.stock.socketcenter.webserver.user.service;



import com.stock.socketcenter.entity.UserDepartmentEntity;
import com.stock.socketcenter.webserver.user.model.ImFriendUserData;

import java.util.List;
import java.util.Map;

/**
 * 部门
 * 
 * @author qiqiim
 * @email 1044053532@qq.com
 * @date 2017-11-27 09:38:52
 */
public interface UserDepartmentService {
	
	UserDepartmentEntity queryObject(Long id);
	
	List<UserDepartmentEntity> queryList(Map<String, Object> map);
	
    List<ImFriendUserData> queryGroupAndUser();
	
	int queryTotal(Map<String, Object> map);
	
	void save(UserDepartmentEntity userDepartment);
	
	int update(UserDepartmentEntity userDepartment);
	
	int delete(Long id);
	
	int deleteBatch(Long[] ids);
}
