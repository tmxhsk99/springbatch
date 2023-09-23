package com.kjh.springbatch.testdomain.infra.db;

import com.kjh.springbatch.common.util.ParseUtil;
import com.kjh.springbatch.testdomain.domain.TbTest;
import com.kjh.springbatch.testdomain.infra.db.mapper.TbTestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;


@Repository
@RequiredArgsConstructor
public class TbTestMybatisRepository {
    private final TbTestMapper tbTestMapper;
    private final ParseUtil parseUtil;

    public List<TbTest> findAll(){

        List<HashMap<String, Object>> findMapList = tbTestMapper.findAll();

        List<TbTest>  tbTests = parseUtil.mapListToTypeList(findMapList, TbTest.class);

        return tbTests;
    };

    public Optional<TbTest> findById(Long id){

        HashMap<String, Object> findTBTest = tbTestMapper.findById(id);

        TbTest tbTest = parseUtil.mapToType(findTBTest, TbTest.class);

        if(tbTest == null) {
            return Optional.empty();
        }

        return Optional.ofNullable(tbTest);
    };
}
