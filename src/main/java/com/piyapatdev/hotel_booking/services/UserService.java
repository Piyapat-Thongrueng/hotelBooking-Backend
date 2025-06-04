package com.piyapatdev.hotel_booking.services;

import com.piyapatdev.hotel_booking.dtos.LoginRequest;
import com.piyapatdev.hotel_booking.dtos.RegistrationRequest;
import com.piyapatdev.hotel_booking.dtos.Response;
import com.piyapatdev.hotel_booking.dtos.UserDTO;
import com.piyapatdev.hotel_booking.entities.User;

public interface UserService {
    Response registerUser(RegistrationRequest registrationRequest);
    Response loginUser(LoginRequest loginRequest);
    Response getAllUsers();
    Response getOwnAccountDetails();
    User getCurrentLoggedInUser();
    Response updateOwnAccount(UserDTO userDTO);
    Response deleteOwnAccount();
    Response getMyBookingHistory();
}
