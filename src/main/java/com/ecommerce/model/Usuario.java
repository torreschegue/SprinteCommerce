package com.ecommerce.model;

public class Usuario {
	
	private Integer id;
	private String nombre;
	private String apellidos;
	private String Correo;
	private String Direccion;
	private String Telefono;
	private String Tipo;
	private String username;
	private String password;
	
	public Usuario() {
		
	}

	public Usuario(Integer id, String nombre, String apellidos, String correo, String direccion, String telefono,
			String tipo, String username, String password) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		Correo = correo;
		Direccion = direccion;
		Telefono = telefono;
		Tipo = tipo;
		this.username = username;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", Correo=" + Correo
				+ ", Direccion=" + Direccion + ", Telefono=" + Telefono + ", Tipo=" + Tipo + ", username=" + username
				+ ", password=" + password + "]";
	}
	
	
	
	
}
