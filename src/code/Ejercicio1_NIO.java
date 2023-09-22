package code;

import java.nio.file.Files;
import java.nio.file.Path;

public class Ejercicio1_NIO {

    public static void checkFilesNIO (){
        Path pFich1 = Path.of("src/resources/fichero1.txt");
        Path pFich2 = Path.of("src/resources/ficher2.txt");
        Path pDir1 = Path.of("src/resources/directorio1");
        Path pDir2 = Path.of("src/resources/directorio2");

        checkIfExist(pFich1);
        checkIfExist(pFich2);
        checkIfExist(pDir1);
        checkIfExist(pDir2);
    }

    public static void checkIfExist (Path p){
        if (Files.exists(p)){
            System.out.print(p.getFileName() + " existe");
            if (Files.isDirectory(p)){
                System.out.println(" y es un directorio");
            } else {
                System.out.println(" y es un archivo");
            }
        } else {
            System.out.println(p.getFileName() + " no existe");
        }
    }
}
