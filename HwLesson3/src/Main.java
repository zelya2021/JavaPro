public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Joy");
        Dog dog = new Dog("Tusk");
        Cat anotherCat = new Cat("Mur");

        System.out.println(cat.run(127));

        System.out.println(dog.run(509));
        System.out.println(dog.swim(5));

        System.out.println("Total animals created: " + Animal.getAnimalCount());
        System.out.println("Total cats created: " + Cat.getCatCount());
        System.out.println("Total dogs created: " + Dog.getDogCount());
    }
}