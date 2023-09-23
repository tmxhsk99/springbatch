package com.kjh.springbatch.testdomain.application;

import com.kjh.springbatch.common.util.ParseUtil;
import com.kjh.springbatch.testdomain.infra.db.TbTestMybatisRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@RequiredArgsConstructor
public class TbTestReader {

    private final TbTestMybatisRepository tbTestMybatisRepository;

    public void findAll() {



    };

}
