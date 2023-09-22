import code.Ejercicio1;

import java.util.Scanner;

//Autor : Ana Tormo
//Programa Java:  Se inicializan cuatro objetos de tipo File:
//dos que sean ficheros, que uno exista y otro no, y dos que sean directorios, que uno exista y el otro no.
//El programa debe averiguar si existen dichos elementos y si es un fichero o directorio y sus nombres.

public class Main {
    public static void main(String[] args) {

        System.out.println("* ESCOGE UNA DE ESTAS OPCIONES: " + "\n" +
                "-".repeat(40) );
        System.out.println("1. Ejercicio 1 de ficheros");
        System.out.println("2. Ejercicio 1 de ficheros con NIO" );
        System.out.println("0. Salir del programa"+ "\n" );


            int opcion = libs.Validaciones.enteros();

            switch (opcion){
                case 0 ->{
                    System.exit(0);
                }
                case 1 -> {
                    code.Ejercicio1.checkFiles();
                }
                case 2 ->{
                    code.Ejercicio1_NIO.checkFilesNIO();
                }
            }
        }
    }
