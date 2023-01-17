package com.yuhang.backend.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.yuhang.backend.controllers", "com.yuhang.backend.services", "com.yuhang.backend.dao"})
public class EmboldinoBackendAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmboldinoBackendAppApplication.class, args);
	}

}
