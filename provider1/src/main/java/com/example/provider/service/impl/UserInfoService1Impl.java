package com.example.provider.service.impl;

import com.example.commoninterface.entity.UserInfo;
import com.example.commoninterface.service.UserInfoService1;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lfwang
 * @date: 2021/7/8
 * @description: TODO
 */
@DubboService
public class UserInfoService1Impl implements UserInfoService1 {

    @Override
    public List<com.example.commoninterface.entity.UserInfo> getUserInfoById(String userId) {
        try {
            Thread.sleep(2555);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<UserInfo> userInfos = new ArrayList<>();
        userInfos.add(new UserInfo("1", "张三", "浙江省温州市鹿城区"));
        userInfos.add(new UserInfo("1", "张三", "浙江省台州市玉环"));
        return userInfos;
    }

}
