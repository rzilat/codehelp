package com.codehelp.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.codehelp.domain.Question;
import com.codehelp.domain.Reponse;
import com.codehelp.domain.User;

@DataJpaTest
public class ReponseRepositoryTest {
	@Autowired
	private TestEntityManager entityManager;
	@Autowired
	private ReponseRepository reponseRepository;
	@Autowired
	private QuestionRepository questionRepository;
	@Autowired
	private UserRepository userRepository;

	@Test
	public void ifRepsitoryIsEmpty() {
		// given
		List<Reponse> reponses = reponseRepository.findAll();
		assertThat(reponses).isEmpty();
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
		Reponse reponse1 = new Reponse();
		reponse1.setUser(user1);
		reponse1.setQuestion(question1);
		reponse1.setReponse(
				"Spring Profiles allow you to create instances of projects that only use certain configurations");
		reponse1.setRating(5);
		reponseRepository.save(reponse1);
		assertThat(reponse1).hasFieldOrPropertyWithValue("reponse",
				"Spring Profiles allow you to create instances of projects that only use certain configurations");

	}

	@Test
	public void findAllQuestions() {
		User user1 = userRepository.save(new User("zilat", "sakina", "email@hotmmail"));

		Question question1 = new Question();
		question1.setUser(user1);
		question1.setTitre("assertEquals fail tests despite same lists");
		question1.setDescription("springboot");
		question1.setTags("java");
		questionRepository.save(question1);
		Reponse reponse1 = new Reponse();
		reponse1.setUser(user1);
		reponse1.setQuestion(question1);
		reponse1.setReponse(
				"Spring Profiles allow you to create instances of projects that only use certain configurations");
		reponse1.setRating(5);
		entityManager.persist(reponse1);

		List<Reponse> reponses = reponseRepository.findAll();

		assertThat(reponses).hasSize(1).contains(reponse1);

	}

}
