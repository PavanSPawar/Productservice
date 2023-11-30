package com.example.Productservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class ProductController {

	@RestController
	@RequestMapping (path="/Customer")
	public class CustomerControllerr {

		@GetMapping(path="/getCustomer")
		public String getCustomer() {
			return "hiii";
		}
	}

}
