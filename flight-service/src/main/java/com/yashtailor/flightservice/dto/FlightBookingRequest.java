package com.yashtailor.flightservice.dto;

import com.yashtailor.flightservice.entity.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingRequest {
    private PassengerInfo passengerInfo;
    private PaymentInfo paymentInfo;
}
