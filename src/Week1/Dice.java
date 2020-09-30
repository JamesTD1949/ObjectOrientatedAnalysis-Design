package Week1;

public class Dice {
    private int faceValue;

    Dice()
    {
        faceValue = 1;
    }

    public int getFaceValue()
    {
        return faceValue;
    }

    public void roll()
    {
        faceValue = (int) (Math.random() * (6 - 1)) + 1;
    }
}
