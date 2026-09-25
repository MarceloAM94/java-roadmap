# Teoría Sesión 10: Herencia en Java

## 1. Conceptos Core
La herencia representa una relación "ES UN" (Un Dragón *es una* Entidad). Sirve para reutilizar código y crear jerarquías lógicas.

| Palabra Clave | Uso |
| :--- | :--- |
| **`extends`** | Se usa en la clase Hija para indicar de qué clase Padre hereda. |
| **`super()`** | Llama al constructor del Padre. Debe ser siempre la **primera línea** en el constructor del hijo. |
| **`protected`** | Modificador de acceso que permite que los atributos sean visibles para las clases hijas, pero privados para el resto del mundo. |

## 2. Sintaxis Anotada
```java
class Vehiculo {
    protected String marca;
    
    Vehiculo(String marca) {
        this.marca = marca;
    }
}

class Auto extends Vehiculo {
    int puertas;
    
    Auto(String marca, int puertas) {
        super(marca); // Construye la base del vehículo
        this.puertas = puertas; // Añade lo específico del auto
    }
}