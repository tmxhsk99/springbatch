package com.kjh.springbatch.testdomain.infra.db.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface TbTestMapper {
    public List<HashMap<String,Object>> findAll();

    public HashMap<String,Object> findById (Long id);
}
