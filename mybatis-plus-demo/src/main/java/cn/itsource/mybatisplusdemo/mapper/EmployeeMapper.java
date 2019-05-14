package cn.itsource.mybatisplusdemo.mapper;

import cn.itsource.mybatisplusdemo.domain.Employee;
import cn.itsource.mybatisplusdemo.query.EmployeeQuery;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zb
 * @since 2019-05-14
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

    /**
     * @author zb
     * @description 高级查询
     * @date 2019/5/14
     * @name selectByQuery
     * @param page
     * @param query
     * @return com.baomidou.mybatisplus.core.metadata.IPage<cn.itsource.mybatisplusdemo.domain.Employee>
     */
    IPage<Employee> selectByQuery(Page<Employee> page, @Param("query") EmployeeQuery query);
}
