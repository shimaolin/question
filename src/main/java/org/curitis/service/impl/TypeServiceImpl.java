package org.curitis.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.curitis.mapper.TypeMapper;
import org.curitis.service.TypeService;
import org.curitis.to.Type;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    @Resource
    private TypeMapper typeMapper;

    @Override
    public PageInfo<Type> getTypePage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Type> list = typeMapper.getTypeList();
        return new PageInfo<>(list);
    }
}
