package java8.functionaIInterfaces;

import java8.studentInfo.Student;
import java8.studentInfo.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

   static Consumer<Student> getNames = student -> System.out.print(student.getName());
   static Consumer<Student> getActivities = student -> System.out.println(student.getActivities());

    static List<Student> studentList =  StudentDataBase.getAllStudents();

    static void printStudents(){
        Consumer<Student> consumer = student -> System.out.println(student);
       studentList.forEach(consumer);
    }

    static void printNamesAndActivities() {
        studentList.forEach(getNames.andThen(getActivities));
    }

    static void printNamesAndActivitiesWithCondition() {
        studentList.forEach(student -> {
            if(student.getGradeLevel() > 3){
                getNames.andThen(getActivities).accept(student);
            }
        });
    }

    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
        Consumer<String> consumer2 = s -> System.out.println(s.length());
        //consumer.andThen(consumer2).accept("Anant");
        //printStudents();
        //printNamesAndActivities();
        printNamesAndActivitiesWithCondition();
    }

}
