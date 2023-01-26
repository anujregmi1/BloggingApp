package com.anujregmi.blog.blogappapis.repositories;

import com.anujregmi.blog.blogappapis.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {

}
