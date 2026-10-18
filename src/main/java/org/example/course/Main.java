package org.example.course;

import org.example.course.POO.Cookie;

public class Main {
    public static void main(String[] args) {
            //* Estoy definiendo Argumentos*/
            //* Para crear nuestros objetos primero necesitamos usar la palabra new seguido del nombre de la clase */
            //* También estamos creando una INSTANCIA es decir chocoreto es una INSTANCIA de Cookie */
            Cookie chocoreto = new Cookie("Round", "Chocolate", 20);
            
            //* Acceder a una propiedad de un Objeto traves de un punto (.) se le conoce como dot notation*/
            
            //  System.out.println("Primera cookie, shape" + chocoreto.shape);

            //* Para hacer los mismo pero si esta en private se puede usar los getters */
            System.out.println("Primera cookie, shape: " + chocoreto.getShape());

            // System.out.println("\n");
            // chocoreto.showDetails();
            // chocoreto.changeFlavor("White Chocolate");
            // System.out.println("\n");
            // chocoreto.showDetails();


    }
}
