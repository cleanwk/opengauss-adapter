package com.cleanwk.gauss.adapter.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author cleanwk
 * @date 2022/3/10
 */
@SpringBootApplication
public class GaussAdapterApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(GaussAdapterApplication.class);
        application.run(args);
    }
}
