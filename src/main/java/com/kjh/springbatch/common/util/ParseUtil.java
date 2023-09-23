package com.kjh.springbatch.common.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
@RequiredArgsConstructor
public class ParseUtil {
    private final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * MyBatis 사용시 통일하여 사용하는 Map 리스트를 실제 결과 타입리스트를 매핑한다.
     * @param list
     * @param type
     * @return
     * @param <T>
     */
    public <T> List<T> mapListToTypeList(List<HashMap<String,Object>> list, Class<T> type) {
        List<T> resultList = new ArrayList<>();

        if(list.size() == 0){
            return resultList;
        }

        for (HashMap<String,Object> map : list) {
            try{
                T t = objectMapper.convertValue(map, type);
                resultList.add(t);
            }catch (IllegalArgumentException e){
                // 파싱시에 에러발생
                // todo Custom 예외 처리 추가할 것
                e.printStackTrace();
            }
        }

        return resultList;
    }

    /**
     * MyBatis 사용시 통일하여 사용하는 Map 을 실제 결과 타입을 매핑한다.
     * 객체를 찾지 못한 경우 null을 리턴한다.
     * @param map
     * @param type
     * @return
     * @param <T>
     */
    public <T> T mapToType(HashMap<String,Object> map, Class<T> type){
        T parsedType = null;

        if(map == null){
            return parsedType;
        }

        try{
            parsedType = objectMapper.convertValue(map, type);
            if(parsedType != null){
               return parsedType;
            }
        }catch (IllegalArgumentException e){
            // todo Custom 예외 처리 추가할 것
            e.printStackTrace();
        }

        return parsedType;
    }
}
