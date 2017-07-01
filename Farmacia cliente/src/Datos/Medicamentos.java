package Datos;

public class Medicamentos {
	private String NomMedicamentos;

	public String getNomMedicamentos() {
		return NomMedicamentos;
	}

	public void setNomMedicamentos(String nomMedicamentos) {
		NomMedicamentos = nomMedicamentos;
	}
	public Medicamentos(){
		
	}
	public Medicamentos(String nomMedi){
		NomMedicamentos=nomMedi;
	}
	public String toString(){
		return NomMedicamentos;
	}
}
