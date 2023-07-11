package com.yashtailor.flightservice.service;

import com.yashtailor.flightservice.dto.FlightBookingAcknowledgement;
import com.yashtailor.flightservice.dto.FlightBookingRequest;
import com.yashtailor.flightservice.entity.PassengerInfo;
import com.yashtailor.flightservice.entity.PaymentInfo;
import com.yashtailor.flightservice.repository.PassengerInfoRepository;
import com.yashtailor.flightservice.repository.PaymentInfoRepository;
import com.yashtailor.flightservice.utils.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class FlightBookingService {
    @Autowired
    private PassengerInfoRepository passengerInfoRepository;
    @Autowired
    private PaymentInfoRepository paymentInfoRepository;

    public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request){

        PassengerInfo passengerInfo = request.getPassengerInfo();
        passengerInfo = passengerInfoRepository.save(passengerInfo);

        PaymentInfo paymentInfo = request.getPaymentInfo();
        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());
        paymentInfo.setPassengerId(passengerInfo.getPassengerId());
        paymentInfo.setAmount(passengerInfo.getFare());
        paymentInfoRepository.save(paymentInfo);
        return new FlightBookingAcknowledgement("SUCCESS", passengerInfo.getFare(), UUID.randomUUID().toString().split("-")[0], passengerInfo);

    }
}
