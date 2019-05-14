package cn.itsource.mybatisplusdemo.mapper;

import cn.itsource.mybatisplusdemo.domain.Department;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zb
 * @since 2019-05-14
 */
@Mapper
public interface DepartmentMapper extends BaseMapper<Department> {

}
