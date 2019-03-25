package com.zxc2.dao;

import com.zxc2.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Author zhongxiancai
 * @Description
 * @Date: Created in 2019/3/25 11:04.
 * @Modified By:
 */
@Mapper
public interface UserMapper {

    User findById(@Param("id")String id);
}
