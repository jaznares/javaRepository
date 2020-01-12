package preguntas.operadores;

public class Operadores {

    public static void main(String[] args) {
        int x = 100;
        int a = x++;
        int b = ++x;
        int c = x++;
        int d = (a < b) ? (a < c) ? a: (b < c) ? b : -1 : c;
        System.out.println(x  + " - " + a +" - " + b + " - " + c);
        System.out.println(d);
    }
}
