package com.jak.product.api.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jak.product.core.entity.Product;
import com.jak.product.core.repository.ProductRepository;

@RestController
public class ApiController {

	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("/test")
	public String testApi() {
		return "is OK";
	}
	
	@PostMapping("/products")
	public Product createProduct() {
		Product product = productRepository.save(new Product(LocalDateTime.now().toString()));
		return product;
	}
	
	@GetMapping("/products")
	public List<Product> selectProduct() {
		List<Product> products = new ArrayList<>();
		productRepository.findAll().forEach(products::add);
		return products;
	}
	
}
