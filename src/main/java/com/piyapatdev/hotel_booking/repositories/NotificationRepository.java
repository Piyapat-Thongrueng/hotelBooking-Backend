package com.piyapatdev.hotel_booking.repositories;

import com.piyapatdev.hotel_booking.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
