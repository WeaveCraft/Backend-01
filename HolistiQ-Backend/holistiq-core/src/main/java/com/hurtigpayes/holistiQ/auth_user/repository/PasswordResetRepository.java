package com.hurtigpayes.holistiQ.auth_user.repository;

import com.hurtigpayes.holistiQ.auth_user.entity.PasswordReset;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PasswordResetRepository extends JpaRepository<PasswordReset, Long> {
    Optional<PasswordReset> findByCode(String code);
    void deleteByUserId(Long userId);
}
