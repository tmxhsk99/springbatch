package com.kjh.springbatch.testdomain.infra.db;

import com.kjh.springbatch.testdomain.domain.TbTest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TbTestMybatisRepository {
    public List<TbTest> findAll();
}
