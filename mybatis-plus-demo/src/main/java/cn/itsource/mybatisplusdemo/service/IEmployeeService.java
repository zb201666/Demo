package cn.itsource.mybatisplusdemo.service;

import cn.itsource.mybatisplusdemo.domain.Employee;
import cn.itsource.mybatisplusdemo.query.EmployeeQuery;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zb
 * @since 2019-05-14
 */
public interface IEmployeeService extends IService<Employee> {
    /**
     * @author zb
     * @description 高级查询
     * @date 2019/5/14
     * @name selectByQuery
     * @param page
     * @param query
     * @return com.baomidou.mybatisplus.core.metadata.IPage<cn.itsource.mybatisplusdemo.domain.Employee>
     */
    IPage<Employee> selectByQuery(Page<Employee> page, EmployeeQuery query);
}
