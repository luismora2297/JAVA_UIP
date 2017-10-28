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

    //Constructor, es un metodo que tendra el mismo nombre de la clase, con esto se inicializa los valores que tienen los atributos, siempre es público, no lleva void,int,etc porque es un constructor
    /*
    * Para usar con Setters
    * public Tarea ()
    * {
    *   super();
    * }
    * */

    public Tarea(String nombre, String fecha_tope, String criticidad)
    {
        this.nombre = nombre;
        this.fecha_tope = fecha_tope;
        this.estado = "EnProgreso";
        this.criticidad = criticidad;
    }

    public void completar()
    {
        this.estado = "Completado";
    }

    //Getter de Nombre
    public String getNombre()
    {
        return nombre;
    }

    //Setter de Nombre
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    //Getter de Fecha Tope
    public String getFecha_tope()
    {
        return fecha_tope;
    }

    //Setter de Fecha Tope
    public void setFecha_tope(String fecha_tope)
    {
        this.fecha_tope = fecha_tope;
    }

    //Getter de Criticidad
    public String getCriticidad()
    {
        return criticidad;
    }

    //Setter de Criticidad
    public void setCriticidad(String criticidad)
    {
        this.criticidad = criticidad;
    }

    //Getter de Estado
    public String getEstado()
    {
        return estado;
    }

    //Setter de Estado
    public void setEstado(String estado)
    {
        this.estado = estado;
    }
}
