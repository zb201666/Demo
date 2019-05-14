package cn.itsource.mybatisplusdemo.controller;

import cn.itsource.mybatisplusdemo.domain.Employee;
import cn.itsource.mybatisplusdemo.query.EmployeeQuery;
import cn.itsource.mybatisplusdemo.service.IEmployeeService;
import cn.itsource.mybatisplusdemo.util.AjaxResult;
import cn.itsource.mybatisplusdemo.util.PageList;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @classname ${NAME}
 * @description TODO
 * @author zb
 * @date ${DATE}
 * @version 1.0
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    public IEmployeeService employeeService;

    /**
    * 保存和修改公用的
    * @param employee  传递的实体
    * @return Ajaxresult转换结果
    */
    @RequestMapping(value="/add",method= RequestMethod.POST)
    public AjaxResult save(@RequestBody Employee employee){
        try {
            if(employee.getId()!=null){
                employeeService.updateById(employee);
            }else{
                employeeService.save(employee);
            }
            return AjaxResult.me();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.me().setMessage("保存对象失败！"+e.getMessage());
        }
    }

    /**
    * 删除对象信息
    * @param id
    * @return
    */
    @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
    public AjaxResult delete(@PathVariable("id") Integer id){
        try {
            employeeService.removeById(id);
            return AjaxResult.me();
        } catch (Exception e) {
        e.printStackTrace();
            return AjaxResult.me().setMessage("删除对象失败！"+e.getMessage());
        }
    }

    //获取对象
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Employee get(@RequestParam(value="id",required=true) Long id)
    {
        return employeeService.getById(id);
    }


    /**
    * 查看所有的对象信息
    * @return
    */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<Employee> list(){

        return employeeService.list(null);
    }


    /**
    * 分页查询数据
    *
    * @param query 查询对象
    * @return PageList 分页对象
    */
    @RequestMapping(value = "/json",method = RequestMethod.POST)
    public PageList<Employee> json(@RequestBody EmployeeQuery query){
        Page<Employee> page = new Page<Employee>(query.getPage(),query.getRows());
        QueryWrapper<Employee> employeeQueryWrapper = new QueryWrapper<>();
        if(!StringUtils.isEmpty(query.getUsername())){
            employeeQueryWrapper.like("username", query.getUsername());
        }
        if(!StringUtils.isEmpty(query.getPhone())){
            employeeQueryWrapper.like("phone", query.getPhone());
        }
        if(query.getStatus()!=null){
            employeeQueryWrapper.eq("status", query.getStatus());
        }
        IPage<Employee> page1 = employeeService.page(page, employeeQueryWrapper);
        return new PageList<Employee>(page1.getTotal(),page1.getRecords());
    }


    /**
    * 自定义高级查询数据
    *
    * @param query 查询对象
    * @return PageList 分页对象
    */
    @RequestMapping(value = "/page",method = RequestMethod.POST)
    public PageList<Employee> page(@RequestBody EmployeeQuery query){
        System.out.println(query);
        Page<Employee> page = new Page<Employee>(query.getPage(),query.getRows());
        IPage<Employee> page1 = employeeService.selectByQuery(page, query);
        return new PageList<Employee>(page1.getTotal(),page1.getRecords());
    }
}
