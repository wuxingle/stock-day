package com.stock.socketcenter.mapper;




import com.stock.socketcenter.entity.UserDepartmentEntity;
import com.stock.socketcenter.webserver.base.dao.BaseDao;
import com.stock.socketcenter.webserver.user.model.ImFriendUserData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 部门
 * 
 * @author qiqiim
 * @email 1044053532@qq.com
 * @date 2017-11-27 09:38:52
 */
@Mapper
public interface UserDepartmentDao extends BaseDao<UserDepartmentEntity> {
	
	public List<ImFriendUserData> queryGroupAndUser();
}
