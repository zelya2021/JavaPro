import Part1.Circle;
import Part1.GeometricFigure;
import Part1.Square;
import Part1.Triangle;
import Part2.*;

public class Main {
    public static double totalArea(GeometricFigure[] figures) {
        double total = 0;
        for (GeometricFigure figure : figures) {
            total += figure.area();
        }
        return total;
    }
    public static void main(String[] args) {
        //Part 1
        GeometricFigure[] figures = {
                new Circle(5),
                new Triangle(10, 5),
                new Square(4)
        };

        System.out.println("Total area of all figures: " + totalArea(figures));

        //Part 2
        Participant[] participants = {
                new Human("Kate", 1000, 3),
                new Human("Alex", 800, 5),
                new Human("Artem", 500, 4)
        };

        Obstacle[] obstacles = {
                new Treadmill(800),
                new Treadmill(1000),
                new Wall(1),
                new Wall(4)
        };

        for (Participant participant : participants) {
            for (Obstacle obstacle : obstacles) {
                obstacle.overcome(participant);
                if (!participant.isParticipating()) {
                    break;
                }
            }
        }
    }
}