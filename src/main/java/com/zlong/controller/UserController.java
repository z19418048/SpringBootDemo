package com.zlong.controller;
import com.zlong.entity.dto.UserDto;
import com.zlong.entity.vo.ResultVo;
import com.zlong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
*用户控制器
*/
@RestController
@RequestMapping("/user")
public class UserController {

    //引入service层
    @Autowired
    UserService userService;
    /*
     *根据条件获取用户数量
     * */
    @GetMapping("/getUserNums")
    public ResultVo getUserNums(UserDto userDto){
        return userService.getUserNums(userDto);
    }

    /*
    * 根据条件获取用户详情(分页操作)
    * */

    @GetMapping("/getUserDetails")
    public ResultVo getUserDetails(UserDto userDto){
        return userService.getUserDetails(userDto);
    }
    /*
    * 通过条件去批量上传用户信息
    * */

    /*
    *  新增用户信息的方法
    * */
    @PostMapping("/setUserInfo")
    public ResultVo setUserInfo(@RequestBody(required = false) UserDto userDto){
        return userService.setUserInfo(userDto);
    }

    /*
    * 更新用户信息的方法
    * */
    @PutMapping("/updateUserInfo")
    public ResultVo updateUserInfo(@RequestBody(required = false) UserDto userDto){
        return userService.updateUserInfo(userDto);
    }

    /*
    * 删除用户信息的方法
    * */
    @DeleteMapping("/deleteUserInfo")
    public ResultVo deleteUserInfo(Integer id){
        return userService.deleteUserInfo(id);
    }

    /*
     * 批量删除用户信息的方法
     * */
    @DeleteMapping("/batchDeleteUserInfo")
    public ResultVo bathchDeleteUserInfo(@RequestParam(value = "idList" ,required = false) List<Integer> idList){
        return userService.bathchDeleteUserInfo(idList);
    }
    /*
    * 通过mybatis-plus批量获取用户信息
    * */
    @GetMapping("/batchGetUserInfo")
    public ResultVo batchGetUserInfo(){
        return userService.batchGetUserInfo();
    }
}