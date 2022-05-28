package com.ectest.controller;

import com.ectest.entity.Admin;
import com.ectest.entity.Business;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class adminController {
    @Autowired
    private com.ectest.mapper.adminMapper adminMapper;

    //管理员登录
    @GetMapping("/admin/login/{adminId}/{password}")
    public  String login(@PathVariable String adminId, @PathVariable String password){
        Admin admin= (Admin) adminMapper.findAdminByadminIdAndPassword(adminId,password);
        if(admin == null){
            return "please login in first";
        }
        else
            return  "Welcom "+admin.getAdminName();
    }

    @Autowired
    private com.ectest.mapper.businessMapper businessMapper;

    //删除商家
    @DeleteMapping("/admin/deleteBusiness/{businessId}")
    String deleteBusiness(@PathVariable String businessId) {
        Business business = new Business();
        business.setBusinessId(businessId);
        int i = businessMapper.deleteById(business);
        if(i==1){
            return "删除成功！";
        }
        return "删除失败！";
    }

    //查询商家
    @GetMapping("/admin/selectById/{businessId}")
    public Business selectById(@PathVariable String businessId) {
        Business business = new Business();
        business.setBusinessId(businessId);
        Business i = businessMapper.selectById(business.getBusinessId());
        return i;
    }

    //查询全部商家
    @GetMapping("/admin/queryAllBusiness")
    public List<Business> queryAllBusiness() {
        List<Business> businessList = businessMapper.selectList(null);
        return businessList;
    }
}
