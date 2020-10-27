package com.scienjus.spring.cloud.etcd.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class App {

	@Autowired
	private DiscoveryClient client;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@GetMapping("hello")
	public String hello() {
		System.out.println(client.getServices());
		return "world";
	}
}