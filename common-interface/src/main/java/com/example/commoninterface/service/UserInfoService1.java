package com.example.commoninterface.service;

import com.example.commoninterface.entity.UserInfo;

import java.util.List;

/**
 * @author: lfwang
 * @date: 2021/7/8
 * @description: TODO
 */
public interface UserInfoService1 {

    List<UserInfo> getUserInfoById(String userId);
}
