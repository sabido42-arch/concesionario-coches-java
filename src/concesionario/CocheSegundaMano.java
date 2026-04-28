package concesionario;

public class CocheSegundaMano extends Coche implements Vendible{
	String nombreAntiguoPropietario;	
	// Constructor
	public CocheSegundaMano(String matricula, String color, String modelo,
			double precio, int kilometrosRecorridos, String nombreAntiguoPropietario) {
		super(matricula, color, modelo, precio, kilometrosRecorridos);
		this.nombreAntiguoPropietario = nombreAntiguoPropietario;
	}
	
	// Getter
	public String  getNombreAntiguoPropietario() {
		return  nombreAntiguoPropietario;
	}
	
	// Setter 
	public void setNombreAntiguoPropietario(String  nombreAntiguoPropietario) {
		this. nombreAntiguoPropietario =   nombreAntiguoPropietario;
	}
	
	@Override 
	public void vender() {
		System.out.println("El coche de segunda mano, con matrícula " + getMatricula() + " y modelo "
							+ getModelo() + ", se ha vendido.");
	}
	
	public String toString() {
		return super.toString() + ", nombre del antiguo propietario: " + nombreAntiguoPropietario;
	}

}
