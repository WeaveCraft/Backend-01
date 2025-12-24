package com.hurtigpayes.holistiQ.user.repository;

import com.hurtigpayes.holistiQ.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}