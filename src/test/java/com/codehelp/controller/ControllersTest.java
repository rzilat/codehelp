package com.codehelp.controller;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class ControllersTest {
	
	@Autowired
    private UserController userController;
	@Autowired
	private ReponseController reponseController;
	@Autowired
	private QuestionController questionController;

    @Test
    public void contexLoads() throws Exception {
        
    	assertThat(userController).isNotNull();
    	assertThat(reponseController).isNotNull();
    	assertThat(questionController).isNotNull();
    }


}
