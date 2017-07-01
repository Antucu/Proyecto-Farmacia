package Datos;

public class Almacenamiento {
	private String nombre;
	private String correo;
	private String telefono;
	private String Dni;
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return Dni;
	}
	public void setDni(String dni) {
		Dni = dni;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	Almacenamiento(){
		
	}
	Almacenamiento(String n,String c,String t,String D){
		nombre=n;
		correo=c;
		telefono=t;
		Dni=D;
	}
}
