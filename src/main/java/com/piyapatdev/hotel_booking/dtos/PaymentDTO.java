package com.piyapatdev.hotel_booking.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.piyapatdev.hotel_booking.enums.PaymentGateway;
import com.piyapatdev.hotel_booking.enums.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentDTO {

    private Long id;
    private BookingDTO booking;

    private String transactionId;

    private BigDecimal amount;

    private PaymentGateway paymentMethod; //e,g PayPal. Stripe, flutter wave, paystack

    private LocalDateTime paymentDate;

    private PaymentStatus status; //failed, e.t.c

    private String bookingReference;
    private String failureReason;

    private String approvalLink; //payPal payment approval UEL
}
