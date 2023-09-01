package com.te.fiegnclientproject.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.te.fiegnclientproject.dto.BookDto;
import com.te.fiegnclientproject.dto.User;

@FeignClient(name = "library-book-rent", url = "https://jsonplaceholder.typicode.com/")
public interface PostManService {

//	@GetMapping("/users")
//	public BookDto getBook(@PathVariable String bookName);
//	
//	@GetMapping("/postal/bycity/{city}")
//	PostResponseBean getAllPostMan(@PathVariable String city);
	
	
	@GetMapping("/users")
	public List<User> getAllUsers();

	
}
