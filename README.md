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
- [ ] 13 de Octubre de 2017
* Temas a dar son: Tipos de datos, salida de datos, ciclos, etc.
## ¿Como se estructura un programa en JAVA?

La primera clase Main es el nombre que debe tener el archivo, es decir, si se cambia el nombre Main, el archivo debe tener el cambio de nombre.

"Public" significa que cualquier objeto puede acceder a esa sección, los atributos, metodos y clases son los unicos que se pueden definir como esto. A esto se le llaman atributos, en contraste a los metodos, los metodos son por lo general privados privados.	

"Static" indica que no es necesario que se cree un objeto que lo represente. Se la puede llamar como función. El "void" indica que no regresara nada.

"String[] args" indica los argumentos que recibira el método, principalmente "String[] args" indica que posiblemente su argumento sera un arreglo en cadena.

Las llaves igual que en C, deben cerrarse correctamente donde abren, sino lanza algun error.

``` public class Main 
{
	public static void main(String[] args)
	{
		//Codigo aquí
	}

}```

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
