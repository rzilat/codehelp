package com.codehelp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.codehelp.domain.Reponse;

@Repository("reponseRepository")
public interface ReponseRepository extends JpaRepository<Reponse,Long> {

}
