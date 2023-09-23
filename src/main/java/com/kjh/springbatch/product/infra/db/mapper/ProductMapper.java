package com.kjh.springbatch.product.infra.db.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface ProductMapper {
    public List<HashMap<String,Object>> findAll();

    public HashMap<String,Object> findById (Long id);
}
