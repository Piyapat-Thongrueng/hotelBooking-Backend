package com.piyapatdev.hotel_booking.repositories;

import com.piyapatdev.hotel_booking.entities.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {
}
