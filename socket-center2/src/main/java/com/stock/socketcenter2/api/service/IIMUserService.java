package com.stock.socketcenter2.api.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.stock.socketcenter2.entity.IMUser;


import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author cloudtalk
 * @since 2019-01-04
 */
public interface IIMUserService extends IService<IMUser> {

    List<IMUser> findUserById(Integer id);
    List<Map<String, Object>> selectUser2();
    Page<IMUser> getAllUserBypage(Page<IMUser> page);
    List<Map<String, Object>> getUsersInfo(String ids);

}
