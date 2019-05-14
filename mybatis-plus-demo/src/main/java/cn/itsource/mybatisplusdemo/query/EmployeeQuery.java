package cn.itsource.mybatisplusdemo.query;

/**
 * @classname ${NAME}
 * @description TODO
 * @author zb
 * @date ${DATE}
 * @version 1.0
 */
public class EmployeeQuery extends BaseQuery{
    private String username;
    private String phone;
    private Integer status;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "EmployeeQuery{" +
                "username='" + username + '\'' +
                ", phone='" + phone + '\'' +
                ", status=" + status +
                '}';
    }
}