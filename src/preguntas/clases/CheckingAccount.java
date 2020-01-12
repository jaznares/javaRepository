package preguntas.clases;

public class CheckingAccount {
    public int amount;

    public CheckingAccount(int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }
    public void changeAmount(int x) {
        amount +=x;
    }
}

class OtherClass {
    /* insert hreelines independenly at line n1, cause the program to print a  0 balance ? (choose three
        this.amount = 0;
        amount = 0;
        acct(0)
        acct.amount = 0;
        acct.getAmount() = 0
        acct.changeAmount(0)
        acct.changeAmount(-acct.amount)
        acct.changeAmount(-acct.getAmount0);
    */
    public static void main(String[] args) {
        CheckingAccount acct = new CheckingAccount((int) (Math.random()*1000));
        System.out.println("antes = "+ acct.getAmount());
        System.out.println("despues = "+ acct.getAmount());
    }
}
