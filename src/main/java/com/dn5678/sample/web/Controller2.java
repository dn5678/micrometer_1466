package com.dn5678.sample.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

@Slf4j
public class Controller2 implements InitializingBean  {

    private static final String BASE_URL = "/controller2";


    public Mono<ResponseEntity> get() {

        log.info("Controller2 get() called");

        return Mono.just(new ResponseEntity("Hello from Controller1", HttpStatus.OK));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // create a log event
        log.info("Controller2 initialized!");
    }
}
