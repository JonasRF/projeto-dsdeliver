package com.devSuperior.dsDeliver.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devSuperior.dsDeliver.DTO.ProductDTO;
import com.devSuperior.dsDeliver.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class productController {

	@Autowired
	ProductService serice;
	
	@GetMapping
	public ResponseEntity<List<ProductDTO>> findAll() {
		List<ProductDTO> list = serice.findAll();
		return ResponseEntity.ok().body(list);
	}
}
