## 🚗 Concesionario de Coches en Java

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

```text
src/
└── concesionario/
├── Coche.java
├── CocheKm0.java
├── CocheNuevo.java
├── CocheSegundaMano.java
├── Vendible.java
├── Alquilable.java
└── Main.java
```
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

## 🔌 Interfaces

```java
public interface Vendible {
    void vender();
}
```

```java
public interface Alquilable {
    void alquilar();
}
```

---

## 🧠 Funcionalidades
- Creación de distintos tipos de coches
- Venta y alquiler según el tipo
- Uso de herencia para evitar duplicación de código
- Implementación de interfaces para definir comportamientos
- Visualización de datos mediante toString()

---

## ▶️ Cómo ejecutar

1. Abrir el proyecto en Eclipse
2. Ejecutar la clase Main

###🖥️ Ejemplo de ejecución

El coche km0 con matrícula 4587DFR y modelo Peugeot se ha alquilado.
El coche nuevo con matrícula 75648KJU y modelo Citroen se ha vendido.
El coche de segunda mano con matrícula 64537ERT y modelo Opel se ha vendido.

Número de coches en stock: 3

## 👩‍💻 Autor

**Isabel (estudiante DAM)**
