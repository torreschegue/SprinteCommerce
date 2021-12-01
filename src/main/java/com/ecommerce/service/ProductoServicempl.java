package com.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecommerce.model.Producto;
import com.ecommerce.repository.ProductoRepository;

@Service
public class ProductoServicempl implements ProductoService{
	
	@Autowired
	private ProductoRepository productorRepository;

	@Override
	public Producto save(Producto producto) {
		return  productorRepository.save(producto);
	}

	@Override
	public Optional<Producto> get(Integer Id) {
		return productorRepository.findById(Id);
	}

	@Override
	public void update(Producto producto) {
		 productorRepository.save(producto);
	}

	@Override
	public void delete(Integer Id) {
		 productorRepository.deleteById(Id);
	}

	@Override
	public List<Producto> findAll() {
		
		return productorRepository.findAll();
	}

}
