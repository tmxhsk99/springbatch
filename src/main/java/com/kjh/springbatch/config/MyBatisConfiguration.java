package com.kjh.springbatch.config;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@RequiredArgsConstructor
// MyBatis Mapper 인터페이스를 인식할 수 있도록 설정
@MapperScan(basePackages = {"com.kjh.springbatch.**.infra.db.*"}, annotationClass = Mapper.class)
public class MyBatisConfiguration {

    private final DataSource dataSource;
    private final ApplicationContext applicationContext;

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);

        // 매퍼 객체 사용시 패키지 경로 생략을 위한 설정 (도메인 패키지 구조이므로 사용하지 않는다.)
        // sqlSessionFactoryBean.setTypeAliasesPackage("com.kjh.springbatch.domain");

        // mapper 위치 설정
        sqlSessionFactoryBean.setMapperLocations(
                applicationContext.getResources("classpath:/mapper/*.xml"));
        // MyBatis 설정
        org.apache.ibatis.session.Configuration config = new org.apache.ibatis.session.Configuration();
        // DB의 스네이크 케이스를 오브젝트의 카멜케이스로 자동 매핑
        config.setMapUnderscoreToCamelCase(true);
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
