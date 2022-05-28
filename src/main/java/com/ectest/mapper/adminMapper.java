package com.ectest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ectest.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface adminMapper extends BaseMapper<Admin> {

    Admin findAdminByadminIdAndPassword(String adminId,String password);
}
