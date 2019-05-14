package cn.itsource.mybatisplusdemo.service.impl;

import cn.itsource.mybatisplusdemo.domain.Department;
import cn.itsource.mybatisplusdemo.mapper.DepartmentMapper;
import cn.itsource.mybatisplusdemo.service.IDepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}
