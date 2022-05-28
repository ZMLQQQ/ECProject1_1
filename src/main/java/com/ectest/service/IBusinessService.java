package com.ectest.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ectest.entity.Business;
import com.ectest.entity.rule;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


public interface IBusinessService extends IService<Business> {
    public void createRule(@RequestBody List<rule> ruleList);

}
