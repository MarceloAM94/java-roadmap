# Teoría Sesión 11: Polimorfismo y Binding Dinámico

## 1. Conceptos Core
*   **Polimorfismo:** Capacidad de un objeto de tomar múltiples formas. Permite tratar a objetos de clases hijas como si fueran de la clase padre.
*   **Sobrescritura (Overriding):** Ocurre cuando una clase hija redefine un método heredado del padre para darle su propio comportamiento.
*   **Binding Dinámico:** Es el mecanismo por el cual Java decide en tiempo de ejecución (y no en tiempo de compilación) qué versión de un método sobrescrito debe ejecutarse, basándose en el tipo del objeto real en memoria.

## 2. Regla de Oro de las Referencias
```java
Padre variable = new Hijo();
```
