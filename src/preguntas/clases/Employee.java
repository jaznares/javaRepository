package preguntas.clases;

public class Employee {
    String name;
    boolean contract;
    double salary;

    Employee() {
        this("j", true, 100);
    }
    Employee(String nom, boolean bo, int salal) {

    }

    public String toString() {
        return name + ":" + contract + ":" + salary;
    }
    /*
        Which two modification, when made independently, enable the code to print "joe:true:100.0" ?

            e.name = "Joe";
            e.contract = true;
            e.salary = 100;

            this.name = "Joe"
            this.contract = true;
            this.salary = 100;
     */
    public static void main(String[] args) {
        Employee e = new Employee();

        e.contract = true;
        System.out.println(e);
    }
}
