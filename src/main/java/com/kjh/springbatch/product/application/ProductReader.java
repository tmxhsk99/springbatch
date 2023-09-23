package com.kjh.springbatch.product.application;

import com.kjh.springbatch.product.domain.Product;
import com.kjh.springbatch.product.infra.db.ProductMyBatisRepository;
import com.kjh.springbatch.product.infra.db.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductReader {

    private final ProductMyBatisRepository productMyBatisRepository;

    public List<Product> findAll() {
        List<Product> findMapList = productMyBatisRepository.findAll();

        return null;
    };

}
