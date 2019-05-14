package cn.itsource.mybatisplusdemo.service.impl;

import cn.itsource.mybatisplusdemo.domain.User;
import cn.itsource.mybatisplusdemo.mapper.UserMapper;
import cn.itsource.mybatisplusdemo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zb
 * @version 1.0
 * @classname UserServiceImpl
 * @description 用户service层接口实现类
 * @date 2019/5/14
 */
@Service
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements IUserService{
}
