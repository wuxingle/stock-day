package com.stock.socketcenter2.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.socketcenter2.entity.IMGroup;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * IM群信息 服务类
 * </p>
 *
 * @author cloudtalk
 * @since 2019-01-15
 */
public interface IIMGroupService extends IService<IMGroup> {

    List<Map<String, Object>> getGroupList(String ids);

    List<Map<String, Object>> getMyGroupList(Integer id);


}
