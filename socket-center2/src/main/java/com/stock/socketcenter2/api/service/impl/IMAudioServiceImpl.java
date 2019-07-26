package com.stock.socketcenter2.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.socketcenter2.api.service.IIMAudioService;
import com.stock.socketcenter2.entity.IMAudio;
import com.stock.socketcenter2.mapper.IMAudioMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cloudtalk
 * @since 2019-01-15
 */
@Service
@Qualifier(value = "IMAudioService")
public class IMAudioServiceImpl extends ServiceImpl<IMAudioMapper, IMAudio> implements IIMAudioService {

}
