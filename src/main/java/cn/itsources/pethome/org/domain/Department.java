package cn.itsources.pethome.org.domain;

import cn.itsources.pethome.base.domain.BaseDomain;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
public class Department extends BaseDomain {
    private String sn;
    private String name;
    private Integer state;
    private Department parent;

    /** 当前部门的子部门集合
     @JsonInclude(value = JsonInclude.Include.NON_EMPTY) :如果为空，就不参与JSON转换
      * **/
    @JsonInclude(value = JsonInclude.Include.NON_EMPTY)
    private Employee manager;
    private List<Department> children;

}
