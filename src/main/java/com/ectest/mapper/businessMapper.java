package com.ectest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ectest.entity.Business;
import com.ectest.entity.clearingResult;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface businessMapper extends BaseMapper<Business> {

    Business findBusinessBybusinessIdAndPassword(String businessId,String password);
    clearingResult calculateClearingResult(Double total,String ruleId,String businessId);
}
