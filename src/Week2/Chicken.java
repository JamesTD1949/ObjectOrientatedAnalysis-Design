package Week2;

public class Chicken extends Bird{
    public Chicken(int age, char gender, int weight) {
        super(age, gender, weight);
    }

    public void Fly()
    {
        System.out.println("I am unable to fly because I am a chicken");
    }
}
