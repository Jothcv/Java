# Estructuras de Control en Java

Las **estructuras de control** en Java permiten definir el flujo de ejecución del programa. Esto significa que el programa puede tomar decisiones, repetir acciones y elegir entre diferentes caminos de acuerdo con las condiciones. Las estructuras de control en Java se dividen en **estructuras de control condicionales** y **estructuras de control de repetición**.

## 1. Estructuras de Control Condicional

Las estructuras condicionales permiten ejecutar bloques de código solo si se cumplen ciertas condiciones. Las principales estructuras condicionales en Java son:

### 1.1 `if`, `else if` y `else`

La estructura `if` ejecuta un bloque de código si una condición es verdadera. Se puede usar `else if` para agregar condiciones adicionales y `else` para ejecutar un bloque de código si ninguna de las condiciones anteriores se cumple.

**Sintaxis:**

```java
if (condición) {
    // Bloque de código si la condición es verdadera
} else if (otraCondición) {
    // Bloque de código si la otraCondición es verdadera
} else {
    // Bloque de código si ninguna condición es verdadera
}
```

**Ejemplo**

```java
int edad = 20;

if (edad >= 18) {
    System.out.println("Eres mayor de edad.");
} else if (edad >= 13) {
    System.out.println("Eres un adolescente.");
} else {
    System.out.println("Eres un niño.");
}
```

### 1.1 `switch`
La estructura `switch` permite seleccionar y ejecutar un bloque de código de entre varias opciones posibles, basándose en el valor de una expresión. Es útil cuando hay varias condiciones posibles para un solo valor.

**Sintaxis:**
```java
switch (expresión) {
case valor1:
// Bloque de código para el valor1
break;
case valor2:
// Bloque de código para el valor2
break;
// Casos adicionales
default:
// Bloque de código si no coincide ningún caso
}
```
**Ejemplo**

```java
int dia = 3;
String nombreDia;

switch (dia) {
case 1:
nombreDia = "Lunes";
break;
case 2:
nombreDia = "Martes";
break;
case 3:
nombreDia = "Miércoles";
break;
default:
nombreDia = "Día desconocido";
}

System.out.println("Hoy es " + nombreDia);
```

## 2. Estructuras de Control de Repetición (Bucles)
Las estructuras de control de repetición permiten ejecutar un bloque de código varias veces. Java cuenta con varias estructuras de repetición:

### 2.1 `for`
El bucle `for` se utiliza cuando se sabe de antemano el número de veces que se desea ejecutar un bloque de código. Tiene tres partes: inicialización, condición y actualización.

**Sintaxis:**
```java
for (inicialización; condición; actualización) {
    // Bloque de código que se ejecuta mientras la condición es verdadera
}
```
**Ejemplo**
```java
for (int i = 0; i < 5; i++) {
System.out.println("Iteración " + i);
}
```

### 2.2 `for-each`
El bucle `for-each` es una forma simplificada de for que se utiliza para recorrer elementos en arreglos o colecciones.

**Sintaxis:**
```java
for (tipo elemento : colección) {
// Bloque de código que se ejecuta para cada elemento
}
```
**Ejemplo**
```java
int[] numeros = {1, 2, 3, 4, 5};

for (int numero : numeros) {
    System.out.println("Número: " + numero);
}
```

### 2.3 `while`
El bucle while ejecuta un bloque de código mientras una condición sea verdadera. Es útil cuando no se sabe el número exacto de iteraciones.

**Sintaxis:**
```Java
while (condición) {
// Bloque de código que se ejecuta mientras la condición es verdadera
}
```
**Ejemplo:**
```java
int contador = 0;

while (contador < 5) {
    System.out.println("Contador: " + contador);
    contador++;
}
```

### 2.4 `do-while`
El bucle `do-while` es similar a `while`, pero garantiza que el bloque de código se ejecute al menos una vez, ya que la condición se evalúa después de la ejecución del bloque.

**Sintaxis**

```java
do {
// Bloque de código que se ejecuta al menos una vez
} while (condición);
```

**Ejemplo**

```java 
int contador = 0;

do {
    System.out.println("Contador: " + contador);
    contador++;
} while (contador < 5);
```
## 3. Control de Flujo en Bucles
Java proporciona varias palabras clave para manipular el flujo dentro de los bucles:

### 3.1 `break`
La instrucción `break` termina el bucle actual y transfiere el control al siguiente bloque de código después del bucle.

**Ejemplo**

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break; // Sale del bucle cuando i es 5
    }
    System.out.println("i: " + i);
} 
```
### 3.2 `continue`
La instrucción `continue` detiene la iteración actual y pasa a la siguiente iteración del bucle.

**ejemplo**
```java
for (int i = 0; i < 10; i++) {
if (i % 2 == 0) {
continue; // Salta los números pares
}
System.out.println("i: " + i);
}
```
### 3.3 Etiquetas (`label`)

Java permite etiquetar bucles con un nombre y utilizar `break` o `continue` con esa etiqueta para controlar el flujo en bucles anidados, permitiendo salir o continuar en bucles externos desde uno interno.

**Ejemplo:**

```java
externo:
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        if (i == j) {
            continue externo; // Salta a la siguiente iteración del bucle etiquetado "externo"
        }
        System.out.println("i: " + i + ", j: " + j);
    }
}
```
## Ingresar dato
para poder ingresar un dato desde la consola en java devemos crear un objeto e importar una libreria

****mas o menos asi****
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("¿Cuál es tu nombre? ");
        String nombre = entrada.nextLine();

        System.out.println("Hola, " + nombre + ".");
    }
}
```