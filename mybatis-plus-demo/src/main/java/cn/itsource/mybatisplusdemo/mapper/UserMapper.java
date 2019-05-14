package cn.itsource.mybatisplusdemo.mapper;

import cn.itsource.mybatisplusdemo.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author zb
 * @version 1.0
 * @classname UserMapper
 * @description 用户Mapper接口
 * @date 2019/5/14
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
