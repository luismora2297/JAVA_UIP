package io.beta.gamma;

//Es público por que se permite consultar a la clase
public class Tarea
{
    //Estas variables son privadas, por que necesitamos del objeto para conocerla, nos da la información personalmente, no es abierta públicamente para que en otras partes del código se utilicen.
    private String nombre;
    private String fecha_tope;
    private String estado;
    private String criticidad;

    //Métodos, son públicos, deben retornar un valor, si un método no retorna nada, debe definirse como VOID, que seria el modificador, en este caso no queremos que se retorne nada
    //Dentro de () iran los argumentos que se utilizarán en el método, como no devuelve nada, entonces puede dejarse vacio
    public void completar()
    {

    }
}
