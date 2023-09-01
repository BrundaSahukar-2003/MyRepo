package com.te.fiegnclientproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.fiegnclientproject.dto.BookDto;
import com.te.fiegnclientproject.dto.User;

import com.te.fiegnclientproject.service.PostManService;

@SpringBootApplication
@EnableFeignClients("com.te.fiegnclientproject")
@RestController
public class FiegnClientProjectApplication {
	@Autowired
	private PostManService manService;
	
	
	
	@GetMapping("/xyz")
	public List<User> getAllUsers(){
		return manService.getAllUsers();
	}


	public static void main(String[] args) {
		SpringApplication.run(FiegnClientProjectApplication.class, args);
	}

}
