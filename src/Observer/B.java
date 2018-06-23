package Observer;

import java.util.Observable;
import java.util.Observer;

public class B implements Observer {

    @Override
    public void update(Observable obs, Object arg) {
        int amount = ((Amount) obs).getAmount();
        System.out.println("Class B amount = " + amount);

    }
}
