package com.optabroker.apioptabroker;

import com.optabroker.apioptabroker.controller.UsersController;
import com.optabroker.apioptabroker.dto.UserDTO;
import com.optabroker.apioptabroker.entity.Users;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiOptabrokerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiOptabrokerApplication.class, args);
		System.out.println("Teste");



	}

}
