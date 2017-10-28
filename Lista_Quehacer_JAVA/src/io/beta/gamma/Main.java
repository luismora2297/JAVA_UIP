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
            System.out.print("Opcion: ");
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
                        //n = nombre ft = fecha_tope c = criticidad
                        String n, ft, c;
                        System.out.print("\nNombre: ");
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

                        //New servira para crear el nuevo objeto con el constructor
                        Tarea t1 = new Tarea(n,ft,c);

                        /* Para generar la tarea con el setter
                        *
                        * Tarea t = new Tarea();
                        * t.setNombre(n);
                        * t.setEstado("En progreso");
                        * t.setFecha_tope(ft);
                        * t.setCriticidad(c);
                        * lista_tareas.add(t);
                        * */
                        lista_tareas.add(t1);

                        //Tirar un mensaje plural o singular dependiendo del tamaño de las tareas
                        if(lista_tareas.size()==1)
                        {
                            System.out.println("La lista tiene "+ lista_tareas.size() +" tarea actualmente.\n");
                        }
                        else
                        {
                            System.out.println("La lista tiene "+ lista_tareas.size() +" tareas actualmente.\n");
                        }
                    break;
                case 2:
                    //Si yo arranco mi tarea, no va a tener valor, ergo debo lanzar un mensaje
                    if(lista_tareas.size() == 0)
                    {
                        System.out.println("No hay tareas pendientes.\n");
                    }
                    else
                    {
                        //Hash Map para el objeto
                        //Por medio de un for each
                        for (Tarea a : lista_tareas)
                        {
                            //Debo acceder a atributos privados por los dos metodos posibles, en este caso, obtendre el nombre con el getter
                            System.out.println("[] Nombre: "+ a.getNombre() +" \nFecha Limite: "+ a.getFecha_tope() +" \nCriticidad:"+ a.getCriticidad()+"\n");
                        }
                    }
                    break;
                case 3:
                    //Vamos a recorrer el objeto a traves de un indice por que poseemos es un string
                    if(lista_tareas.size() == 0)
                    {
                        System.out.println("No hay tareas pendientes.");
                    }
                    else
                    {
                        int opc_borrar=0;
                        //Con un for tradicional
                        for(int i=0;i < lista_tareas.size(); i++)
                        {
                            //En el get(i) yo llamo el indice de la tarea y en el getNombre yo obtengo el nombre de la tarea
                            System.out.println(i+1 +". "+ lista_tareas.get(i).getNombre());
                        }

                        //Do While para la validación
                        do
                        {
                            System.out.print("Tarea a completar: ");
                            try
                            {
                                opc_borrar = Integer.parseInt(br.readLine());
                            }
                            catch(Exception e)
                            {
                                System.out.println("Tarea Inválida. Intente Nuevamente.\n");
                            }
                            //Evaluar el rango del valor
                            if(opc_borrar <= 0 || opc_borrar > lista_tareas.size())
                            {
                                System.out.println("Tarea no existente\n");
                            }
                        }while(opc_borrar <= 0 || opc_borrar > lista_tareas.size());

                        //Borrado de la tarea
                        lista_tareas.remove(opc_borrar-1);
                        //Validación si estan terminadas todas las tareas
                        if(lista_tareas.size()==0)
                        {
                            System.out.println("¡En horabuena! Has completado todas tus tareas.\n");
                        }

                    }
                    break;
                case 4:
                    System.out.println("Hasta el proximo viernes VIKERNES!");
                    break;
                //Esta opcion, ocurre por defecto, es decir, que si no cumple ninguno de los casos, lanza un error o realiza una acción.
                default:
                    System.out.println("Opcion fuera de rango.\n");
                    break;
            }
        }while(opcion != 4);
    }
}
