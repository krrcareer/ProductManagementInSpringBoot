package com.krr.ProductManagementUsingSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class ProductManagementBackendApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ProductManagementBackendApplication.class, args);

		ProductServices services = context.getBean(ProductServices.class);

		List<Product> apl = services.getAllProducts();

		System.out.println(apl);
	}

}
