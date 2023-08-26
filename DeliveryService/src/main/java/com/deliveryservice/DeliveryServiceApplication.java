package com.deliveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.orderservice.Order;

@SpringBootApplication
public class DeliveryServiceApplication {

	private final String topic = "quickstart-events";
	
	public static void main(String[] args) {
		SpringApplication.run(DeliveryServiceApplication.class, args);
	}
	
	@KafkaListener(topics = topic , groupId = "gp1")
    public void listener(Order order) {
		System.out.println("MSG: "+order.toString());
	}
}
