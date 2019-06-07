package com.codehelp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.codehelp.domain.Reponse;

@Repository("reponseRepository")
public interface ReponseRepository extends JpaRepository<Reponse,Long> {
	
	@Query("select r from Reponse r where r.question.questionId=?1")
	List<Reponse> findReponsesByQuestionId(long questionId);
	
	

}

