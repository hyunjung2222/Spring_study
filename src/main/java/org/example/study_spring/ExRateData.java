package org.example.study_spring;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
// json 파일에서 rates가 이름과 값으로 구성되어있으니 Map 타입으로 만듦
public record ExRateData(String result, Map<String, BigDecimal> rates) {
}
