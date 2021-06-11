package cn.itsources.pethome.org.service.impl;

import cn.itsources.pethome.base.query.DepartmentQuery;
import cn.itsources.pethome.base.result.PageList;
import cn.itsources.pethome.base.service.impl.IBaseServiceImpl;
import cn.itsources.pethome.org.domain.Department;
import cn.itsources.pethome.org.dto.IdsDto;
import cn.itsources.pethome.org.mapper.DepartmentMapper;
import cn.itsources.pethome.org.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl extends IBaseServiceImpl<Department,DepartmentQuery> implements IDepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper ;

    @Override
    public List<Department> tree() {
        return departmentMapper.selectTree();
    }
}
