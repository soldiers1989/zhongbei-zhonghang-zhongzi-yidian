package com.waben.stock.applayer.promotion.warpper.swagger;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {

	@Bean
	public Docket createRestApi() {

		String token = "eyJhbGciOiJIUzUxMiJ9.eyJhdXRob3JpdGllcyI6IlJvbGVfQWRtaW4sIiwidXNlcklkIjoxLCJuaWNrbmFtZSI6IueuoeeQhuWRmCIsIm9yZ0lkIjoxLCJvcmdDb2RlIjoiMDEiLCJvcmdOYW1lIjoi5LyY6IKh572RIiwib3JnTGV2ZWwiOjEsInN1YiI6ImFkbWluIiwiZXhwIjo0MzIwMDAxNTI1OTYzNDI4fQ.QUUjl0w1LXvUb-3D9WeZpUPHX11RNePaRpQOUyQQ0Im4n6x-nBttrMZCBzlTjxu8vS16CAuNhfNeLu1rCIUbKw";
		ParameterBuilder tokenPar = new ParameterBuilder();
		List<Parameter> pars = new ArrayList<Parameter>();
		tokenPar.name("Authorization").description("token令牌").modelRef(new ModelRef("string")).parameterType("header")
				.defaultValue(token).required(false).build();
		pars.add(tokenPar.build());
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).globalOperationParameters(pars).select()
				.apis(RequestHandlerSelectors.basePackage("com.waben.stock.applayer.promotion.controller"))
				.paths(PathSelectors.any()).build();
	}

	private ApiInfo apiInfo() {
		Contact contact = new Contact("wangbei", "https://github.com/wbfinance/finance.git", "");
		return new ApiInfoBuilder().title("Document Api").description("").license("Apache License Version 2.0")
				.contact(contact).version("1.0").build();
	}

}