# Funciones en Java: Guía Completa

## Introducción a las Funciones

Las funciones, también conocidas como métodos en Java, son bloques de código reutilizables que realizan una tarea específica. Son fundamentales en la programación orientada a objetos y permiten organizar el código de manera modular, mejorando su mantenibilidad y legibilidad.

### Características Principales
- **Modularidad**: Dividen el código en unidades funcionales
- **Reutilización**: Permiten usar el mismo código múltiples veces
- **Encapsulamiento**: Ocultan la complejidad de la implementación
- **Mantenibilidad**: Facilitan la actualización y corrección del código

## Anatomía de una Función

### Estructura Básica
```java
modificadorAcceso tipoRetorno nombreFuncion(parametros) {
    // Declaraciones
    // Lógica de la función
    return valor; // Si la función no es void
}
```

### Componentes
1. **Modificador de acceso**: Define la visibilidad
    - `public`: Accesible desde cualquier clase
    - `private`: Solo accesible dentro de la clase
    - `protected`: Accesible en el mismo paquete y subclases
    - Por defecto (sin modificador): Accesible en el mismo paquete

2. **Tipo de retorno**: Define el tipo de dato que devuelve
    - Tipos primitivos (`int`, `double`, etc.)
    - Objetos (`String`, clases personalizadas)
    - `void`: No devuelve ningún valor

3. **Nombre**: Identificador de la función
    - Debe comenzar con letra minúscula
    - Usar camelCase para nombres compuestos
    - Debe ser descriptivo de su propósito

4. **Parámetros**: Datos que recibe la función
    - Pueden ser de cualquier tipo
    - Pueden ser múltiples, separados por comas
    - Pueden no existir (paréntesis vacíos)

## Tipos de Funciones

### 1. Funciones sin Retorno (void)
```java
public void imprimirMensaje(String mensaje) {
    System.out.println("Mensaje: " + mensaje);
}
```

### 2. Funciones con Retorno
```java
public double calcularPromedio(double... numeros) {
    double suma = 0;
    for (double num : numeros) {
        suma += num;
    }
    return suma / numeros.length;
}
```

### 3. Funciones Estáticas
```java
public static int generarNumeroAleatorio(int min, int max) {
    return min + (int)(Math.random() * ((max - min) + 1));
}
```

### 4. Funciones con Sobrecarga
```java
public class Calculadora {
    public int sumar(int a, int b) {
        return a + b;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public int sumar(int... numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }
}
```

## Conceptos Avanzados

### 1. Recursividad
Las funciones recursivas son aquellas que se llaman a sí mismas para resolver un problema.

```java
public long calcularFactorial(int n) {
    if (n <= 1) {
        return 1;
    }
    return n * calcularFactorial(n - 1);
}
```

### 2. Funciones Lambda (Java 8+)
Expresiones lambda para crear funciones anónimas.

```java
interface OperacionMatematica {
    double calcular(double a, double b);
}

// Uso de lambda
OperacionMatematica suma = (a, b) -> a + b;
OperacionMatematica multiplicacion = (a, b) -> a * b;
```

### 3. Funciones de Orden Superior
Funciones que pueden recibir otras funciones como parámetros.

```java
public double operarNumeros(double a, double b, OperacionMatematica operacion) {
    return operacion.calcular(a, b);
}

// Uso
double resultado = operarNumeros(5, 3, (a, b) -> a + b);
```

## Buenas Prácticas

### 1. Nomenclatura
- Usar verbos para nombres de funciones
- Nombres descriptivos y concisos
- Seguir convenciones de camelCase

```java
// Bien
public void guardarUsuario(Usuario usuario)
public boolean esNumeroValido(int numero)

// Mal
public void x(Usuario u)
public boolean validacion(int n)
```

### 2. Principio de Responsabilidad Única
Cada función debe hacer una sola cosa y hacerla bien.

```java
// Bien
public void guardarUsuario(Usuario usuario) {
    validarUsuario(usuario);
    persistirUsuario(usuario);
    notificarRegistro(usuario);
}

// Mal
public void procesarUsuario(Usuario usuario) {
    // Validación
    // Persistencia
    // Envío de email
    // Generación de reportes
    // etc...
}
```

### 3. Manejo de Errores
Usar excepciones para manejar errores de manera adecuada.

```java
public double dividir(double numerador, double denominador) {
    if (denominador == 0) {
        throw new IllegalArgumentException("El denominador no puede ser cero");
    }
    return numerador / denominador;
}
```

### 4. Documentación
Usar JavaDoc para documentar funciones.

```java
/**
 * Calcula el área de un círculo dado su radio.
 * 
 * @param radio El radio del círculo
 * @return El área del círculo
 * @throws IllegalArgumentException si el radio es negativo
 */
public double calcularAreaCirculo(double radio) {
    if (radio < 0) {
        throw new IllegalArgumentException("El radio no puede ser negativo");
    }
    return Math.PI * radio * radio;
}
```

## Ejemplos Prácticos

### 1. Procesamiento de Colecciones
```java
public class ProcesadorListas {
    public <T> List<T> filtrar(List<T> lista, Predicate<T> criterio) {
        return lista.stream()
                   .filter(criterio)
                   .collect(Collectors.toList());
    }

    public <T, R> List<R> transformar(List<T> lista, Function<T, R> transformacion) {
        return lista.stream()
                   .map(transformacion)
                   .collect(Collectors.toList());
    }
}
```

### 2. Patrón Builder con Funciones
```java
public class Usuario {
    private String nombre;
    private String email;
    private int edad;

    public static class Builder {
        private Usuario usuario;

        public Builder() {
            usuario = new Usuario();
        }

        public Builder conNombre(String nombre) {
            usuario.nombre = nombre;
            return this;
        }

        public Builder conEmail(String email) {
            usuario.email = email;
            return this;
        }

        public Builder conEdad(int edad) {
            usuario.edad = edad;
            return this;
        }

        public Usuario construir() {
            return usuario;
        }
    }
}

// Uso
Usuario usuario = new Usuario.Builder()
    .conNombre("Juan")
    .conEmail("juan@email.com")
    .conEdad(25)
    .construir();
```

## Conclusión

Las funciones son un pilar fundamental en la programación Java. Una buena comprensión y aplicación de los conceptos presentados permite:
- Escribir código más limpio y mantenible
- Mejorar la reutilización de código
- Facilitar las pruebas unitarias
- Crear aplicaciones más robustas y escalables

La clave está en combinar estos conceptos de manera efectiva según los requerimientos específicos de cada proyecto, siempre siguiendo las buenas prácticas y patrones de diseño establecidos.
# Métodos en Java: Sintaxis y Ejemplos

Los métodos en Java permiten organizar el código en bloques funcionales, facilitando la reutilización, la modularidad y el mantenimiento. Aquí cubrimos cada tipo de método, su sintaxis y ejemplos detallados.

## 1. Métodos sin Retorno (`void`)

### Descripción
Un método sin retorno, identificado por la palabra clave `void`, realiza una acción sin devolver un valor. Este tipo de método es ideal para operaciones que no necesitan un resultado, como imprimir mensajes o actualizar el estado de un objeto.

### Sintaxis
```java
modificadorDeAcceso void nombreDelMetodo(parametros) {
    // Cuerpo del método
}
```

### Ejemplo
```java
public void mostrarMensaje(String mensaje) {
    System.out.println("Mensaje: " + mensaje);
}

// Uso
mostrarMensaje("¡Hola, Java!");
```

## 2. Métodos con Retorno

### Descripción
Un método con retorno devuelve un valor específico al final de su ejecución. Este valor puede ser un tipo primitivo o un objeto. La palabra clave return se utiliza para devolver el valor.

### Sintaxis
```java
modificadorDeAcceso tipoDeRetorno nombreDelMetodo(parametros) {
    // Cuerpo del método
    return valor;
}
```

### Ejemplo
```java
public int sumar(int a, int b) {
    return a + b;
}

// Uso
int resultado = sumar(5, 3);
System.out.println("Resultado de la suma: " + resultado);
```

## 3. Métodos con Parámetros

### Descripción
Los métodos pueden recibir uno o más parámetros para realizar operaciones específicas. Estos parámetros funcionan como variables locales dentro del método, y permiten modificar el comportamiento del método según los valores recibidos.

### Sintaxis
```java
modificadorDeAcceso tipoDeRetorno nombreDelMetodo(tipo parametro1, tipo parametro2) {
    // Cuerpo del método
}
```

### Ejemplo
```java
public double calcularArea(double radio) {
    return 3.1416 * radio * radio;
}

// Uso
double area = calcularArea(7);
System.out.println("Área del círculo: " + area);
```

## 4. Métodos Estáticos

### Descripción
Un método estático pertenece a la clase en lugar de a una instancia específica de la clase. Los métodos estáticos pueden llamarse directamente usando el nombre de la clase. No pueden acceder a variables de instancia ni llamar a métodos no estáticos.

### Sintaxis
```java
public static tipoDeRetorno nombreDelMetodo(parametros) {
    // Cuerpo del método
}
```

### Ejemplo
```java
public class Calculadora {
    public static int multiplicar(int a, int b) {
        return a * b;
    }
}

// Uso sin crear una instancia de la clase
int resultado = Calculadora.multiplicar(4, 5);
System.out.println("Resultado de la multiplicación: " + resultado);
```

## 5. Sobrecarga de Métodos (Overloading)

### Descripción
La sobrecarga de métodos permite definir múltiples métodos con el mismo nombre pero con diferentes tipos o números de parámetros. Esta funcionalidad es útil para realizar la misma acción de diferentes maneras según los argumentos recibidos.

### Sintaxis
```java
public tipoDeRetorno nombreDelMetodo(tipo parametro1) {
    // Implementación 1
}

public tipoDeRetorno nombreDelMetodo(tipo parametro1, tipo parametro2) {
    // Implementación 2
}
```

### Ejemplo
```java
public int sumar(int a, int b) {
    return a + b;
}

public double sumar(double a, double b) {
    return a + b;
}

// Uso
int resultado1 = sumar(5, 3);       // Llama al método int
double resultado2 = sumar(5.5, 3.2); // Llama al método double

System.out.println("Resultado (int): " + resultado1);
System.out.println("Resultado (double): " + resultado2);
```

## 6. Métodos Recursivos

### Descripción
La recursividad es cuando un método se llama a sí mismo. Es útil para problemas que se pueden dividir en subproblemas más pequeños. Es importante que un método recursivo tenga una condición de salida para evitar una llamada infinita.

### Sintaxis
```java
public tipoDeRetorno nombreDelMetodo(parametro) {
    if (condicionDeSalida) {
        return valorBase;
    } else {
        // Llamada recursiva
        return nombreDelMetodo(valor);
    }
}
```

### Ejemplo
```java
public int factorial(int n) {
    if (n == 0) {
        return 1; // Condición de salida
    } else {
        return n * factorial(n - 1); // Llamada recursiva
    }
}

// Uso
int resultado = factorial(5);
System.out.println("Factorial de 5: " + resultado);
```

## 7. Métodos con Parámetros de Referencia

### Descripción
En Java, los tipos primitivos se pasan por valor, pero los objetos se pasan por referencia, lo que significa que el método puede modificar el contenido de un objeto. Esto permite que un método altere los atributos de un objeto recibido como parámetro.

### Ejemplo
```java
public void cambiarNombre(Persona persona) {
    persona.setNombre("Nuevo Nombre");
}

// Uso
Persona persona1 = new Persona("Nombre Original");
cambiarNombre(persona1);
System.out.println("Nombre actualizado: " + persona1.getNombre()); // Imprime "Nuevo Nombre"
```

## 8. Métodos con Valores por Defecto (Simulación)

### Descripción
Java no admite directamente parámetros por defecto, pero se pueden simular usando la sobrecarga de métodos, donde un método llama a otro con valores predefinidos.

### Ejemplo
```java
public int calcularDescuento(int precio) {
    return calcularDescuento(precio, 10); // Llama a otro método con un valor por defecto
}

public int calcularDescuento(int precio, int descuento) {
    return precio - (precio * descuento / 100);
}

// Uso
int precioConDescuento1 = calcularDescuento(1000);           // Usa el descuento por defecto de 10%
int precioConDescuento2 = calcularDescuento(1000, 20); // Usa un descuento especificado del 20%
System.out.println("Precio con descuento (10%): " + precioConDescuento1);
System.out.println("Precio con descuento (20%): " + precioConDescuento2);
```