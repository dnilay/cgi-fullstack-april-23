package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.dto.Coupon;
import com.example.demo.model.Product;
import com.example.demo.repos.ProductRepo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping("/productapi")

public class ProductRestController {
	


	private ProductRepo repo;

	
	private RestTemplate restTemplate;

	
	public ProductRestController(ProductRepo repo, RestTemplate restTemplate) {
		super();
		this.repo = repo;
		this.restTemplate = restTemplate;
	}

	@Value("${couponService.url}")
	private String couponServiceURL;

	@PostMapping("/products")
	public Product create(@RequestBody Product product) {
		Coupon coupon = restTemplate.getForObject(couponServiceURL + product.getCouponCode(), Coupon.class);
		product.setPrice(product.getPrice().subtract(coupon.getDiscount()));
		return repo.save(product);

	}

	

}
