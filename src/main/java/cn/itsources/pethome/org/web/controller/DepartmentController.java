package cn.itsources.pethome.org.web.controller;

import cn.itsources.pethome.base.query.DepartmentQuery;
import cn.itsources.pethome.base.query.EmployeeQuery;
import cn.itsources.pethome.base.result.JSONResult;
import cn.itsources.pethome.base.result.PageList;
import cn.itsources.pethome.base.web.controller.BaseController;
import cn.itsources.pethome.org.domain.Department;
import cn.itsources.pethome.org.domain.Employee;
import cn.itsources.pethome.org.dto.IdsDto;
import cn.itsources.pethome.org.service.IDepartmentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
/**=================================================
 * 方法说明:不走试图解析器
 * 步骤说明：
 =================================================== **/
@RequestMapping("/department")
@Slf4j
@Api(value = "部门api",description = "document部门")/*打在类上，说明类的用处*/
public class DepartmentController extends BaseController<Department, DepartmentQuery> {
    @Autowired
    private IDepartmentService departmentService ;

    @GetMapping("/tree")
    public JSONResult tree(){
        return JSONResult.instance(departmentService.tree());
    }
}
