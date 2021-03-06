# JAVA_UIP
Programación II / Universidad Interamericana de Panamá

Este repositorio ha sido elaborado por:

> Luis Daniel Mora Delgado
> cedula E-8-135595
> para la materia de Programación II
> con el profesor Abdel Martinez.

@luismora2297

# Documentación :octocat: :godmode:

- [x] 22 de Septiembre de 2017
- [x] 13 de Octubre de 2017
* Temas en esta fecha son: __Tipos de datos, salida de datos, ciclos, etc.__
### ¿Como se estructura un programa en JAVA? :goberserk:

La primera clase Main es el nombre que debe tener el archivo, es decir, si se cambia el nombre Main, el archivo debe tener el cambio de nombre.

"Public" significa que cualquier objeto puede acceder a esa sección, los atributos, metodos y clases son los unicos que se pueden definir como esto. A esto se le llaman atributos, en contraste a los metodos, los metodos son por lo general privados privados.	

"Static" indica que no es necesario que se cree un objeto que lo represente. Se la puede llamar como función. El "void" indica que no regresara nada.

"String[] args" indica los argumentos que recibira el método, principalmente "String[] args" indica que posiblemente su argumento sera un arreglo en cadena.

Las llaves igual que en C, deben cerrarse correctamente donde abren, sino lanza algun error.

``` 
public class Main 
{
	public static void main(String[] args)
	{
		//Codigo aquí
	}

}
```

¿Como darse cuenta que algo es una clase? Simplemente cuando la palabra o el nombre se escribe en Mayuscula.

System entonces es una clase, out es una acción, y println seria la función, debe escribirse entre parentesis y comillas __("ACCIÓN")__.

```// Asi se escriben los comentarios ```

Los tipos de enteros son byte, short, int, long. Depende de lo que se trabaja en un programa para escogerlos, por que poseen una cantidad de números para guardar (precisión).

* byte = 8
* short = 16
* int = 32
* long = 64

Sus límites son:

* byte = 2⁸
* short = 2¹⁶
* int = 2³²
* long = 2⁶⁴

Las variables se declaran con el tipo de dato, y luego va el nombre de la variable.

``` 
byte a;
short b;
int d = 0;
long c;
```

Los tipos de decimales son float y double. Depende de lo que se trabaja en un programa para escogerlos, por que poseen una cantidad de números para guardar (precisión).

* float = 32
* double = 64

En JAVA, un float debe al final declararse con f, ejemplo:

``` 
float e = 0.0f;
double f = 0.0;
```

En JAVA, los carácteres son entre apostrofes ' ' y las cadenas deben ir en comillas " ", sino el código dará error. 
``` 
char g = 'a';
String h = "Hola Mundo";
```

Debe destacarse que String es una clase, y no un tipo de dato, surge a partir de la dificultad de concatenar varios char a una cadena, por lo que para JAVA, el String se creo como clase y no tipo de dato.

Booleanos, son true y false, son solamente declaradas por **boolean**

``` 
boolean i = true;
i = false;
```

**Buffered Reader**

Este sirve para leer todas las clases de datos, pero entran en cadena, luego en el codigo se deben transformar a el tipo de dato que se desea. Cuando una variable se declara con BufferedReader, se debe establecer con **new** que por obligación es un BufferedReader

Un **constructor** se encarga de inicializar los objetos de una clase.

Ejemplo de todo esto:

```
BufferedReader yu = new BufferedReader(new InputStreamReader(System.in));
```
Con .readLine() se lee lo que entra en el programa.

_Nota: En JAVA, print() y println() tienen una diferencia, println() hace un salto de línea mientras print() no lo hace._

Cada tipo de dato, tiene su forma de transformarse con parse, para BufferedReader, es obligatorio debido a que solo los trae como cadenas.

* **INT** Integer.parseInt();
* **DOUBLE** Double.parseDouble();
* **FLOAT** Float.parseFloat();

El IOException ayuda a que el programa no recoja basura y lance un error de entrada y salida.

La Exception lanza error de Excepcion al momento que recibe una clase de datos que no es.

En el caso de BufferedReader, se necesita InputStreamReader para que funcione como lectura referente al teclado.

El método equals() funciona es para cadenas. El método .toUpperCase() transforma la letra o cadena a mayuscula y .toLowerCase() es para transformar la letra o cadena a minisculas.

También existe en JAVA printf(), aquí se declara como System.out.printr("Mensaje 1 %s y cantidad $%.2f", variablestring, variablefloat). El método .printf() es imprimir con formato.

* %s indica string
* %i indica imprimir integer
* $%.2f indica imprimir float

_¡Es igual que en C y C++!_.

Para truncar un float se debe utilizar la libreria Math de JAVA.

Los ciclos de repeticion son for, while y do while.

**FOR**
```
for(int i; i<'0';i++)
{
	//Codigo
}
```

**WHILE**
```
while(true) //u otra condición
{
	//Codigo
}
```

**DO WHILE**
```
do
{
	//Codigo
}while(true) //u otra condición

```

For recientemente a tenido varias variantes recientemente en JAVA y otros lenguajes.



- [x] 20 de Octubre de 2017 :goberserk:
Vamos a ver las clases, para realizar un programa en especifico.

El programa que realizaremos es un punto de pago.


- Pago Servicios
	1. Luz
	2. Agua
	3. Internet
	4. Telefonía
	5. Televisión
	6. Salir
- (Mensaje) ¿Que servicio desea pagar? ____
- Seleccione su compañia
	1. ENSA
	2. FENOSA
- (Mensaje) ¿Que compañia?___
- Numero del Cliente ___
- Precio de la factura ___
- Monto a pagar ___
- Forma de Pago
	1. Efectivo
	2. Otro
- Opcion
- (Mensaje) ¿Desea realizar otro pago?

Las clases serian las declaraciones que contienen varios objetos. Es decir, ayuda a generar los objetos mediante funciones/métodos. (?)
Los atributos son las caracteristicas que estan en la clase.

**Cambio**

El nuevo programa será

- Lista de Quehaceres
	1. Agregar Tarea
	2. Ver Tareas
	3. Completar Tarea
	4. Salir
	
Si se selecciona 1

	Nombre:
	Fecha Tarea:
	Estado:
	Criticidad: (Baja, media, alta)
**¡Interfaz de Usuario!**	

Tarea es nuestra clase.

Deben manejarse las Excepciones, por medio de IOException, aunque podremos validarla para que el programa no tenga problemas o errores.
Por medio de surround with try catch, realizaremos las excepciones de entrada. IOException es un error de entrada salida, NumberException, NullPointerException son otros tipos de excepciones, pero si colocamos solamente Exception en la línea de excepcion, entonces captura todas las excepciones que puede realizar el programa.

Si en BufferedReader se pasara una cadena, no se necesita realizar ningun parse debido a que la cadena ya esta en el tipo de dato **._.** :goberserk:

Usar **throws IOException** debemos estar seguros de que las líneas que se validan por entrada y salida, no vayan a hacer que el programa "reviente" :boom: o se cierre por un error :rage3:, por ende, entonces, es recomendable el try/catch, para asi evitar que se cierre el programa y lanzar un mensaje de validación. :smiley:

.equals()  se usa en objetos, y clases. Tener cuidado al usar este metodo con los que no son objetos.

- [x] 27 de Octubre de 2017

Vamos a aprender **Hash Map**. :goberserk:

Es una relación que tiene una llave en un arreglo, dos elementos, uno precede a otro como una llave que contiene un valor, en otros lenguajes, el Hash Map se conoce como diccionario (como en Python).

K:V
Llave : Auto
Abuela : Mamá
Real : 10

etc.

El recorrido de un arreglo se hara distinto a un ciclo de repetición.

Por medio del hash map **for (Tarea a : lista_tareas)** lo puedo realizar sin tener que recorrer con un contador.

Dos son los métodos para obtener los valores privados de una clase que pone sus atributos como valores.

- Setter: Con esto lo obtengo y lo cambio.
- Getter: con este, obtengo solamente el dado.

Estos generan dos funciones, una que puede llamarse como getAtributo, que solo da un return al atributo, o setAtributo, que es un void por que no da return de nada, pero realiza una acción de guardar.

super(); es un metodo que llama al objeto padre.

### Traer un programa hecho en JAVA a gusto propio :rage2:

Este programa es libre, pero puede ser la base del proyecto.


- [x] 3 de Noviembre de 2017 :goberserk:

No se vieron clases por dos semanas, sin embargo, el profesor dicto clases para herencia y entre otras cosas.

- [x] 16 - 17 de Noviembre de 2017

Como el dia 17 de Noviembre no iré a clases, entonces me he colado en la clase del día anterior.

Entraremos a JAVAFX, será para hacer una aplicación de escritorio (laptop/desktop).

|       Proyecto Final :neckbeard:       |
|----------------------------------------|
| 1. VENTA DE COMPUTADORAS YOITEK        |
| 2. DICCIONARIO ENCICLOPEDICO ENKHARTA  |
| 3. CODIZADOR DE MANTENIMIENTO HIUNDAI  |
| 4. RESERVA DE HOSTAL PLAYA LA ANCHA    |
| Evaluación                             |
| Código (3 preguntas)           40% (1) |
| Repositorio                    30% (2) |
| Demo                           30% (3) |
| Máximo 6 personas                      |

Vamosa usar SceneBuilder para hacer una interfaz gráfica, por debajo el escribe con XML, que debo investigar profundamente. FXML es la versión modificada del mismo, SceneBuilder entonces será para hacer la interfaz con IntelliJ

Se puede descargar varias versiones del SceneBuilder. En IntelliJ, cuando creamos un FXML, en la parte inferior, se encuentra nuestro scenebuilder, no es muy confiable usar el embebido por que consume mucha ram, por lo que se prefiere usar los programas por separado.

También cuando se crea un JAVAFX se crea una nueva clase de JAVA para usar en la aplicación.

SceneBuilder me ayudara más a modificar el archivo por medio de arrastrar los bloques, input, etc, es más rapido.

- [] 24 de Noviembre de 2017 :goberserk:


# Licencia (Ingles) :skull: :goberserk:

MIT License

Copyright (c) 2017 Luis Daniel Mora Delgado / Black Bohr

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
