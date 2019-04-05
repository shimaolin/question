package org.curitis.service;

import com.github.pagehelper.PageInfo;
import org.curitis.to.Type;

public interface TypeService {

    PageInfo<Type> getTypePage(Integer pageNum,Integer pageSize);

}
