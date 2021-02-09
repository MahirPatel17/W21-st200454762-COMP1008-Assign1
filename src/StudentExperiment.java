import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentExperiment {
    public static void main(String[] args) {

        ArrayList<String> studentInterests = new ArrayList<>();
        studentInterests.addAll(Arrays.asList("hiking","reading"));


        //Datatype  variable name    calling the constructor and passing in System.in
        Student obj = new Student("mahir", "patel", 200454762, studentInterests);

        obj.setFirstName("mahir"); //valid input
        obj.setLastName("patel"); //valid input
        obj.setStudentNumber(200454762);//valid input
        obj.setInterests(studentInterests);//valid input

        System.out.println("FirstName : " + obj.getFirstName());
        System.out.println(("LastName : " + obj.getLastName()));
        System.out.println("Student Number : " + obj.getStudentNumber());
        System.out.println("Student Interests : " + obj.getInterests());

    }
}
