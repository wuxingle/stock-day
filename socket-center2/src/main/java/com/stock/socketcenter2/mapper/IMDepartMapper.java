package com.stock.socketcenter2.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stock.socketcenter2.entity.IMDepart;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author cloudtalk
 * @since 2019-01-15
 */
@Mapper
public interface IMDepartMapper extends BaseMapper<IMDepart> {

    @Select("select id as departId,departName,priority,status,created,updated from on_IMDepart where (uid=0 or uid=#{id}) and status=0 ")
    List<Map<String, Object>> getMyAllDepart(Integer id);

}
