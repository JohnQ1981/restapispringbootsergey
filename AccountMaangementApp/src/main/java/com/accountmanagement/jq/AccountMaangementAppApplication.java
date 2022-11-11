package com.accountmanagement.jq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AccountMaangementAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountMaangementAppApplication.class, args);
	}

}
