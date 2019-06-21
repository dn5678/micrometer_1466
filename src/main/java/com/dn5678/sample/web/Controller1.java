package com.dn5678.sample.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

@Slf4j
public class Controller1 implements InitializingBean  {

    private static final String BASE_URL = "/controller1";


    public Mono<ResponseEntity> get() {

        log.info("Controller1 get() called");

        return Mono.just(new ResponseEntity("Hello from Controller1", HttpStatus.OK));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // create a log event
        log.info("Controller1 initialized!");
    }
}
