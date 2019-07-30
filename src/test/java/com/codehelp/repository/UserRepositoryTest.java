package com.codehelp.repository;

import static org.assertj.core.api.Assertions.assertThat;


import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import org.springframework.test.context.junit4.SpringRunner;

import com.codehelp.domain.User;






@RunWith(SpringRunner.class)

@DataJpaTest
public class UserRepositoryTest {
	@Autowired
    private TestEntityManager entityManager;
 
    @Autowired
    private UserRepository userRepository;
    
    @Test
    public void ifRepsitoryIsEmpty() {
        // given
    	List<User> users = userRepository.findAll();
        
        assertThat(users).isEmpty();
    }

}
