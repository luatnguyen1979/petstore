package edu.mum.petsmart.service;

import java.util.List;

import edu.mum.petsmart.domain.Product;


public interface ProductService {

	public Product save(Product product);
	
	public List<Product> getAll();
	
}