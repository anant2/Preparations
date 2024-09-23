package java8.functionaIInterfaces;

import java8.studentInfo.Student;
import java8.studentInfo.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    static BiConsumer<String, String> biConsumer = (a,b) -> System.out.println("a : "+a+" b : "+b);
    static BiConsumer<Integer, Integer> addition = (a,b) -> System.out.println("addition is : "+ (a +  b));
    static BiConsumer<Integer, Integer> substraction = (a,b) -> System.out.println("susbtraction is  : "+ (a-b));
    static BiConsumer<Integer, Integer> multiplication = (a,b) -> System.out.println("multlipication is : "+(a*b));
    static BiConsumer<Integer, Integer> division = (a,b) -> System.out.println("division is : "+a/b);

    static List<Student> studentList =  StudentDataBase.getAllStudents();

    static BiConsumer<String, List<String>> students = (student, activities) -> System.out.println(student+" : "+activities);

    public static void main(String[] args) {
        //biConsumer.accept("Anant","Majhi");
        //addition.andThen(substraction).andThen(multiplication).andThen(division).accept(20 , 10);
        studentList.forEach(student -> students.accept(student.getName(),student.getActivities()));
    }

}
