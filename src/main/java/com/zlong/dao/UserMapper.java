package com.zlong.dao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zlong.entity.dto.UserDto;
import com.zlong.entity.po.UserPo;

import java.util.List;

/*
* 用户Mapper
* */
public interface UserMapper extends BaseMapper<UserPo> {
    /*
    * 获取用户的总数量
    * @return
    * */
    Integer getUserNums(UserDto userDto);
    /*
     * 通过用户ID获取用户详情
     * */
    List getUserDetails(UserDto userDto);
    /*
     *  新增用户信息的方法
     * */
    Integer setUserInfo(UserPo userPo);
    /*
     * 更新用户信息的方法
     * */
    Integer updateUserInfo(UserPo userPo);
    /*
     * 删除用户信息的方法
     * */
    Integer deleteUserInfo(Integer id);
    /*
     * 批量删除用户信息的方法
     * */
    Integer batchDeleteUserInfo(List<Integer> idList);
}
