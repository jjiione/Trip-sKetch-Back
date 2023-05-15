package com.ssafy.bonvoyageh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.ssafy.bonvoyageh.repository")
public class BonvoyageHApplication {

	public static void main(String[] args) {
		SpringApplication.run(BonvoyageHApplication.class, args);
	}

}
