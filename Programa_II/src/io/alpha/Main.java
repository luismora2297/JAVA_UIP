/*
* Luis Daniel Mora Delgado  E-8-135595
*
* Problema a resolver:
* Elabore un programa que calcule la comisión del equipo de ventas de la empresa NOESTOYENTENDIENDO,
* el programa preguntará por vendedor, su nombre, tipo (A o Z) y la venta mensual, a continuación, las reglas
* de comisiones
*
* TIPO A
*  VENTA > 9999.99: 15%
*  4999.99 < VENTA < 9999.99: 10%
*  999.99 < VENTA < 4999.99: 5%
*  VENTA < 999.99: 2%
*
* TIPO Z
*  VENTA >5000: 7%
*
* El programa debe imprimir el nombre del vendedor, su tipo, la venta mensual y su comisión.
*
* Ejemplo
* NoEstoyEntendiendo - Módulo de Ventas
* Vendedor: Petra Petrov
* Tipo (A/Z): A
* Venta Mensual: valor
* Petra Petrov, del tipo A, con venta mensual de $valor, tiene $valor de comision
*
* Procesar otro vendedor? (S/N)
*/

package io.alpha;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        //Declaración de Variables
        String vendedor;
        float ventamensual;
        float comision=0.00f;
        char tipovendedor,wish;
        boolean seguir=true;
	    BufferedReader axl= new BufferedReader (new InputStreamReader(System.in));
        //Ciclo de repetición
	    while(seguir==true)
        {
            //Aplicar preguntas e impresión
            //Imprimir Titulo
            System.out.println("NoEstoyEntendiendo - Módulo de Ventas");
            //Petición del nombre del Vendedor
            System.out.print("Vendedor: ");
            vendedor = axl.readLine();
            //Petición del tipo de vendedor actual
            System.out.print("Tipo: ");
            //Aplicar transformación a Caracter y con Mayusculas
            String car = axl.readLine();
            String realcar = car.toUpperCase();
            //Solo tomara la primera letra que esta ubicada en la cadena de realcar, ya que String es un arreglo de cadenas
            tipovendedor = realcar.charAt(0);
            //Petición de los datos de la venta mensual
            System.out.print("Venta mensual: ");
            String val = axl.readLine();
            ventamensual = Float.parseFloat(val);
            //Aplicar las condiciones del tipo de vendedor
            if(tipovendedor == 'A')
            {
                //Aplicar las condiciones de comision recibida gracias al porcentaje de la venta mensual
                if (ventamensual > 9999.99)
                {
                    comision=ventamensual*0.15f;
                }
                else if ((ventamensual < 9999.99)&&(ventamensual > 4999.99))
                {
                    comision=ventamensual*0.10f;
                }
                else if ((ventamensual < 4999.99)&&(ventamensual > 999.99))
                {
                    comision=ventamensual*0.05f;
                }
                else
                {
                    comision=ventamensual*0.02f;
                }
            }
            else if(tipovendedor == 'Z')
            {
                //Aplicar las condiciones de la venta mensual
                if (ventamensual > 5000.00)
                {
                    comision=ventamensual*0.07f;
                }
                //Error al no poseer más de 5000.00, pero sigue con el ciclo de repeticion
            }
            //Ahora aquí lanza un mensaje de Error para que lo intente de nuevo si el tipo de vendedor no es correcto
            if((tipovendedor != 'A') && (tipovendedor != 'Z') )
            {
                System.out.println("Ninguna opción fue correcta, intentelo de nuevo por favor.");
                System.out.println("¿Desea Continuar? (S/N): ");
            }
            else
            {
                //Imprimir datos del vendedor
                System.out.println(vendedor+", de tipo "+ tipovendedor +", con venta mensual de "+ ventamensual +", tiene "+ comision +" de comision");
                System.out.println("¿Desea Continuar? (S/N): ");
            } //Fin if else
            //Aplicar transformación a Caracter y con Mayusculas
            String wishcon = axl.readLine();
            String realwishcon = wishcon.toUpperCase();
            //Solo tomara la primera letra que esta ubicada en la cadena de realcar, ya que String es un arreglo de cadenas
            wish = realwishcon.charAt(0);
            //Si desea continuar, seguira el ciclo de repetición, cualquier otra letra le hara salir del ciclo de repeticion
            if(wish!='S')
            {
                seguir=false;
            }
            else
            {
                seguir=true;
            }//Fin if else
        } //Fin while
    }//Fin main
}//Fin Programa
