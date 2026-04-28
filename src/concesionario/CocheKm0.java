package concesionario;

public class CocheKm0 extends Coche implements Alquilable{

	// Constructor
public CocheKm0 (String matricula, String color, String modelo, 
		double precio, int kilometrosRecorridos) {
	super(matricula, color, modelo, precio, kilometrosRecorridos);
}
	@Override
	public void alquilar() {
		System.out.println("El coche Kilómetro 0,  con matrícula " + getMatricula() 
		+  " y modelo " + getModelo() + ", se ha alquilado.");
	}
	
}	

