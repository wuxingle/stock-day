package com.stock.socketcenter2.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.socketcenter2.api.service.IIMUserFriendsService;
import com.stock.socketcenter2.entity.IMUserFriends;
import com.stock.socketcenter2.mapper.IMUserFriendsMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cloudtalk
 * @since 2019-01-04
 */
@Service
@Qualifier(value = "IMUserFriendsService")
public class IMUserFriendsServiceImpl extends ServiceImpl<IMUserFriendsMapper, IMUserFriends> implements IIMUserFriendsService {

    public List<Map<String, Object>> getMyNewFriends(Integer id) {
        return baseMapper.getMyNewFriends(id);
    }

    @Override
    public List<Map<String, Object>> getMyFriends(Integer id) {
        return baseMapper.getMyFriends(id);
    }
}
