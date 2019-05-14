package cn.itsource.mybatisplusdemo.service.impl;

import cn.itsource.mybatisplusdemo.MybatisPlusDemoApplication;
import cn.itsource.mybatisplusdemo.domain.User;
import cn.itsource.mybatisplusdemo.service.IUserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybatisPlusDemoApplication.class)
public class UserServiceImplTest {

    @Autowired
    private IUserService userService;

    /**
     * @author zb
     * @description 测试查询所有
     * @date 2019/5/14
     * @name testList
     * @param
     * @return void
     */
    @Test
    public void testList() throws  Exception{
        List<User> users = userService.list();
        users.forEach(u->{
            System.out.println(u);
        });
    }


    /**
     * @author zb
     * @description 测试保存
     * @date 2019/5/14
     * @name testSave
     * @param
     * @return void
     */
    @Test
    public void testSave() throws  Exception{
        User user = new User();
        user.setName("张斌");
        user.setAge(24);
        user.setEmail("1639047465@qq.com");
        userService.save(user);
    }


    /**
     * @author zb
     * @description 测试根据id查询对象
     * @date 2019/5/14
     * @name testGetById
     * @param
     * @return void
     */
    @Test
    public void testGetById() throws  Exception{
        User user = userService.getById(1L);
        System.out.println(user);
    }


    /**
     * @author zb
     * @description 测试分页
     * @date 2019/5/14
     * @name testPage
     * @param
     * @return void
     */
    @Test
    public void testPage() throws  Exception{

        Page<User> page = new Page<User>();
        page.setCurrent(2);//设置当前页
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        IPage<User> userPage = userService.page(page, queryWrapper);
        List<User> records = userPage.getRecords();
        records.forEach(u->{
            System.out.println(u);
        });
    }
}