package com.cleanwk.gauss.adapter.boot.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author cleanwk
 * @date 2022/3/10
 */
@RestController
public class CommonRest {

    private static Logger logger = LoggerFactory.getLogger(CommonRest.class);

    /**
     * 用于应用健康检查
     * @return
     */
    @RequestMapping("/status/healthy")
    public String healthyCheck(){
        return "Application up! run healthy check on ===> "+ LocalDateTime.now().toString();
    }




}
