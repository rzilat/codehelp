/*package com.codehelp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Predicate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.fasterxml.classmate.TypeResolver;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig  {
	@Autowired
	private TypeResolver typeResolver;
	
	@Autowired
	Environment env;
	
	*//**
	 * @return
	 * Here is an example where we select any api that matches one of these paths
	 *//*
	
	
	@Bean
	public Docket petApi()
	{
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(new ApiInfo("MyExperienceService REST API", "MyExperienceService REST API", env.getProperty("info.build.version"), "", "javabackendteam@redischool.com", "", "")).select().paths(paths()).build().directModelSubstitute(LocalDate.class, String.class).genericModelSubstitutes(ResponseEntity.class).alternateTypeRules(newRule(typeResolver.resolve(DeferredResult.class, typeResolver.resolve(ResponseEntity.class, WildcardType.class)), typeResolver.resolve(WildcardType.class))).useDefaultResponseMessages(false).globalResponseMessage(RequestMethod.GET, newArrayList(new ResponseMessageBuilder().code(500).message("500 message").responseModel(new ModelRef("Error")).build())).enableUrlTemplating(false).directModelSubstitute(Date.class, String.class);
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry)
	{
		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
		
		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	}
	
	

}
*/