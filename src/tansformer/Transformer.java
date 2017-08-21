package tansformer;

/**
 * Created by samuel.shao on 4/3/2017.
 */
public class Transformer {

    public void check(Parent parent) {
        if (parent instanceof Child) {
            checkItem((Child) parent);
        }
    }

    private void checkItem(Friend friend) {
        System.out.println("Hitting friend");
    }

    private void checkItem(Child child) {
        System.out.println("Hitting child");
    }
}
