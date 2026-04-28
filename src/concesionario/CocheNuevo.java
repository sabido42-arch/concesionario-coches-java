package concesionario;

public class CocheNuevo extends Coche implements Vendible{
	String duracionGarantia;
	
	// Constructor
	public CocheNuevo(String matricula, String color, String  modelo, double precio,
						int kilometrosRecorridos, String duracionGarantia) {
		super(matricula, color, modelo, precio, kilometrosRecorridos);
		this.duracionGarantia = duracionGarantia;
	}
	
	// Getter 
	public String getDuracionGarantia() {
		return duracionGarantia;
	}
	
	// Setter
	public void setDuracionGarantia(String duracionGarantia) {
		this.duracionGarantia = duracionGarantia;
	}
	
	@Override
	public void vender() {
		System.out.println("El coche nuevo, con matrícula " + getMatricula() + " y modelo " 
							+ getModelo() + ", se ha vendido.");
	}
	
	public String toString() {
		return super.toString() + ", duración de la garantía: " +  duracionGarantia;
		
	}
}


