package org.example.course.POO;
    /* 
     * Objetos:
     * Pueden tener muchas propiedades tales como :
     * Color
     * Marca
     * Número de puertas
     * Cilindrada
     *  
     */

    /*
    * Método:
    * Después tenemos las acciones que va a realizar nuestro objeto
    * Acelerar
    * Frenar
    * Cambiar de marcha
    * Accionar intermitente
    *  
    */

    /*
    * Clases:
    * Una clase es como un molde para nuestros objetos
    * Necesitamos:
    * 1. Constructor: Es el responsable de crear nuestros objetos.
    *                 Tenemos que darle cierta information sobre nuestros objetos
    *  Ejemplo:
    *  1. Color.
    *  2. Modelo
    *  3. Cilindrada
    *  
    *  También se pueden agregarse ciertas acciones que podemos llamar:
    *  Ejemplo:
    *  1. Acelerar
    *  2. Frenar.
    *  3. Reversa.
    *   
    *   
    *       
    * 
    * 
    * 
    * 
    *  */

public class Cookie {
    //* Variables de nuestras propiedades
    //* Una forma para que nuestras variables no se usen en otras clases 
    // * solo en cookie es usando private
    private  String shape;
    private  String flavor;
    private  int weight;
    private String company;
    /* 
     * Añadimos nuestro constructor, debe ser publico debe tener acceso a el en todo momento
     * para que yo poder hacer todo lo que quiero en esa cookie.
     */

    //* Estoy definiendo parameters */
    public Cookie(String shape, String flavor, int weight){
        /* 
        * Para mandar a llamar lo que esta en el constructor se utiliza this para hacer referencia 
        * a lo que voy a agregar */
       this.shape = shape;
       this.flavor = flavor;
       this.weight = weight;
       this.company = "Marshall-Cookies";
    }

    //* Método para ver los detalles de la cookie */
    //* void: Es un método que no va devolver nada
    public void showDetails(){
        System.out.println("shape = " + shape);
        System.out.println("flavor = " + flavor);
        System.out.println("weight = " + weight );
        System.out.println("company = " + company);
    }

    public void changeFlavor(String newFlavor){
        this.flavor = newFlavor;
    }
}
