package com.ectest.controller;

import com.ectest.entity.Business;
import com.ectest.entity.rule;
import com.ectest.service.IBusinessService;
import com.ectest.vo.LogInVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


@RestController
public class businessController {
    @Autowired
    private com.ectest.mapper.businessMapper businessMapper;

    //更新商家
    @PutMapping("/business/updateBusiness/{businessName}/{businessId}/{address}/{businessType}/{createBy}/{phone}/{regionCode}")
    public void updateBusiness(@PathVariable String businessName,
                        @PathVariable String businessId,
                        @PathVariable String address,
                        @PathVariable String businessType,
                        @PathVariable String createBy,
                        @PathVariable String phone,
                        @PathVariable String regionCode) {
        Business business = new Business();
        business.setBusinessName(businessName);
        business.setBusinessId(businessId);
        business.setAddress(address);
        business.setBusinessType(businessType);
        business.setCreateBy(createBy);
        business.setPhone(phone);
        business.setRegionCode(regionCode);
        int i = businessMapper.updateById(business);
        System.out.println(i);
    }

    //搜索商家
    @GetMapping("/business/selectById/{businessId}")
    private Business selectById(@PathVariable String businessId) {
        Business business = new Business();
        business.setBusinessId(businessId);
        Business i = businessMapper.selectById(business.getBusinessId());
        return i;
    }

    //商家登录
    @PostMapping("/business/login")
    public  String login(@RequestBody LogInVO logInVO){
        String businessId = logInVO.getBusinessId();
        String password = logInVO.getPassword();
        Business business= (Business)businessMapper.findBusinessBybusinessIdAndPassword(businessId,password);
        if(business == null){
            return "0";
        }
        else
            return  "Welcom "+business.getBusinessName();
    }

    @Autowired
    private IBusinessService businessService;

    //创建规则
    @PostMapping("/business/createRule")
    public String createRule(@RequestBody List<rule> ruleList){
        System.out.println(ruleList);
        try{
            businessService.createRule(ruleList);
            return "成功";
        } catch (Exception e){
            return "失败";
        }


    }

    //注册商家
    @PostMapping(value = "/business/addBusiness",produces = "application/json;charset=utf-8")
    public String addBusiness(@RequestBody Business business) {
        int i = businessMapper.insert(business);
        if(i==1){
            return "创建成功！";
        }
        return "创建失败！";
    }

}
