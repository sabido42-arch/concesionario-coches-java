#  🚗 Concesionario de Coches en Java

Proyecto desarrollado en Java que simula la gestión de un concesionario de coches,
utilizando conceptos fundamentales de la programación orientada a objetos.

---

##  📚  Conceptos aplicados

- Herencia (`extends`)
- Interfaces (`implements`)
- Encapsulación (getters y setters)
- Polimorfismo
- Sobreescritura de métodos (`@Override`)
- Método `toString()`
- Organización en paquetes (`package concesionario`)

---

##  🏗️ Estructura del proyecto
src/
└── concesionario/
├── Coche.java
├── CocheKm0.java
├── CocheNuevo.java
├── CocheSegundaMano.java
├── Vendible.java
├── Alquilable.java
└── Main.java

---

##  🚘  Tipos de coches

###  🔹 Coche (Clase base)
Contiene los atributos comunes:
- Matrícula
- Color
- Modelo
- Precio
- Kilómetros recorridos

---

###  🔹 CocheKm0
- Hereda de `Coche`
- Implementa `Alquilable`
- Puede alquilarse

---

###  🔹 CocheNuevo
- Hereda de `Coche`
- Implementa `Vendible`
- Incluye garantía

---

###  🔹 CocheSegundaMano
- Hereda de `Coche`
- Implementa `Vendible`
- Incluye nombre del antiguo propietario

---

##  🔌 Interfaces
public interface Vendible {
    void vender();
}

public interface Alquilable {
    void alquilar();
}

---

🧠 Funcionalidades
Creación de distintos tipos de coches
Venta y alquiler según el tipo
Uso de herencia para evitar duplicación de código
Implementación de interfaces para definir comportamientos
Visualización de datos mediante toString()

---

👩‍💻 Autor

Isabel (estudiante DAM)
