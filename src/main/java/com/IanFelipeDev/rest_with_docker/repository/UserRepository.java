package com.IanFelipeDev.rest_with_docker.repository;


import com.IanFelipeDev.rest_with_docker.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}