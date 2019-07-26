package com.stock.socketcenter2.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stock.socketcenter2.api.service.IIMUserGeoDataService;
import com.stock.socketcenter2.entity.IMUserGeoData;
import com.stock.socketcenter2.mapper.IMUserGeoDataMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author cloudtalk
 * @since 2019-01-10
 */
@Service
@Qualifier(value = "imUserGeoDataService")
public class IMUserGeoDataServiceImpl extends ServiceImpl<IMUserGeoDataMapper, IMUserGeoData> implements IIMUserGeoDataService {

}
