package com.example.user2provider.impl;

import com.example.commoninterface.entity.User2Info;
import com.example.commoninterface.service.UserInfoService2;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.Arrays;
import java.util.List;

/**
 * @author: lfwang
 * @date: 2021/7/12
 * @description: TODO
 */
@DubboService
public class UserInfoService2Impl implements UserInfoService2 {

    @Override
    public List<User2Info> getUserInfo(String userId) {
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        User2Info user2Info1 = new User2Info("3", "王五", "甘肃省");
        User2Info user2Info2 = new User2Info("3", "王五", "江西省");
        return Arrays.asList(user2Info1, user2Info2);
    }

    @Override
    public List<User2Info> getUserInfoById(String userId) {
        try {
            Thread.sleep(3210);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        User2Info user2Info1 = new User2Info("2", "李四", "云南省");
        User2Info user2Info2 = new User2Info("2", "李四", "四川省");
        return Arrays.asList(user2Info1, user2Info2);
    }

}
