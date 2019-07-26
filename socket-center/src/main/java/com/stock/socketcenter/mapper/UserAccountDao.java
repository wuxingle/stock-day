package com.stock.socketcenter.mapper;





import com.stock.socketcenter.entity.UserAccountEntity;
import com.stock.socketcenter.webserver.base.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * 用户帐号
 * 
 * @author qiqiim
 * @email 1044053532@qq.com
 * @date 2017-11-27 09:38:52
 */
@Mapper
public interface UserAccountDao extends BaseDao<UserAccountEntity> {
	public UserAccountEntity queryObjectByAccount(Map<String, Object> map);
}
