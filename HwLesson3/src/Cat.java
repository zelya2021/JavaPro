public class Cat extends Animal{
    private static int catCount = 0;
    private final int MAX_RUN_LENGTH = 200;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public String run(int length) {
        if(length > MAX_RUN_LENGTH)
            return "The maximum run length for cats is " + MAX_RUN_LENGTH + " meters";
        else
            return name + " runs " + length + " meters";
    }

    public static int getCatCount() {
        return catCount;
    }
}
