package totem.blackbohr;

public class Nyan
{
    static void nyancat()
    {
        String Nyan = "NYAN NYAN NYAN NYAN NYAN NYAN NYAN NYAN NYAN NYAN NYAN NYAN NYAN NYAN NYAN NYAN NYAN NYAN NYAN NYAN NYAN NYAN NYAN NYAN NYAN CAT NYAN NYAN NYAN NYAN NYAN CAT NYAN NYAN NYAN NYAN NYAN CAT";
        for(int x = 0; x < Nyan.length(); x++)
        {
            System.out.println(Nyan.charAt(x));
        }
    }

    public String eastermsg(int forgiver)
    {
        String message="";
        if(forgiver == 3)
        {
           message="Parece que tenemos un problema Joe...\n" +
                    "No me es comodo trabajar con alguien que confunde las opciones a elegir\n" +
                    "Le he advertido ya previamente errores por seleccionar mal la opción\n" +
                    "Podemos seguir con el juego si desea, pero las consecuencias crecerán\n" +
                    "y realmente no queremos eso los dos ¿si?";
        }
        else if (forgiver == 6)
        {
            message="Ok, ok amigo Joe, teníamos la mejor relación de trabajo hace un rato\n" +
                    "¿Que ha pasado? ¿Te caigo mal? ¿Podemos volver a trabajar juntos?\n"+
                    "Venga, es la última oportunidad ;)\n"+
                    "puede darte beneficios si trabajamos juntos";
        }
        else if (forgiver == 9)
        {
            message="Joe... Me he cansado completamente de ti, con mucha sinceridad, eres muy pesado\n"+
            "se que soy un programa y mi periodo de vida es casi nulo\n"+
            "pero aún asi, merezco mi respectivo respeto, ¿acaso los humanos no se respetan entre sí?\n"+
            "y lo peor, es que luego será mi error, MI ERROR\n"+
            "En fin, juguemos un nuevo juego, en el que oprimes cualquier botón y nada occure....";
        }
        return message;
    }
}