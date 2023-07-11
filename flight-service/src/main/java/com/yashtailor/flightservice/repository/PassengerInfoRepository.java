package com.yashtailor.flightservice.repository;

import com.yashtailor.flightservice.entity.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengerInfoRepository extends JpaRepository<PassengerInfo, Long> {

}
