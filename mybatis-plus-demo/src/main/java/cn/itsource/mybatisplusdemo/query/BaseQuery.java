package cn.itsource.mybatisplusdemo.query;

/**
 * @author zb
 * @version 1.0
 * @classname BaseQuery
 * @description 高级查询公共父类
 * @date 2019/5/14
 */
public class BaseQuery {
    private int page = 1;//当前页
    private int rows = 10;//当前页数量

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }
}
