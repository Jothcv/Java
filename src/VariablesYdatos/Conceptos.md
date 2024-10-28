# Variables y Tipos de Datos en Java

En Java, una variable es un contenedor que guarda datos de un tipo específico, y los tipos de datos determinan el tipo de valor que una variable puede almacenar. Las variables en Java deben ser declaradas con un tipo de datos antes de ser usadas, y se pueden clasificar en primitivos y de referencia.

## Declaración y Inicialización de Variables

Para declarar una variable en Java, se sigue la estructura:

``` java
tipo nombreVariable = valorInicial;
```

Por ejemplo

``` java
int edad = 25;
String nombre = "Juan
```

### Reglas de Nombres de Variables

* Deben comenzar con una letra, $ o _, y pueden contener números después del primer carácter.

* No pueden usar palabras reservadas de Java.

* Es recomendable usar camelCase para nombres de variables en Java.

### Tipos de Datos Primitivos

Java tiene ocho tipos de datos primitivos, que se dividen en cuatro categorías: numéricos enteros, numéricos de punto flotante, carácter, y booleano.

### 1. Datos Numéricos Enteros

Estos se utilizan para almacenar valores enteros (sin decimales).

| Tipo  | Tamaño en bits | Valor Mínimo         | Valor Máximo        |
|-------|-----------------|----------------------|---------------------|
| byte  | 8              | -128                 | 127                |
| short | 16             | -32,768              | 32,767             |
| int   | 32             | -2^31                | 2^31 - 1           |
| long  | 64             | -2^63                | 2^63 - 1           |

Ejemplo:

```java
byte edad = 30;
short año = 2023;
int población = 1000000;
long distanciaEstrellas = 1234567890123L; // La "L" indica que es un long
```

### 2. Datos Numéricos de Punto Flotante

Estos tipos se usan para valores decimales.

| Tipo    | Tamaño en bits | Precisión                   |
|---------|-----------------|-----------------------------|
| float   | 32             | 6-7 dígitos decimales       |
| double  | 64             | 15-16 dígitos decimales     |

Ejemplo:

```java
float precio = 9.99f; // La "f" indica que es un float
double altura = 1.75;
```

### 3. Tipo char (Carácter)

Este tipo representa un solo carácter Unicode y ocupa 16 bits

```java
char inicial = 'A';
```

### 4. Tipo boolean (Booleano)

Este tipo solo puede contener uno de dos valores: true o false.

```java
boolean esJavaDivertido = true;
boolean esLluvioso = false;
```

## Tipos de Datos de Referencia

Los tipos de datos de referencia apuntan a objetos y no a valores de datos en sí. Son tipos que no son primitivos y pueden incluir `String`, `Array`, `Class`, `Interface`, y otros objetos personalizados.

***String***

`String` es un tipo de referencia para almacenar cadenas de caracteres. Aunque técnicamente es una clase, su uso es similar a los tipos primitivos.

```java
String mensaje = "Hola, mundo!";
```

### Arreglos (Arrays)

Un array es un conjunto de elementos de un mismo tipo. La longitud de un array en Java es fija.

```java
int[] numeros = {1, 2, 3, 4, 5};
String[] nombres = {"Ana", "Juan", "Luis"};
```

## Conversión entre Tipos de Datos

### Conversión Implícita (Widening)

Java permite la conversión implícita (o "widening")
entre tipos de menor precisión a tipos de mayor precisión.

```java
int a = 10;
double b = a; // Conversión implícita de int a double
```

### Conversión Explícita (Casting)

Para realizar una conversión de mayor a menor precisión, se requiere el uso de un casting.

```java
double x = 9.7;
int y = (int) x; // Convierte double a int, perdiendo los decimales
```

## Ejemplos Completos

****Ejemplo 1:****
**Uso de Variables Primitivas**

```java
public class TiposPrimitivos {
public static void main(String[] args) {
int edad = 25;
double salario = 50000.50;
char inicial = 'J';
boolean esEmpleado = true;

        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
        System.out.println("Inicial: " + inicial);
        System.out.println("Es empleado: " + esEmpleado);
    }
}
```

****Ejemplo 2:****
**Uso de Tipos de Referencia**

```java
public class TiposReferencia {
public static void main(String[] args) {
String saludo = "Hola, Java!";
int[] numeros = {1, 2, 3, 4, 5};

        System.out.println(saludo);
        
        System.out.print("Numeros: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
```

****Ejemplo 3:****
**Conversión de Tipos**

```java
public class ConversionTipos {
public static void main(String[] args) {
int a = 5;
double b = a; // Conversión implícita de int a double
double c = 9.8;
int d = (int) c; // Conversión explícita de double a int

        System.out.println("a como int: " + a);
        System.out.println("b como double (de a): " + b);
        System.out.println("c como double: " + c);
        System.out.println("d como int (de c): " + d);
    }
}
```
