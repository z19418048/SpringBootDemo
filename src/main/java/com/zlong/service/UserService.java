package com.zlong.service;
import com.zlong.entity.dto.UserDto;
import com.zlong.entity.vo.ResultVo;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

/*
* 用户服务层接口
* */
public interface UserService {
    /*
     * 获取用户数量的方法
     * @return String
     * */
    ResultVo getUserNums(UserDto userDto);
    /*
     * 通过用户ID获取用户详情
     * @return UserVo*/
    ResultVo getUserDetails(UserDto userDto);
    /*
     *  新增用户信息的方法
     * */
    ResultVo setUserInfo(UserDto userDto);
    /*
     * 更新用户信息的方法
     * */
    ResultVo updateUserInfo(UserDto userDto);
    /*
     * 删除用户信息的方法
     * */
    ResultVo deleteUserInfo(Integer id);
    /*
     * 批量删除用户信息的方法
     * */
    ResultVo bathchDeleteUserInfo(List<Integer> idList);
    /*
     * 通过mybatis-plus批量获取用户信息
     * */
    public ResultVo batchGetUserInfo();
}
