package cn.itsources.pethome.base.query;


import org.springframework.util.StringUtils;
import lombok.Data;
//基础查询对象
@Data
public class BaseQuery {
    //当前页
    private Integer page = 1;
    /*每夜条数*/
    private Integer pageSize = 10;
    /*关键字查询*/
    private String keyword;

    public String getKeyword(){
        return StringUtils.hasLength(keyword)?keyword.trim() : null;
    }

    //分页开始
    public Integer getFirst(){
        return (page - 1) * pageSize ;
    }
}
