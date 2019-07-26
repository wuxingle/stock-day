package com.stock.socketcenter.webserver.user.service.impl;


import com.stock.socketcenter.entity.UserDepartmentEntity;
import com.stock.socketcenter.mapper.UserDepartmentDao;
import com.stock.socketcenter.server.session.impl.SessionManagerImpl;
import com.stock.socketcenter.webserver.user.model.ImFriendUserData;
import com.stock.socketcenter.webserver.user.model.ImFriendUserInfoData;
import com.stock.socketcenter.webserver.user.service.UserDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("userDepartmentServiceImpl")
public class UserDepartmentServiceImpl implements UserDepartmentService {
	@Autowired
	private UserDepartmentDao userDepartmentDao;
	@Autowired
	private SessionManagerImpl sessionManager;
 

	@Override
	public UserDepartmentEntity queryObject(Long id){
		return userDepartmentDao.queryObject(id);
	}
	
	@Override
	public List<UserDepartmentEntity> queryList(Map<String, Object> map){
		return userDepartmentDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return userDepartmentDao.queryTotal(map);
	}
	
	@Override
	public void save(UserDepartmentEntity userDepartment){
		userDepartmentDao.save(userDepartment);
	}
	
	@Override
	public int update(UserDepartmentEntity userDepartment){
		return userDepartmentDao.update(userDepartment);
	}
	
	@Override
	public int delete(Long id){
		return userDepartmentDao.delete(id);
	}
	
	@Override
	public int deleteBatch(Long[] ids){
		return userDepartmentDao.deleteBatch(ids);
	}

	@Override
	public List<ImFriendUserData> queryGroupAndUser() {
		List<ImFriendUserData>  friendgroup = userDepartmentDao.queryGroupAndUser();
		for(ImFriendUserData fg:friendgroup){
			List<ImFriendUserInfoData> friends = fg.getList();
			if(friends!=null&&friends.size()>0){
				for(ImFriendUserInfoData  fr:friends){
					boolean  exist = sessionManager.exist(fr.getId().toString());
					if(exist)
						fr.setStatus("online");
				}
			} 
		}
		
		return friendgroup;
	}
	
}
