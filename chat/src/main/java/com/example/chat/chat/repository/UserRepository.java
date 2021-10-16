package com.example.chat.chat.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.chat.chat.entity.Users;

public interface UserRepository extends CrudRepository<Users,Integer>{

}
