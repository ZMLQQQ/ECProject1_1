package com.ectest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ectest.entity.Business;
import com.ectest.entity.rule;
import com.ectest.mapper.businessMapper;
import com.ectest.mapper.ruleMapper;
import com.ectest.service.IBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class IBusinessServiceImpl extends ServiceImpl<businessMapper, Business> implements IBusinessService{
    @Autowired
    private ruleMapper ruleMapper;

    @Override
    public void createRule(@RequestBody List<rule> ruleList) {
        for (rule rule:ruleList) {
            ruleMapper.insert(rule);
        }
    }

}
