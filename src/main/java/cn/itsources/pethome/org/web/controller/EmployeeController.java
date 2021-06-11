package cn.itsources.pethome.org.web.controller;

import cn.itsources.pethome.base.query.DepartmentQuery;
import cn.itsources.pethome.base.query.EmployeeQuery;
import cn.itsources.pethome.base.result.JSONResult;
import cn.itsources.pethome.base.web.controller.BaseController;
import cn.itsources.pethome.org.domain.Employee;
import cn.itsources.pethome.org.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController extends BaseController<Employee, EmployeeQuery> {

    @Autowired
    private EmployeeService employeeService ;

}
