package code;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ejercicio1 {

    public static void checkFiles (){
        File fichero1 = new File("src/resources/fichero1.txt");
        File fichero2 = new File("src/resources/fichero2.txt");
        File directorio1 = new File("src/resources/directorio1");
        File directorio2 = new File("src/resources/directorio2");
        System.out.println(fichero1.getName());
        System.out.println(fichero2.getName());

        checkIfExist(fichero1);
        checkIfExist(fichero2);
        checkIfExist(directorio1);
        checkIfExist(directorio2);
    }

    public static void checkIfExist (File f){
        if (f.exists()){
            System.out.print(f.getName() + " existe");
            if (f.isDirectory()){
                System.out.println(" y es un directorio");
            } else {
                System.out.println(" y es un archivo");
            }
        } else {
            System.out.println(f.getName() + " no existe");
        }
    }
}
