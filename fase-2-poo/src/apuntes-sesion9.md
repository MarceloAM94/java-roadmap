# Teoría Sesión 9: Encapsulamiento

## 1. Modificadores de Acceso Core
Controlan quién puede ver o modificar los componentes de una clase.

| Modificador | Alcance (Quién lo ve) | Cuándo usarlo |
| :--- | :--- | :--- |
| **`private`** | SOLO dentro de la misma clase. | Siempre por defecto para los atributos. |
| **`public`** | Desde cualquier parte del proyecto. | Para Getters, Setters y métodos de negocio. |
| **`protected`** | Misma carpeta (paquete) y clases hijas. | Lo veremos en Herencia (Sesión 10). |
| **(default)** | Misma carpeta (paquete) únicamente. | Cuando omites la palabra (casi no se usa). |

## 2. Getters y Setters
Son métodos públicos que actúan como "puertas" a las variables privadas.

*   **Getter:** Devuelve el valor. Siempre tiene tipo de retorno y no recibe parámetros.
    ```java
    public double getPrecio() {
        return this.precio;
    }
    ```
*   **Setter:** Modifica el valor. Siempre es `void` (no devuelve nada) y recibe un parámetro. Es el lugar ideal para poner validaciones (ifs).
    ```java
    public void setPrecio(double nuevoPrecio) {
        if(nuevoPrecio > 0) {
            this.precio = nuevoPrecio;
        }
    }
    ```

## 3. Principio de Ocultación de Información
El mundo exterior no necesita saber cómo calculas las cosas por dentro, solo necesita el resultado. Por ejemplo, `calcularPrecioFinal()` esconde la fórmula matemática. Si mañana Steam cambia la fórmula de impuestos, la cambias en un solo lugar y el resto del programa ni se entera.