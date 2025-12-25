package com.hurtigpayes.holistiQ.notification.entity;

import com.hurtigpayes.holistiQ.auth_user.entity.User;
import com.hurtigpayes.holistiQ.enums.NotificationType;
import jakarta.persistence.*;

import java.time.LocalDateTime;

public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String subject;
    private String recipient;

    private String body;

    @Enumerated(EnumType.STRING)
    private NotificationType type; //EMAIL, SMS, PUSH

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private final LocalDateTime createdAt = LocalDateTime.now();
}
