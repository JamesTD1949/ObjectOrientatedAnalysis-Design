package Week2;

public class Sparrow extends Bird implements Flyable {
    public Sparrow(int age, char gender, int weight) {
        super(age, gender, weight);
    }

    public void Fly() {
        System.out.println("The Sparrow is flying.");
    }
}
