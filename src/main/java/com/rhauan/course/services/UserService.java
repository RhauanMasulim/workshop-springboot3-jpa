package com.rhauan.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rhauan.course.entities.User;
import com.rhauan.course.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
}
