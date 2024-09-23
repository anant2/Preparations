package functional_programming.parttwo;

import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Course {
    private String name;
    private String category;
    private int reviewScore;
    private int noOfStudents;

    public Course(String name, String category, int reviewScore, int noOfStudents) {
        this.name = name;
        this.category = category;
        this.reviewScore = reviewScore;
        this.noOfStudents = noOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReviewScore() {
        return reviewScore;
    }

    public void setReviewScore(int reviewScore) {
        this.reviewScore = reviewScore;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", reviewScore=" + reviewScore +
                ", noOfStudents=" + noOfStudents +
                '}';
    }
}

public class CustomClassExample {

    public static void main(String[] args) {
        List<Course> courses = List.of(
                new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 95, 18000),
                new Course("API", "Microservices", 97, 22000),
                new Course("Microservices", "Microservices", 96, 25000),
                new Course("FullStack", "FullStack", 91, 14000),
                new Course("AWS", "Cloud", 92, 21000),
                new Course("Azure", "Cloud", 99, 21000),
                new Course("Docker", "Cloud", 92, 20000),
                new Course("Kubernetes", "Cloud", 91, 20000)
        );

        Predicate<Course> reviewScoreGreaterThan90Predicate = course -> course.getReviewScore() > 90;
        Predicate<Course> reviewScoreGreaterThan95Predicate = course -> course.getReviewScore() > 95;
        Predicate<Course> reviewScoreLessThan90Predicate = course -> course.getReviewScore() < 90;
//        System.out.println(courses.stream().allMatch(reviewScoreGreaterThan90Predicate));
//        System.out.println(courses.stream().allMatch(reviewScoreGreaterThan95Predicate));
//        System.out.println(courses.stream().noneMatch(reviewScoreLessThan90Predicate));
//        System.out.println(courses.stream().anyMatch(reviewScoreGreaterThan95Predicate));

        Comparator<Course> compareByStudentNumber = new Comparator<>() {
            @Override
            public int compare(Course o1, Course o2) {
                if(o1.getNoOfStudents() < o2.getNoOfStudents()) return -1;
                if (o1.getNoOfStudents() > o2.getNoOfStudents()) return 1;
                return 0;
            }
        };

        Comparator<Course> compareByStudentNumberIncreasingFunctional = Comparator.comparing(Course::getNoOfStudents).thenComparing(Course::getReviewScore);
        Comparator<Course> compareByStudentNumberDecreasingFunctional = Comparator.comparing(Course::getNoOfStudents).reversed();
        //courses.stream().sorted(compareByStudentNumberIncreasingFunctional).skip(5).limit(1).forEach(System.out::println);
        //courses.stream().takeWhile(course -> course.getReviewScore() >= 92).forEach(System.out::println);
        //courses.stream().dropWhile(course -> course.getReviewScore() >= 92).forEach(System.out::println);

        System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));

        System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory, Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));

        System.out.println(courses.stream().collect(Collectors.groupingBy(Course::getCategory,
                Collectors.mapping(Course::getName, Collectors.toList()))));

        System.out.println(IntStream.iterate(2, e -> e + 2).limit(10).sum());
    }

}
