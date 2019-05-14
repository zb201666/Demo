package cn.itsource.mybatisplusdemo.service.impl;

import cn.itsource.mybatisplusdemo.domain.Employee;
import cn.itsource.mybatisplusdemo.mapper.EmployeeMapper;
import cn.itsource.mybatisplusdemo.query.EmployeeQuery;
import cn.itsource.mybatisplusdemo.service.IEmployeeService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zb
 * @since 2019-05-14
 */
@Service
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements IEmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public IPage<Employee> selectByQuery(Page<Employee> page, EmployeeQuery query) {
        return employeeMapper.selectByQuery(page, query);
    }
}
