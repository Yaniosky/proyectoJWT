package dbo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "idCliente")
private Long idCliente;

@Column(name = "user", nullable = false, unique=true)
private String user;

@Column(name = "passw", nullable = false)
private String passw;

private String token;

@Column(name = "nombre", nullable = false, unique=true)
private String nombre;

@Column(name = "apellido")
private String apellido;

@Column(name = "dni", nullable = false, unique=true)
private String dni;

@Column(name = "telef")
private String telef;

@Column(name = "email")
private String email;

public User() {}

public User(String _user, String _passw, Long _idCliente, String _nombre, String _apellido, String _dni, String _telef, String _email) {
	this.user=_user;
	this.passw=_passw;
	this.idCliente=_idCliente;
	this.nombre=_nombre;
	this.apellido=_apellido;
	this.dni=_dni;
	this.telef=_telef;
	this.email=_email;
}

public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public String getToken() {
	return token;
}
public void setToken(String token) {
	this.token = token;
}
public String getPassw() {
	return passw;
}
public void setPassw(String passw) {
	this.passw = passw;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Long getIdCliente() {
	return idCliente;
}
public void setIdCliente(Long idCliente) {
	this.idCliente = idCliente;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public String getTelef() {
	return telef;
}
public void setTelef(String telef) {
	this.telef = telef;
}
}
