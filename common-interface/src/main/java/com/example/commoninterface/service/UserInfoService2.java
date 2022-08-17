package com.example.commoninterface.service;

import com.example.commoninterface.entity.User2Info;

import java.util.List;

/**
 * @author: lfwang
 * @date: 2021/7/12
 * @description: TODO
 */
public interface UserInfoService2 {

    List<User2Info> getUserInfoById(String userId);

    List<User2Info> getUserInfo(String userId);
}
