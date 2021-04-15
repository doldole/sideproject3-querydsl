package com.doldole.sideproject3querydsl;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.persistence.EntityManager;

@SpringBootApplication
public class Sideproject3QuerydslApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sideproject3QuerydslApplication.class, args);
	}
}
