package io.beta.gamma;
import java.io.BufferedReader;
//Añado IOException para evitar un try catch cada vez que realizo la entrada de un string
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws IOException {
        //Inicializando las variables
        int opcion = 0;
        ArrayList<Tarea> lista_tareas= new ArrayList<>();
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
                        String n, ft, c;
                        System.out.print("Nombre: ");
                        n = br.readLine();
                        System.out.print("Fecha Tope: ");
                        ft = br.readLine();
                        do
                        {
                            System.out.print("Criticidad (Alta/Baja/Media): ");
                            c = br.readLine();
                            if(c.toLowerCase().equals("alta") || c.toLowerCase().equals("media") || c.toLowerCase().equals("baja"))
                            {
                                break;
                            }
                            else
                            {
                                System.out.println("¡Criticidad Inválida!");
                            }
                        }while(true);
                        //Valido las entradas si no son iguales para que salga del ciclo de repetición.

                        //New servira para crear el nuevo objeto
                        Tarea t1 = new Tarea(n,ft,c);
                        lista_tareas.add(t1);
                        System.out.println("La lista tiene"+ lista_tareas.size());
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Hasta el proximo viernes VIKERNES!");
                    break;
                //Esta opcion, ocurre por defecto, es decir, que si no cumple ninguno de los casos, lanza un error o realiza una acción.
                default:
                    System.out.println("Opcion fuera de rango");
                    break;
            }
        }while(opcion != 4);
    }
}
