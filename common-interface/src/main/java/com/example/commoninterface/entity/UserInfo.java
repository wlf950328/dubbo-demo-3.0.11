package com.example.commoninterface.entity;

import java.io.Serializable;

/**
 * @author: lfwang
 * @date: 2021/7/8
 * @description: TODO
 */
public class UserInfo implements Serializable {

    private String id;
    private String name;
    private String address;

    public UserInfo() {
    }

    public UserInfo(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
