package com.stock.socketcenter.mapper;


import com.stock.socketcenter.entity.UserInfoEntity;
import com.stock.socketcenter.webserver.base.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 用户信息表
 * 
 * @author qiqiim
 * @email 1044053532@qq.com
 * @date 2017-11-27 09:38:52
 */
@Mapper
public interface UserInfoDao extends BaseDao<UserInfoEntity> {
	
}
