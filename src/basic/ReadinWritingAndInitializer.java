package basic;

class ReadingWritingAndInitializer {
    { System.out.println("inicializacion");}
    int numberEggs = 100;
    public ReadingWritingAndInitializer()
    {
        System.out.println(otraCosa);
    }
    {
        System.out.println("no compila");
        //System.out.println(otraCosa);
    }

    int otraCosa = -1;
    public static void main(String[] args) {
        ReadingWritingAndInitializer var = new ReadingWritingAndInitializer();
        var.numberEggs = 1;
        System.out.println("Main method " + var.numberEggs);
    }
    {
        System.out.println(numberEggs);
    }
}
