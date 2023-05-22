package com.ssafy.bonvoyageh.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Arrays;
import java.util.List;

@Configuration
//@MapperScan(basePackages = {"com.ssafy.**.repository"})
public class WebMvcConfiguration implements WebMvcConfigurer{
	
	private final List<String> patterns = Arrays.asList("/article/*", "/admin/**", "/user/list");
	
//	private ConfirmInterceptor confirmInterceptor;

//	public WebMvcConfiguration(ConfirmInterceptor confirmInterceptor) {
//		System.out.println("WebMvcConfiguration 생성자 호출!!!");
//		this.confirmInterceptor = confirmInterceptor;
//	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(confirmInterceptor).addPathPatterns(patterns);
	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins("*")
//		.allowedOrigins("http://localhost:8080)", "http://70.12.103.80")
//		.allowedMethods("GET", "POST", ....)
		.allowedMethods(HttpMethod.GET.name(), HttpMethod.POST.name(), HttpMethod.PUT.name(), HttpMethod.DELETE.name(),
		HttpMethod.OPTIONS.name(),HttpMethod.PATCH.name(),HttpMethod.HEAD.name()).maxAge(1800);
			
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
//		registry.addRedirectViewController("/", "/list");
	}
	
}
