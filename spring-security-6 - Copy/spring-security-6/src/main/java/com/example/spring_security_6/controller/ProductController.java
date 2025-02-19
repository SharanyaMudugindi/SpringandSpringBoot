package com.example.spring_security_6.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
@RestController

public class ProductController {
	private record Product(Integer productId,String productName,double price)
	{
		
	}
	List<Product> products=new ArrayList<>(
			List.of(new Product(1,"Lipgloss",545.20),
			new Product (2,"lipstick",3404.30))
			);
	
	@GetMapping("/product")
	public List<Product> getProducts()
	{
		return products;
	}
	@PostMapping("/product")
	public Boolean addProduct(@RequestBody Product product)
	{
		products.add(product);
		return true;
	}
	@GetMapping("/csrf")
	public CsrfToken getToken(HttpServletRequest request)
	{
		return (CsrfToken)request.getAttribute("_csrf");
	}

}
