package com.codehelp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codehelp.domain.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User,Long> {
	

}
