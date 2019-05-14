package cn.itsource.mybatisplusdemo.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author zb
 * @since 2019-05-14
 */
@TableName("t_department")
public class Department implements Serializable {

private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 部门标识
     */
    private String sn;

    private String name;

    private Long phone;

    /**
     * 传真
     */
    private String fax;

    /**
     * 部门路径
     */
    @TableField("departmentPath")
    private String departmentPath;

    /**
     * 上级部门编号
     */
    @TableField("parentId")
    private Long parentId;

    /**
     * 部门主管，关联员工主键
     */
    @TableField("managerId")
    private Long managerId;

    private String remarks;

    /**
     * 0表示正常，-1表示停用
     */
    private Integer status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getDepartmentPath() {
        return departmentPath;
    }

    public void setDepartmentPath(String departmentPath) {
        this.departmentPath = departmentPath;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Department{" +
        "id=" + id +
        ", sn=" + sn +
        ", name=" + name +
        ", phone=" + phone +
        ", fax=" + fax +
        ", departmentPath=" + departmentPath +
        ", parentId=" + parentId +
        ", managerId=" + managerId +
        ", remarks=" + remarks +
        ", status=" + status +
        "}";
    }
}
