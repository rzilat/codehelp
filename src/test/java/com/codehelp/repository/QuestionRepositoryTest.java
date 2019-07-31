package com.codehelp.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.codehelp.domain.Question;
import com.codehelp.domain.User;

@DataJpaTest
public class QuestionRepositoryTest {
	@Autowired
	private TestEntityManager entityManager;
	@Autowired
	private QuestionRepository questionRepository;
	@Autowired
	private UserRepository userRepository;

	@Test
	public void ifRepsitoryIsEmpty() {
		// given
		List<Question> questions = questionRepository.findAll();
		assertThat(questions).isEmpty();

	}

	@Test
	public void saveQuestion() {
		User user1 = userRepository.save(new User("zilat", "sakina", "email@hotmmail"));

		Question question1 = new Question();
		question1.setUser(user1);
		question1.setTitre("assertEquals fail tests despite same lists");
		question1.setDescription("springboot");
		question1.setTags("java");

		questionRepository.save(question1);
		assertThat(question1).hasFieldOrPropertyWithValue("titre", "assertEquals fail tests despite same lists");

	}

	/* @Disabled */
	@Test
	public void findAllQuestions() {
		User user1 = userRepository.save(new User("zilat", "sakina", "email@hotmmail"));

		Question question1 = new Question();
		question1.setUser(user1);
		question1.setTitre("assertEquals fail tests despite same lists");
		question1.setDescription("springboot");
		question1.setTags("java");
		entityManager.persist(question1);

		List<Question> questions = questionRepository.findAll();

		assertThat(questions).hasSize(1).contains(question1);

	}

}
