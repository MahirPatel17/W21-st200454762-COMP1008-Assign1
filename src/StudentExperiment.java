public class StudentExperiment {
    public static void main(String[] args) {
        //Datatype  variable name    calling the constructor and passing in System.in
        Student     obj            = new Student("mahir","patel",200454762);

        obj.setFirstName("mahir"); //valid input
        obj.setLastName("patel"); //valid input

        System.out.println("FirstName : "+obj.getFirstName());
        System.out.println(("LastName : "+obj.getLastName()));
        System.out.println("Student Number : "+obj.getStudentNumber());
    }
}
