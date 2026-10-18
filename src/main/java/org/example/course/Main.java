package org.example.course;

import org.example.course.POO.Cookie;

public class Main {
    public static void main(String[] args) {
            //* Estoy definiendo Argumentos*/
            Cookie chocoreto =new Cookie("Round", "Chocolate", 20);
            System.out.println("\n");
            chocoreto.showDetails();
            chocoreto.changeFlavor("White Chocolate");
            System.out.println("\n");
            chocoreto.showDetails();
    }
}
