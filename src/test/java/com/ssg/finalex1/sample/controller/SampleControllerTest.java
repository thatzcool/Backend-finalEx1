package com.ssg.finalex1.sample.controller;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import java.util.Arrays;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Log4j2
class SampleControllerTest {

    @Autowired(required = false)
    private TestRestTemplate testRestTemplate;
    @Test
    public void hello() {
        String[] result = testRestTemplate.getForObject("/api/v1/sample/hello",String[].class);
        log.info(Arrays.toString(result));
    }
}