package com.hurtigpayes.holistiQ.role.repository;

import com.hurtigpayes.holistiQ.role.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
