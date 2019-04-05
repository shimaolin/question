package org.curitis.mapper;

import org.curitis.to.Type;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TypeMapperTest {

    @Resource
    private TypeMapper typeMapper;

    @Test
    public void getTypeById(){
        Type type = typeMapper.selectByPrimaryKey(1);
        System.out.println(type);
    }

}