package com.hurtigpayes.holistiQ.auth_user.repository;

import com.hurtigpayes.holistiQ.auth_user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
