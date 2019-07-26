package com.stock.socketcenter2.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.socketcenter2.api.service.IIMDepartService;
import com.stock.socketcenter2.entity.IMDepart;
import com.stock.socketcenter2.mapper.IMDepartMapper;
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
 * @since 2019-01-15
 */
@Service
@Qualifier(value = "IMDepartService")
public class IMDepartServiceImpl extends ServiceImpl<IMDepartMapper, IMDepart> implements IIMDepartService {

    @Override
    public List<Map<String, Object>> getMyAllDepart(Integer id) {
        return baseMapper.getMyAllDepart(id);
    }
}
