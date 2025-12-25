package com.hurtigpayes.holistiQ.notification.repository;

import com.hurtigpayes.holistiQ.notification.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
