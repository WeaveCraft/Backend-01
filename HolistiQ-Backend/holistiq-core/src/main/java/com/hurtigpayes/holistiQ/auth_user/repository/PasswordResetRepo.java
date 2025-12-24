package com.hurtigpayes.holistiQ.auth_user.repository;

import com.hurtigpayes.holistiQ.auth_user.entity.PasswordResetDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PasswordResetRepo extends JpaRepository<PasswordResetDTO, Long> {
    Optional<PasswordResetDTO> findByCode(String code);
    void deleteByUserId(Long userId);
}
