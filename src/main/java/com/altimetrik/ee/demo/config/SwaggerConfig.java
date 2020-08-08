package com.altimetrik.ee.demo.config;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.altimetrik.ee.demo.controller")).paths(regex("/.*"))
				.build().enable(true).apiInfo(metaData());
	}

	private ApiInfo metaData() {
		return new ApiInfo("Demo Application", "Demo API Services", "2.0", "https://www.altimetrik.com/privacy-policy/",
				new Contact("Playground", "https://playground.altimetrik.com", "pg-mgr1@altimetrik.com"),
				"Apache License Version 2.0", "https://www.apache.org/licenses/LICENSE-2.0", Collections.emptyList());
	}

}
