package com.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.ecommerce.model.Producto;

public interface ProductoService {
	
	// Metodo para guardar Productos
	public Producto save(Producto  producto);

	// Metodo para mostrar productos
	public Optional<Producto> get(Integer Id);
	
	// Metodo para Actualizar productos
	public void update(Producto producto);
	
	// Metodo para Eliminar Producto
	public void delete(Integer Id);
	
	// Muestra todo el contenido de la tabla
	public List<Producto> findAll();
	
	
	

}
