package concesionario;

public abstract class Coche {

	// Atributos
	private String matricula;
	private String color;
	private String modelo;
	private double precio;
	private int kilometrosRecorridos;
	
	private static int numCochesStock = 0;
	
	
	// Constructor
	public Coche (String matricula, String color, String modelo, 
					double precio, int kilometrosRecorridos) {
		this.matricula = matricula;
		this.color = color;
		this.modelo = modelo;
		this.precio = precio;
		this.kilometrosRecorridos = kilometrosRecorridos;
		
		numCochesStock ++;
	}
	
	//Getter del contador
	public static int getNumCochesStock() {
		return numCochesStock;
	}
	
	// Getters 
	public String getMatricula() {
		return matricula;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public double getPrecio() {
		return precio;
	}
	public int getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}
	
	// Setters
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void setKilometrosRecorridos(int kilometrosRecorridos) {
		this.kilometrosRecorridos = kilometrosRecorridos;
	}
	
	public String toString() {
		return ("Matrícula: " + matricula + ", color: " + color + 
				 ", modelo: " + modelo + ", precio: " + precio +
				 ", Kilómetros recorridos: " + kilometrosRecorridos);
			
		}
}
