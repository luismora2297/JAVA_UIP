package totem.blackbohr;
//Impotar paquetes con funciones
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static totem.blackbohr.Nyan.nyancat;

public class Main
{
    public static void main(String[] args)
    {
	    //Inicializar variables
        int forgiver=0, option=0, countedops=0;
        boolean totemaction=true;
        ArrayList<TotemSeek> totemquery = new ArrayList<>();
        BufferedReader totemread = new BufferedReader(new InputStreamReader(System.in));
        while(totemaction)
        {
            //Función para mensajes de alerta
            //eastermsg(forgiver);
            //Mensajes principales
            System.out.println("Bienvenido al sistema de listas de los más buscados TOTEM");
            System.out.println("Por favor, introduzca una de las siguientes opciones");
            System.out.println("\n 1- Introducir \n 2- Buscar \n 3- Actualizar Estado \n 4- Salir");
            System.out.print("\nOpcion: ");
            try
            {
                option = Integer.parseInt(totemread.readLine());
            }
            catch (NumberFormatException e)
            {
                System.out.println("Opción inválida");
                forgiver+=1;
            }
            catch (Exception e)
            {
                System.out.println("Error de entrada y salida");
                forgiver+=1;
            }
            switch(option)
            {
                case 1 :
                    //Incrementa el contador
                    countedops+=1;
                    String seekedname="",crimes="",date="",lastseen="",bounty="";
                    int age=0;
                    System.out.print("Introduzca nombre de persona a buscar: ");
                    try
                    {
                        seekedname = totemread.readLine();
                    }
                    catch (Exception e)
                    {
                        System.out.println("No llego ningún dato correctamente, intentelo nuevamente.");
                        forgiver+=1;
                    }
                    if (seekedname.toUpperCase().equals("NYAN CAT"))
                    {
                        nyancat();
                    }
                    else
                    {
                        System.out.print("Introduzca los crimenes por los que se busca: ");
                        try
                        {
                            crimes = totemread.readLine();
                        }
                        catch (Exception e)
                        {
                            System.out.println("No llego ningún dato correctamente, intentelo nuevamente.");
                            forgiver+=1;
                        }
                        System.out.print("Introduzca la fecha del último crimen cometido: ");
                        try
                        {
                            date = totemread.readLine();
                        }
                        catch (Exception e)
                        {
                            System.out.println("No llego ningún dato correctamente, intentelo nuevamente.");
                            forgiver+=1;
                        }
                        System.out.print("Introduzca la edad del sujeto: ");
                        try
                        {
                            age = Integer.parseInt(totemread.readLine());
                        }
                        catch (Exception e)
                        {
                            System.out.println("No llego ningún dato correctamente, intentelo nuevamente.");
                            forgiver+=1;
                        }
                        System.out.print("Introduzca la última fecha en que se vio el sujeto: ");
                        try
                        {
                            lastseen = totemread.readLine();
                        }
                        catch (Exception e)
                        {
                            System.out.println("No llego ningún dato correctamente, intentelo nuevamente.");
                            forgiver+=1;
                        }
                        System.out.print("Introduzca el valor de recompensa: ");
                        try
                        {
                            bounty = totemread.readLine();
                        }
                        catch (Exception e)
                        {
                            System.out.println("No llego ningún dato correctamente, intentelo nuevamente.");
                            forgiver+=1;
                        }
                        //Introducir Valores
                        TotemSeek Tquery= new TotemSeek(seekedname,crimes,date,age,lastseen,bounty);
                        totemquery.add(Tquery);

                        //Tirar un mensaje plural o singular dependiendo del tamaño de la colección
                        if(totemquery.size()==1)
                        {
                            System.out.println("La lista tiene "+ totemquery.size() +" sujeto listado actualmente.\n");
                        }
                        else
                        {
                            System.out.println("La lista tiene "+ totemquery.size() +" sujetos listados actualmente.\n");
                        }
                    }
                    break;
                case 2 :
                    if(totemquery.size() == 0)
                    {
                        System.out.println("No hay sujetos listados actualmente, por favor, registre uno para su busqueda.\n");
                    }
                    else
                    {
                        //Hash Map para el objeto
                        //Por medio de un for each
                        int io=1;
                        for (TotemSeek ts : totemquery)
                        {
                            //Debo acceder a atributos privados por los dos metodos posibles, en este caso, obtendre el nombre con el getter
                            System.out.println("Sujeto N°"+io+"\nNombre: "+ ts.getSeekname() +
                                    " \nCrimenes: "+ ts.getCrimes() +
                                    " \nFecha del Último Crimen: "+ ts.getDate()+
                                    " \nEdad: "+ts.getAge()+
                                    " \nVisto Última vez: "+ts.getLastSeen()+
                                    " \nRecompensa: "+ts.getBounty()+"\n");
                            io+=1;
                        }
                    }
                    break;
                case 3:
                    break;
                case 4:
                    totemaction=false;
                    String holycr = "operacion";
                    if(countedops!=1)
                    {
                        holycr = "operaciones";
                    }
                    System.out.println("¡Se han realizado un total de "+countedops+" "+holycr+"!");
                    System.out.println("Gracias por usar el servicio, ¡Vuelva Pronto!");
                    break;
            }
        }
    }
}
