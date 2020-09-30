package Week2;

public class Animal {
    int age;
    char gender;
    int weight;

    public Animal(int age,char gender,int weight)
    {
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public void Eat()
    {
        System.out.println("The animal is eating");
    }

    public void Sleep()
    {
        System.out.println("The animal is sleeping");
    }
}
