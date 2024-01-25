package com.schoolManagementSystem.userService.repository;

import com.schoolManagementSystem.userService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
