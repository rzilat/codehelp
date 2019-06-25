package com.codehelp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codehelp.domain.User;
import com.codehelp.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public void addUser(User user) {
		
		userRepository.save(user);
		
	}
	
	public User findUser(long id) {
		
	return this.userRepository.getOne(id) ;
		
	}
	
	public List<User> findAll(){
		return this.userRepository.findAll();
		
	}
	
	public void deleteUser(long id) {
		 userRepository.deleteById(id);
		
	}
	
	public User updateUser(User user) {
		return this.userRepository.save(user);
		
	}

	public void incrementParticipation(long userId) {
		User user = userRepository.getOne(userId);
		long oldParticipation=user.getParticipation();
		long newPaticipation=oldParticipation+1;
		user.setParticipation(newPaticipation);
		userRepository.save(user);
		
	}

}
