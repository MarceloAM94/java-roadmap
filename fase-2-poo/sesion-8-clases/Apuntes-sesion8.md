# Teoría Sesión 8: Clases y Objetos en Java

## 1. Conceptos Core
| Concepto | Definición | Analogía |
| :--- | :--- | :--- |
| **Clase** | Plantilla o molde que define atributos y comportamientos de una entidad. | El plano arquitectónico de una casa. |
| **Objeto (Instancia)** | Una entidad real creada en memoria a partir de la clase. | La casa ya construida donde puedes vivir. |
| **Atributo** | Variables que pertenecen a la clase y definen el estado del objeto. | El color de la casa, la cantidad de puertas. |
| **Constructor** | Método especial que se ejecuta al usar `new`. Inicializa el objeto. | La constructora que levanta la casa. |
| **`this`** | Palabra reservada que hace referencia a la instancia del objeto *actual*. | Decir "mi propia casa" en lugar de "una casa". |

## 2. Sintaxis Anotada del Constructor
```java
class Auto {
    String marca; // Atributo de la clase

    // El constructor se llama EXACTAMENTE igual que la clase.
    // NO lleva "void" ni ningún tipo de retorno.
    Auto(String marca) { 
        this.marca = marca; 
        // "this.marca" apunta al atributo de la clase (arriba).
        // "= marca" apunta al parámetro que ingresa entre los paréntesis.
    }
}