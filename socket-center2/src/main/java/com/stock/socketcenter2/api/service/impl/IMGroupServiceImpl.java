package com.stock.socketcenter2.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.socketcenter2.api.service.IIMGroupService;
import com.stock.socketcenter2.entity.IMGroup;
import com.stock.socketcenter2.mapper.IMGroupMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * IM群信息 服务实现类
 * </p>
 *
 * @author cloudtalk
 * @since 2019-01-15
 */
@Service
@Qualifier(value = "IMGroupService")
public class IMGroupServiceImpl extends ServiceImpl<IMGroupMapper, IMGroup> implements IIMGroupService {
    @Override
    public List<Map<String, Object>> getGroupList(String ids) {
        return baseMapper.getGroupList(ids.split("\\,"));
    }

    @Override
    public List<Map<String, Object>> getMyGroupList(Integer id)
    {
       return baseMapper.getMyGroupList(id);
    }
}
