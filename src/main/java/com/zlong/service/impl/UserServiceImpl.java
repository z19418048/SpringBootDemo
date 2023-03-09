package com.zlong.service.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zlong.dao.UserMapper;
import com.zlong.entity.dto.UserDto;
import com.zlong.entity.po.UserPo;
import com.zlong.entity.vo.ResultVo;
import com.zlong.service.UserService;
import com.zlong.utils.ResultUtils;
import com.zlong.utils.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

/*
* 用户服务层实现类
* */
@Service
public class UserServiceImpl implements UserService {
    Logger logger = Logger.getLogger("UserServiceImpl");
    //引入service层
    @Resource
    UserMapper userMapper;
    /*
     * 获取用户的总数量
     * @return
     * */

    @Override
    public ResultVo getUserNums(UserDto userDto) {
        return ResultUtils.success("查询成功","用户的总数量为"+userMapper.getUserNums(userDto));
    }

    @Override
    public ResultVo getUserDetails(UserDto userDto) {
        List list = userMapper.getUserDetails(userDto);
        return  ResultUtils.success("查询成功",list);
    }

    @Override
    public ResultVo setUserInfo(UserDto userDto) {
        if (userDto==null){
            return ResultUtils.failed("当前对象不能为空");
        }
        if (StringUtils.isBlank(userDto.getName())){
            return ResultUtils.failed("用户名称不能为空或者空串");
        }
        UserPo userPo = new UserPo();
        BeanUtils.copyProperties(userDto,userPo);
        Integer integer = userMapper.setUserInfo(userPo);
        if (integer > 0){
            return ResultUtils.success("添加成功");
        }
        return ResultUtils.failed("添加失败");
    }
    @Override
    public ResultVo updateUserInfo(UserDto userDto) {
        if (userDto==null || userDto.getId()==null){
            return ResultUtils.failed("当前对象或当前对象的ID不能为空");
        }
        if (StringUtils.isBlank(userDto.getName())){
            return ResultUtils.failed("用户名称不能为空或者空串");
        }
        UserPo userPo = new UserPo();
        BeanUtils.copyProperties(userDto,userPo);
        Integer integer = userMapper.updateUserInfo(userPo);
        if (integer > 0){
            return ResultUtils.success("更新成功");
        }
        return ResultUtils.failed("更新失败");
    }

    @Override
    public ResultVo deleteUserInfo(Integer id) {
        if (id == null){
            logger.warning("传入的用户ID不能为空");
            return ResultUtils.failed("传入的用户ID不能为空");
        }
        Integer integer = userMapper.deleteUserInfo(id);
        if (integer > 0){
            return ResultUtils.success("删除成功");
        }
        return ResultUtils.failed("删除失败");
    }

    @Override
    public ResultVo bathchDeleteUserInfo(List<Integer> idList) {
        if (idList==null ||  idList.size()==0){
            return ResultUtils.success("请提供需要删除的id");
        }
        Integer integer = userMapper.batchDeleteUserInfo(idList);
        if (integer > 0){
            return ResultUtils.success("批量删除操作成功",integer);
        }
        return ResultUtils.failed("批量删除操作失败");
    }

    @Override
    public ResultVo batchGetUserInfo() {
        QueryWrapper queryWrapper = new QueryWrapper();
        HashMap map = new HashMap();
        map.put("age",20);
        queryWrapper.allEq(map);
        List<UserPo> userPoList = userMapper.selectList(queryWrapper);
        return ResultUtils.success("查询成功",userPoList);
    }
}
