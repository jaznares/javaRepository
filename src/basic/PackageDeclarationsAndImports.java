package basic;


import org.jetbrains.annotations.Contract;

import java.nio.file.Files;
import java.nio.file.Paths;
/*
    Soluciones
        1)
            import java.nio..file.*
        2)
            import java.nio.file.Files;
            import java.nio.file.Paths;
    Errores
        import java.nio.*; NO GOOD - una wildcard solo puede traer clases no trae mas paquetes.
        import java.nio.*.*; NO GOOD - no se puede añadir mas de una wildcard y además esta siempre debe ir al final
        import java.nio.file.Paths.* No GOOD - you cannot import methods only class names.
 */
import java.util.*; //imports java.util.Random y el resto de otras cosas.


public class PackageDeclarationsAndImports {
    public static void main (String[] args) {
        Random r = new Random(); //Si no se importa la libreria no compilara
        System.out.println(r.nextInt(10)); //imprime un número entre el 0 y el 9
    }

    public void  PackageDeclarationsAndImports() {

    }
    public void read(Files file){
        Paths.get("name");
    }
}
