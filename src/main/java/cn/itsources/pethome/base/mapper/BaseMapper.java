package cn.itsources.pethome.base.mapper;

import cn.itsources.pethome.base.query.DepartmentQuery;
import cn.itsources.pethome.org.domain.Department;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*mapper映射器基础类*/
public interface BaseMapper<T,Q> {
    T selectById(Long id);

    List<T> selectAll();

    boolean insert(T obj);

    boolean updateById(T obj);

    boolean delete(Long id);

    long selectCount(Q query);

    List<T> selectList(Q query);

    void deleteByIds(@Param("ids") List<Long> ids);
}
