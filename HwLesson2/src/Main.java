public class Main {
    public static void main(String[] args) {
        Employee employee =
                new Employee("Alex", "Koba", "Petrov", "developer", "alex@gmail.com", "1575347865", (byte)25);
        System.out.println(employee.toString());

        sameName1.SameName sameName1 = new sameName1.SameName();
        sameName1.display();
        sameName2.SameName sameName2 = new sameName2.SameName();
        sameName2.display();

        Car car = new Car();
        System.out.println(car.start());
    }
}