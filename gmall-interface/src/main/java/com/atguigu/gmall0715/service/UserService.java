package com.atguigu.gmall0715.service;

import com.atguigu.gmall0715.bean.UserAddress;
import com.atguigu.gmall0715.bean.UserInfo;

import java.util.List;

//业务层
public interface UserService {
    /**
     * 查询所有用户信息
     * @return
     */
    List<UserInfo> findAll();

    //想根据用户id或者用户的昵称或者根据用户名称等多个不同的字段进行查询，如果什么都不输入，则查询所有
    List<UserInfo> findByUserInfo(UserInfo userInfo);

    //模糊查询 nickName
    List<UserInfo> findByNickName(String nickName);

    /**
     * 添加
     * @param userInfo
     */
    void addUser(UserInfo userInfo);
    /*
    修改
     */
    void updUser(UserInfo userInfo);
    /*
    删除
     */
    void delUser(UserInfo userInfo);

    /**
     * 根据用户id查询用户收货列表
     * @param userId
     * @return
     */
    List<UserAddress> findUserAddressListByUserId(String userId);
    /**
     * 根据用户id查询用户收货列表
     * @param userAddress
     * @return
     */
    List<UserAddress> findUserAddressListByUserId(UserAddress userAddress);

}
