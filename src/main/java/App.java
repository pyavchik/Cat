import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<>();
        Cat tomCat = new Cat("Tom", "gray", 3.5, 2, false);
        Cat matroskinCat = new Cat("Matroskin", "black and white", 4.2, 5, true);
        Cat barsikCat = new Cat("Barsic", "white", 3.2, 1, true);

        cats.add(tomCat);
        cats.add(matroskinCat);
        cats.add(barsikCat);

        for (Cat cat : cats) {
            cat.eat();
            cat.sleep();
        }
    }
}
