package com.yashtailor.flightservice.controller;

import com.yashtailor.flightservice.dto.*;
import com.yashtailor.flightservice.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.transaction.annotation.*;
import org.springframework.web.bind.annotation.*;

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
