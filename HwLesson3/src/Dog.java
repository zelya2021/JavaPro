public class Dog extends Animal{
    private static int dogCount = 0;
    private final int MAX_RUN_LENGTH = 500;
    private final int MAX_SWIM_LENGTH = 10;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public String run(int length) {
        if(length > MAX_RUN_LENGTH)
            return "The maximum run length for dogs is " + MAX_RUN_LENGTH + " meters";
        else
            return name + " runs " + length + " meters";
    }

    public String swim(int length) {
        if(length > MAX_SWIM_LENGTH)
            return "The maximum swim length for dogs is " + MAX_SWIM_LENGTH + " meters";
        else
            return name + " swims " + length + " meters";
    }

    public static int getDogCount() {
        return dogCount;
    }
}
