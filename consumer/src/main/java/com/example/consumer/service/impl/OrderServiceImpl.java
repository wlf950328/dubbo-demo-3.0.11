package com.example.consumer.service.impl;

import com.example.commoninterface.entity.User2Info;
import com.example.commoninterface.entity.UserInfo;
import com.example.commoninterface.service.OrderService;
import com.example.commoninterface.service.UserInfoService2;
import com.example.commoninterface.service.UserInfoService1;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OrderServiceImpl implements OrderService {

    @DubboReference
    private UserInfoService1 userInfoService1;

    @DubboReference
    private UserInfoService2 userInfoService2;

    @Override
    public List<Object> initOrder(String userId) {
        List<Object> objects = new ArrayList<>();
        long start = 0, end;
        try {
            start = System.currentTimeMillis();
            List<UserInfo> userInfoById = userInfoService1.getUserInfoById(userId);
            end = System.currentTimeMillis();
            System.out.println("userInfoService1 getUserInfoById takes " + (end - start) + "ms");
            objects.add(userInfoById);
        } catch (Exception e) {
            end = System.currentTimeMillis();
            System.out.println("userInfoService1 getUserInfoById connect timeout, "
                    + (end - start) + "ms");
        }
        try {
            start = System.currentTimeMillis();
            List<User2Info> userInfoById1 = userInfoService2.getUserInfo(userId);
            end = System.currentTimeMillis();
            System.out.println("userInfoService2 getUserInfo takes " + (end - start) + "ms");
            objects.add(userInfoById1);
        } catch (Exception e) {
            end = System.currentTimeMillis();
            System.out.println("userInfoService2 getUserInfo connect timeout, "
                    + (end - start) + "ms");
        }
        try {
            start = System.currentTimeMillis();
            List<User2Info> userInfoById1 = userInfoService2.getUserInfoById(userId);
            end = System.currentTimeMillis();
            System.out.println("userInfoService2 getUserInfoById takes " + (end - start) + "ms");
            objects.add(userInfoById1);
        } catch (Exception e) {
            end = System.currentTimeMillis();
            System.out.println("userInfoService2 getUserInfoById connect timeout, "
                    + (end - start) + "ms");
        }
        return objects;
    }

}
