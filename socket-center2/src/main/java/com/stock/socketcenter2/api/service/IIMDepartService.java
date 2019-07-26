package com.stock.socketcenter2.api.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.socketcenter2.entity.IMDepart;


import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cloudtalk
 * @since 2019-01-15
 */
public interface IIMDepartService extends IService<IMDepart> {

    List<Map<String, Object>> getMyAllDepart(Integer id);

}
