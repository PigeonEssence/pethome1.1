package cn.itsources.pethome.org.service.impl;

import cn.itsources.pethome.base.query.EmployeeQuery;
import cn.itsources.pethome.base.service.impl.IBaseServiceImpl;
import cn.itsources.pethome.org.domain.Employee;
import cn.itsources.pethome.org.mapper.EmployeeMapper;
import cn.itsources.pethome.org.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends IBaseServiceImpl<Employee, EmployeeQuery> implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;
}
