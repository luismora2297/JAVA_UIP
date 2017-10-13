package io.alpha;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args)  throws IOException
    {
        //Inicializar año con BufferedReader
        BufferedReader year = new BufferedReader(new InputStreamReader(System.in));

        //Imprimir Mensajes
        System.out.print("Calculadora de anios bisiestos\n");
        System.out.print("Introduzca el anio a calcular\n\n");
        //Lee el año
        String xyz = year.readLine();
        //Convierte el string a un Integer
        int x = Integer.parseInt(xyz);
        //Aplica la condicion si el año capturado es modulo de 4, el modulo de 100 no es 0 o el modulo de 400 es igual a 0
        if((x % 4 == 0)&&((x % 100 != 0)||(x % 400 == 0)))
        {
            System.out.print(x+" es bisiesto");
        }
        else
        {
            System.out.print(x+" no es bisiesto");
        }
    }
}
