package com.yashtailor.flightservice.utils;

import com.yashtailor.flightservice.exception.InsufficientAmountException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {
    private static Map<String, Double> paymentMap = new HashMap<>();
    static {
        paymentMap.put("acc1", 10000.0);
        paymentMap.put("acc2", 5000.0);
        paymentMap.put("acc3", 8000.0);
    }
    public static boolean validateCreditLimit(String accNo, double paidAmount){
        if(paidAmount > paymentMap.get(accNo)){
            throw new InsufficientAmountException();
        }else{
            return true;
        }
    }
}
