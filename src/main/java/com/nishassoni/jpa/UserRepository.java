package com.nishassoni.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nishassoni.user.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
