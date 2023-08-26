package com.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OrderServiceApplication {
	
	@Autowired
	KafkaTemplate<String, Object> kafka;
	String topic = "quickstart-events";

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}
	
	@PostMapping("/order")
	public String placeOrder(@RequestBody Order order){
	    kafka.send(topic, order);
		return "Order Placed";
	}
	

}
