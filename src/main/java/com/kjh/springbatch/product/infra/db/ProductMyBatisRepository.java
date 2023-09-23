package com.kjh.springbatch.product.infra.db;

import com.kjh.springbatch.common.util.ParseUtil;
import com.kjh.springbatch.product.domain.Product;
import com.kjh.springbatch.product.infra.db.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;


@Repository
@RequiredArgsConstructor
public class ProductMyBatisRepository {
    private final ProductMapper productMapper;
    private final ParseUtil parseUtil;

    public List<Product> findAll(){
        List<HashMap<String, Object>> findProductMap = productMapper.findAll();

        List<Product> products = parseUtil.mapListToTypeList(findProductMap, Product.class);

        return products;
    };

    public Optional<Product> findById(Long id){
        HashMap<String, Object> findProductMap = productMapper.findById(id);

        Product product = parseUtil.mapToType(findProductMap, Product.class);

        if(product == null) {
            return Optional.empty();
        }

        return Optional.ofNullable(product);
    };

}
