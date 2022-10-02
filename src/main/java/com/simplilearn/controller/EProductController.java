package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.simplilearn.model.EProduct;
import com.simplilearn.service.EProductService;

@Controller
public class EProductController {

	@Autowired
	EProductService productService;

	// STEP 1: Handle request
	@GetMapping("/listProducts")
	public String getProducts(Model model) {
		// Step 2. Invoke service to execute business logic
		List<EProduct> products = productService.getProducts();

		// Step 3: populate Model
		model.addAttribute("productList", products);

		// STEP 4: Invoke view
		return "listproduct";
	}

}
