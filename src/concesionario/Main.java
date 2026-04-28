package concesionario;

public class Main {

	public static void main(String[] args) {

CocheKm0 km01 = new CocheKm0("4587DFR", "rojo", "Peugeot", 19550.0, 17352);

km01.alquilar();

CocheNuevo nuevo1 = new CocheNuevo("75648KJU", "verde", "Citroen", 21300.0, 23000, "3 años");

nuevo1.vender();

CocheSegundaMano segundaMano1 = new CocheSegundaMano("64537ERT", "blanco", "Opel", 18990.0, 20500, "Abel Gómez");

segundaMano1.vender();
		
	System.out.println(km01);
	System.out.println(nuevo1);
	System.out.println(segundaMano1);
	System.out.println("Número de coches en stock: " + Coche.getNumCochesStock());
	}
}

