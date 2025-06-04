package com.piyapatdev.hotel_booking.services;

import com.piyapatdev.hotel_booking.dtos.NotificationDTO;

public interface NotificationService {

    void sendEmail(NotificationDTO notificationDTO);

    void sendSms();


}
