package cn.itsources.pethome.org.service;

import cn.itsources.pethome.base.query.DepartmentQuery;
import cn.itsources.pethome.base.result.PageList;
import cn.itsources.pethome.base.service.IBaseService;
import cn.itsources.pethome.org.domain.Department;
import cn.itsources.pethome.org.dto.IdsDto;

import java.util.List;
/**=================================================
 * 方法说明:Department的service层
 * 步骤说明：
 =================================================== **/
public interface IDepartmentService extends IBaseService<Department,DepartmentQuery> {
    /** 查询部门树 **/
    List<Department> tree();
}
