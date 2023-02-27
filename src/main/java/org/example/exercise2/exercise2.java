package org.example.exercise2;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class exercise2 {
    public static void main(String[] args) {
        //Stream<Human> stream = Stream.of(); THE SAME
        List<Human> humans = new ArrayList<>();
        humans.add(new Human(12, "Adam", "Green", LocalDate.of(2133, 12, 9), 123));
        humans.add(new Human(34, "Ivan", "Blue", LocalDate.of(1912, 12, 7), 45));
        humans.add(new Human(23, "Sasha", "Grey", LocalDate.of(1780, 11, 3), 59));
        humans.add(new Human(32, "Jack", "Black", LocalDate.of(1935, 3, 1), 67));
        humans.add(new Human(54, "Eve", "White", LocalDate.of(1747, 5, 23), 23));
        humans.add(new Human(74, "Anna", "Robins", LocalDate.of(1956, 1, 31), 45));
        humans = humans.stream().limit(5).toList();
        System.out.println(humans);
        humans = humans.stream().sorted(((o1, o2) -> o1.getBirthDate().compareTo(o2.getBirthDate()))).toList();
        humans.forEach(o -> System.out.print(o.getBirthDate() + " "));
        humans = humans.stream().filter(o -> o.getWeight() < 60).toList();
        System.out.println();
        humans.forEach(o -> System.out.print(o.getWeight() + " "));
        System.out.println();
        humans.forEach(o -> System.out.print(o.getFirstName() + " " + o.getLastName() + " "));

        System.out.println();
    }
}















