package com.project.SnakeProject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.project.SnakeProject.mapper")
public class SnakeProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnakeProjectApplication.class, args);
	}

}
