package com.stock.socketcenter2.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.socketcenter2.entity.IMGroup;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * IM群信息 Mapper 接口
 * </p>
 *
 * @author cloudtalk
 * @since 2019-01-15
 */
@Mapper
public interface IMGroupMapper extends BaseMapper<IMGroup> {

    List<Map<String, Object>> getGroupList(String[] array);


    @Select("select * from on_IMGroup where id in(select groupId from on_IMGroupMember where userid=#{id}) or type=3 ")
    List<Map<String, Object>> getMyGroupList(Integer id);

}
