package com.piyapatdev.hotel_booking.dtos;

import com.piyapatdev.hotel_booking.enums.UserRole;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationRequest {

    @NotBlank(message = "Firstname is required")
    private String firstName;

    @NotBlank(message = "Lastname is required")
    private String lastName;

    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "Phone number is required")
    private String phoneNumber;

    private UserRole role; //optional

    @NotBlank(message = "Password is required")
    private String password;
}
