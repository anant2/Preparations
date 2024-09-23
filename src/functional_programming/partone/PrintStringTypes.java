package functional_programming.partone;

import java.util.List;

public class PrintStringTypes {

    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Java", "Python" ,"Apache Camel", "Spring Boot", "Spring Cloud", "PCF", "AWS");
        printAllCourses(courses);
        System.out.println("-------------");
        printAllCoursesFiltered(courses); //which has the characters spring
        System.out.println("-------------");
        printAllCoursesWithLength(courses); //print courses which has length of atleast 4
        System.out.println("-------------");
        printNumberOfCharacters(courses); //print the numbers of characters
    }

    private static void printNumberOfCharacters(List<String> courses) {
        courses.stream()
                .map(course -> course.trim().length()+ " ")
                .forEach(System.out::print);
    }

    private static void printAllCoursesWithLength(List<String> courses) {
        courses.stream()
                .filter(course -> course.length() <= 4)
                .forEach(System.out::println);
    }

    private static void printAllCoursesFiltered(List<String> courses) {
        courses.stream()
                .filter(course -> course.toLowerCase().contains("spring"))
                .forEach(System.out::println);
    }

    private static void printAllCourses(List<String> courses) {
        courses.stream().forEach(System.out::println);
    }

}
