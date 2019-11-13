package basic;

import java.util.*;
import java.sql.Date;

/*

SOLUTION:
        public class NamingConflicts {
            java.util.Date date;
            //some more code
        }

 No hace falta importar las clases si se utilizan una vez se puede indicar el paquete entero en la declaración.

Errores:
    1)
        import java.util.* NO-GOOD - Does not compile el error seria "The type Date is ambiguos
        import java.sql.*
    2)
        import java.util.Date
        import java.sql.Date
 */
public class NamingConflicts {
    java.util.Date date;
    Date date2;
}
