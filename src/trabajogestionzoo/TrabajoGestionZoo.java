package trabajogestionzoo;

import java.util.Scanner;

/**
 *
 * @author ManuelRamón
 */

public class TrabajoGestionZoo {//clase main

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------BIENVENIDOS AL ZOO------");
        System.out.println(" ");
        System.out.println("---Introduzca tu nombre---");
        String usuario = sc.next();
        System.out.println(" ");
        System.out.println("Bienvenido al Gestor de ZOO: " + usuario);
        System.out.println("---------------------------------------");

        GestionZoo gz = new GestionZoo(usuario);
        gz.MenuPrincipal();
    }

}//Fin class TrabajoGestionZoo

