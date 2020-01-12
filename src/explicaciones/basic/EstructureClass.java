package explicaciones.basic;
//clase simple
public class EstructureClass {
}

class Animal {
    String name; //variable

    /**
     *
     * @return
     */
    String getName() {
        return name;
    }

    /**
     * Declaracion de un metodo se llama method signature: ejemplo --> public int numberVisitors(int month)
     * @param newName
     */
    void setName(String newName) {
        this.name = newName;
    }
}