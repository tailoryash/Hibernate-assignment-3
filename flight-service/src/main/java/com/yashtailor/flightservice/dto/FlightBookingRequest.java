package com.yashtailor.flightservice.dto;

import com.yashtailor.flightservice.entity.PassengerInfo;
import com.yashtailor.flightservice.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingRequest {
    private PassengerInfo passengerInfo;
    private PaymentInfo paymentInfo;

}
