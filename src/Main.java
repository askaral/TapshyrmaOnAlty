import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Animal [] animals = {new Shark(), new Turtle(), new Eagle()};
        for (Animal animal:animals) {
            if (animal.getClass().equals(Shark.class)) {
                ((Shark) animal).attack();
            }
            if (animal.getClass().equals(Turtle.class)) {
                ((Turtle) animal).swim();
            }
            if (animal instanceof Eagle) {
                ((Eagle) animal).fly();
            }
        }
            Shark [] sharks = {new Shark("White shark",7,"Akula")};
            for (Shark shark:sharks) {
                    System.out.println(shark);
                }

            Turtle [] turtles = {new Turtle("Trionyx",10,"Tscherepaha")};
            for (Turtle turtle:turtles) {
                System.out.println(turtle);
            }
            Eagle [] eagles = {new Eagle("Bald",5,"Burkut")};
            for (Eagle eagle:eagles) {
                System.out.println(eagle);

        }
    }
}