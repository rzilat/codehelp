package com.codehelp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codehelp.domain.Question;



@Repository("questionRepository")
public interface QuestionRepository extends JpaRepository<Question,Long> {
	
	List<Question> findByTagsContaining(String tag);
	
	
	
	

}
