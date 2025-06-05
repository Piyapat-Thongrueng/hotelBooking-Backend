package com.piyapatdev.hotel_booking.services;

import com.piyapatdev.hotel_booking.entities.BookingReference;
import com.piyapatdev.hotel_booking.repositories.BookingReferenceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class BookingCodeGenerator {

    private final BookingReferenceRepository bookingReferenceRepository;

    public String generateBookingReference(){
        String bookingReference;

        // keep generating until a unique code is found (If it is true, keep doing this loop)
        do{
            //generate code of length 10
            bookingReference = generateRandomAlphaNumericCode(10);
        //check if the code already exist. if it doesn't, exit
        }while (isBookingReferenceExist(bookingReference));
        //If loop return false (stop loop) save the code to database
        saveBookingReferenceToDatabase(bookingReference);

        return bookingReference;
    }

    private String generateRandomAlphaNumericCode(int length){

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
        Random random = new Random();

        StringBuilder stringBuilder = new StringBuilder(length);

        for (int i = 0; i < length; i++){
            int index = random.nextInt(characters.length());
            stringBuilder.append(characters.charAt(index));
        }
        return stringBuilder.toString();
    }

    private boolean isBookingReferenceExist(String bookingReference){
        return bookingReferenceRepository.findByReferenceNo(bookingReference).isPresent();
    }

    private void saveBookingReferenceToDatabase(String bookingReference){
        BookingReference newBookingReference = BookingReference.builder().referenceNo(bookingReference).build();
        bookingReferenceRepository.save(newBookingReference);
    }

}
