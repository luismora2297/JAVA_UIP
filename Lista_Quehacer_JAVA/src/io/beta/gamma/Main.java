package io.beta.gamma;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{
    public static void main(String[] args) {
        //Inicializando las variables
        int opcion = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //New nos puede indicar la creación de un nuevo objeto dentro de otro
        do
        {
            System.out.println("APP TRABAJAVAGO");
            System.out.println("1. Agregar\n2. Ver\n3. Completar\n4. Salir");
            System.out.println("Opcion: ");
            try
            {
                opcion = Integer.parseInt(br.readLine());
            }
            catch (NumberFormatException e)
            {
                System.out.println("Dato Inválido.");
            }
            catch (Exception e)
            {
                //e.printStackTrace(); -> Esta opcion tira el error y cierra el programa
                System.out.println("Error desconocido.");
            }

            //Switch con casos, sirve tanto para integers, como cadenas (string)
            switch (opcion)
            {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                //Esta opcion, ocurre por predefinición, es decir, que si no cumple ninguno de los casos, lanza un error o realiza una acción.
                default:
                    System.out.println("Opcion fuera de rango");
                    break;
            }
        }while(opcion != 4);
    }
}
