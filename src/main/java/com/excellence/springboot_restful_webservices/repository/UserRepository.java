package com.excellence.springboot_restful_webservices.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excellence.springboot_restful_webservices.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	Optional<User> findByEmail(String email);
}
