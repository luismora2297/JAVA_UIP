package totem.blackbohr;

//Para una clase abstracta
// Al decir que es abstracta, yo hago que mi clase pueda ser argumentada por otras clases
// Una clase abstracta no me trae ningun objeto, es decir
// al no tener argumentos para producir un objeto, no traera nada, sera algo que no
// puede instanciarse, sin embargo, puede tener dentro de el variables declaradas
// que simplemente se cambiarán
// Ejemplo
abstract class Figura
{
    // Variables declaradas en mi clase
    double diml;
    double dim2;

    // Un metódo declarado, el mismo solo poseerá las variables declaradas dentro de la clase Figura
    Figura (double a, double b)
    {
        diml = a;
        dim2 = b;
    }

    // area es un método abstracto
    abstract double area();
}

// Ahora llamo una clase Rectangulo que ya le aplique propiedades a mi clase abstracta, es decir
// Ya solo tendria que utilizar mi clase figura cuando lo declare en el código y llame al metodo Rectangulo
class Rectangulo extends Figura
{
    Rectangulo (double a, double b)
    {
        super (a, b);
    }
    // se sobrescribe área para un rectángulo
    double area()
    {
        System.out.println ("Dentro del método área par un objeto rectángulo.");
        return diml * dim2;
    }
}

class Main
{
    public static void main (String args[])
    {
        //Llamo a mi metodo rectangulo
        Rectangulo r = new Rectangulo (9, 5);
        Figura figref; //esto es correcto, no se crea ningún objeto
        //Le asigno el valor de rectangulo
        figref = r;
        //Imprimo mi rectangulo
        System.out.println ("El área es " + figref.area());
    }
}
