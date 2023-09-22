package com.kjh.springbatch.product.infra.db;

import com.kjh.springbatch.product.domain.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMyBatisRepository {
    public List<Product> findAll();
}
