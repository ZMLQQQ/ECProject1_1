package com.ectest;

import com.ectest.entity.Business;
import com.ectest.service.IBusinessService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class EcProject11ApplicationTests {

    @Autowired
    private com.ectest.mapper.businessMapper businessMapper;
    @Test
    void queryAllBusiness() {
        List<Business> businessList = businessMapper.selectList(null);
        businessList.forEach(System.out::println);
    }
    @Test
    void addBusiness() {
        Business business = new Business();
        business.setBusinessName("小周支付");
        business.setBusinessId("2022001");
        business.setAddress("云南省昆明市呈贡区");
        business.setBusinessType("网店");
        business.setCreateBy("小张");
        business.setPhone("18317829770");
        business.setRegionCode("001");
        int i = businessMapper.insert(business);
        System.out.println(i);
    }
    @Test
    void updateBusiness() {
        Business business = new Business();
        business.setBusinessName("小张煎饼");
        business.setBusinessId("202202");
        business.setAddress("云南省昆明市呈贡区");
        business.setBusinessType("商铺");
        business.setCreateBy("小张");
        business.setPhone("18317829770");
        business.setRegionCode("003");
        int i = businessMapper.updateById(business);
        System.out.println(i);
    }
    @Test
    void deleteBusiness() {
        Business business = new Business();
        business.setBusinessId("202202");
        int i = businessMapper.deleteById(business);
        System.out.println(i);
    }
    @Test
    void selectById() {
        Business business = new Business();
        business.setBusinessId("2022002");
        Business i = businessMapper.selectById(business.getBusinessId());
        System.out.println(i);
    }

    @Autowired
    private IBusinessService businessService;

    @Test
    void selectById1(){
        Business i = businessService.getById("2022001");
        System.out.println(i);
    }

    @Test
    void selectList1(){
        List<Business> businessList = businessService.list();
        businessList.forEach(System.out::println);
    }
    @Test
    void save(){
    }
}
