package com.yashtailor.flightservice.controller;

import com.yashtailor.flightservice.dto.FlightBookingAcknowledgement;
import com.yashtailor.flightservice.dto.FlightBookingRequest;
import com.yashtailor.flightservice.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class BookingRequestController {
    @Autowired
    private FlightBookingService flightBookingService;

    @Transactional
    @PostMapping("/bookFlightTicket")
    public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request) {
        return flightBookingService.bookFlightTicket(request);
    }
}
