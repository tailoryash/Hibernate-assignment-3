package com.yashtailor.flightservice.dto;

import com.yashtailor.flightservice.entity.PassengerInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingAcknowledgement {
    private String status;
    private Double fare;
    private String pnrNo;
    private PassengerInfo passengerInfo;
}
