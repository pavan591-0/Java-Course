package com.udemy.telusko.springecom.controller;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.udemy.telusko.springecom.model.Product;
import com.udemy.telusko.springecom.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/products")
	public List<Product> getProducts() {
		return productService.getAllProducts();
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable int id) {
		Product product = productService.getProductById(id);
		if(product.getId() > 0) {
			return new ResponseEntity<>(product, HttpStatus.FOUND);
		}
		return new ResponseEntity<>(new Product(-1), HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/product/")
	public ResponseEntity<?> addProduct(@RequestPart Product product, @RequestPart MultipartFile imageFile){
		System.out.println("hi");
		try {
			Product p= productService.addProduct(product, imageFile);
			return new ResponseEntity<>(p, HttpStatus.ACCEPTED);
		} catch (IOException e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
		}
		
		
	}
	
}
