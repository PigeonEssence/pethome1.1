package cn.itsources.pethome.org.mapper;

import cn.itsources.pethome.base.mapper.BaseMapper;
import cn.itsources.pethome.base.query.DepartmentQuery;
import cn.itsources.pethome.org.domain.Department;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentMapper extends BaseMapper<Department,DepartmentQuery> {
    //查询部门的树
    List<Department> selectTree();
}
