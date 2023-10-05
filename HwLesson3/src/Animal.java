abstract class Animal {
    protected static int animalCount = 0;
    protected String name;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public String getName() {
        return name;
    }

    public abstract String run(int length);

    public static int getAnimalCount() {
        return animalCount;
    }
}
