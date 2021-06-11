package cn.itsources.pethome.base.service.impl;

import cn.itsources.pethome.base.constants.ErrorCode;
import cn.itsources.pethome.base.exception.GlobalException;
import cn.itsources.pethome.base.mapper.BaseMapper;
import cn.itsources.pethome.base.result.PageList;
import cn.itsources.pethome.base.service.IBaseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class IBaseServiceImpl<T,Q> implements IBaseService<T,Q> {

    @Autowired
    private BaseMapper<T,Q> baseMapper;

    @Override
    public T selectById(Long id) {
        if(null == id || id.longValue() == 0){
            throw new GlobalException(ErrorCode.SYSTEM_ERROR);
        }
        return baseMapper.selectById(id);
    }

    @Override
    public List<T> selectAll() {
        return baseMapper.selectAll();
    }

    @Override
    public boolean insert(T obj) {
        return baseMapper.insert(obj);
    }

    @Override
    public boolean updateById(T obj) {
        return baseMapper.updateById(obj);
    }


    @Override
    public boolean delete(Long id) {
        return baseMapper.delete(id);
    }

    @Override
    public PageList<T> selectPage(Q query) {
        //1.查询总条数
        long total = baseMapper.selectCount(query);
        System.out.println("total"+total);
        if(total == 0){
            return new PageList<>();
        }
        //2.查询列表
        List<T> list =  baseMapper.selectList(query);
        System.out.println("list"+list);

        return new PageList<T>(total , list);
    }

    @Override
    public void deleteByIds(List<Long> ids) {
        baseMapper.deleteByIds(ids);
    }

}
