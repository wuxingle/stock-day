package com.stock.socketcenter2.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.socketcenter2.api.service.IIMGroupMemberService;
import com.stock.socketcenter2.entity.IMGroupMember;
import com.stock.socketcenter2.mapper.IMGroupMemberMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 用户和群的关系表 服务实现类
 * </p>
 *
 * @author cloudtalk
 * @since 2019-01-15
 */
@Service
@Qualifier(value = "IMGroupMemberService")
public class IMGroupMemberServiceImpl extends ServiceImpl<IMGroupMemberMapper, IMGroupMember> implements IIMGroupMemberService {
    @Override
    public List<Map<String, Object>> getGroupMemberList(String ids) {
        return baseMapper.getGroupMemberList(ids.split("\\,"));
    }

    @Override
    public List<Map<String, Object>> getGroupMemberInfoById(Integer id) {
        return baseMapper.getGroupMemberInfoById(id);
    }
}
