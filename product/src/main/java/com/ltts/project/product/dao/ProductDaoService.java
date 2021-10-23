package com.ltts.project.product.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.project.product.model.Product;

@Service
public class ProductDaoService {
	
	@Autowired
	ProductDao pd;
	
	
	public List<Product> listAll(){
		return pd.findAll();
	}
	
	
	public void save(Product product) {
		pd.save(product);
	}
	
	
	public Product get(Long id) {
		return pd.findById(id).get();
	}
	
	public void delete(Long id) {
		pd.deleteById(id);
	}
	
	
}
