package Observer;

public class Main {

    public static void main(String[] args) {
        //Observer
        A a = new A();
        B b = new B();

        Amount amount = new Amount();

        amount.addObserver(a);
        amount.addObserver(b);

        for (int i=0; i<10; i++) {
            amount.amountPlus();
            amount.notifyObservers();
        }
    }
}