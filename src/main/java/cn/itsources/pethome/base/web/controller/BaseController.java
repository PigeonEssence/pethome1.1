package cn.itsources.pethome.base.web.controller;

import cn.itsources.pethome.base.result.JSONResult;
import cn.itsources.pethome.base.result.PageList;
import cn.itsources.pethome.base.service.IBaseService;
import cn.itsources.pethome.org.domain.Department;
import cn.itsources.pethome.org.dto.IdsDto;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class BaseController<T,Q> {

    /**=================================================
     * 方法说明:根据ID查询对应的部门
     * 步骤说明：
     =================================================== **/
    @Autowired
    private IBaseService<T,Q> baseService;

    @GetMapping("/sl1/{id}")
    @ApiOperation(value = "根据id查询对应的部门")
    public JSONResult selectById(@PathVariable(value = "id",required = true) Long id){
        Object object = baseService.selectById(id);
        return JSONResult.instance(object);
    }
    /**=================================================
     * 方法说明:查询所有部门
     * 步骤说明：
     =================================================== **/
    @GetMapping("/all")
    @ApiOperation(value = "查询所有部门")
    public JSONResult all(){
        return JSONResult.instance(baseService.selectAll());
    }
    /**=================================================
     * 方法说明:@RequestBody 把json转化成一个对象,和ResponseBody反过来
     * 添加部门
     * 步骤说明：
     =================================================== **/
    @ApiOperation(value = "插入一个部门")
    @PostMapping
    public JSONResult insert(@ApiParam(name="编号",required = true) @RequestBody T obj){
        baseService.insert(obj);
        return JSONResult.instance(baseService.insert(obj));
    }
    /**=================================================
     * 方法说明:通过id修改部门
     * 步骤说明：
     =================================================== **/
    //@RequestMapping(method = RequestMethod.PUT)
    @PutMapping
    @ApiOperation(value = "通过id修改部门")
    public JSONResult updateById(@RequestBody T obj){
        System.out.println(obj);
        baseService.updateById(obj);
        return JSONResult.instance();
    }
    /**=================================================
     * 方法说明:通过id删除部门
     * 步骤说明：
     =================================================== **/
    @DeleteMapping("/{id}")
    @ApiOperation(value = "通过id删除")
    public JSONResult deleteById(@PathVariable(value = "id",required = true)Long id){
        baseService.delete(id);
        return JSONResult.instance();
    }
    /**=================================================
     * 方法说明:分页查询
     * 步骤说明：
     =================================================== **/
    @PostMapping("/page")
    public JSONResult selectPage(@RequestBody Q query){
        PageList<T> pageList = baseService.selectPage(query);
        System.out.println("List="+pageList);
        return JSONResult.instance(pageList);
    }
    /**=================================================
     * 方法说明:批量删除
     * 步骤说明：
     * 接受方式1：用map接受
     *     public JSONResult deleIds(@RequestBody Map<String,List<Long>> map){
     *         List<Long> ids = (List)map.get("ids");
     *         return JSONResult.instance();
     *     }
     =================================================== **/
    @DeleteMapping("/multiple")
    public JSONResult deleteByIds(@RequestBody IdsDto idsDto){
        baseService.deleteByIds(idsDto.getIds());
        return JSONResult.instance();
    }
}
