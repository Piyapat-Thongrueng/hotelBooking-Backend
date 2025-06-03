package com.piyapatdev.hotel_booking.repositories;

import com.piyapatdev.hotel_booking.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);


}
