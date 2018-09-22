package com.in28minutes.springboot.microservice.example.forex.springbootmicroserviceforexservice;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Extending JpaRepository using two generics - ExchangeValue & Long
 * ExchangeValue is the entity that is being managed
 * The primary key of ExchangeValue is Long
 */

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

    ExchangeValue findByFromAndTo(String from, String to);
}
