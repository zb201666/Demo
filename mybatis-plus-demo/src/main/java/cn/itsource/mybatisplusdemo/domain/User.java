package cn.itsource.mybatisplusdemo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class User {
    //配置主键生成策略
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
