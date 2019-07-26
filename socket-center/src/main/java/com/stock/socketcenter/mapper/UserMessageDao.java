package com.stock.socketcenter.mapper;



import com.stock.socketcenter.entity.UserMessageEntity;
import com.stock.socketcenter.webserver.base.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author qiqiim
 * @email 1044053532@qq.com
 * @date 2017-11-23 10:47:47
 */
@Mapper
public interface UserMessageDao extends BaseDao<UserMessageEntity> {
	/**
	 * 获取历史记录
	 * @param map
	 * @return
	 */
	List<UserMessageEntity> getHistoryMessageList(Map<String, Object> map);
	/**
	 * 获取历史记录总条数
	 * @param map
	 * @return
	 */
	int getHistoryMessageCount(Map<String, Object> map);
	/**
	 * 获取离线消息
	 * @param map
	 * @return
	 */
	List<UserMessageEntity> getOfflineMessageList(Map<String, Object> map);
	
	/**
	 * 修改消息为已读状态
	 * @param map
	 * @return
	 */
	int updatemsgstate(Map<String, Object> map);
	
}
