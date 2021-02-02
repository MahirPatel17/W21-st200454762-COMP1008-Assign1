import java.util.Arrays;
import java.util.List;

public class Student {
    //instance variables
    private String firstName;
    private String lastName;
    private int studentNumber;
    private String name;

    //constructor
    /**
     * This constructor takes 3 arguments, one for the first name, one for
     * the last name and last for the student number.
     * The constructor must be the same name as the class (including the upper case first letter)
     * The constructor does NOT have a return type
     */
    public Student(String firstName, String lastName, int studentNumber)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
    }

    //setters and getters

    /**
     * This method will validate that the argument is in the collection of
     * "mahir","nikhil","jay","ian" and set the instance variable
     * @param firstName - this is a String to represent the first name of the student
     */
    public void setFirstName(String firstName)
    {
        firstName = firstName.toLowerCase();
        List<String> firstNames = Arrays.asList("mahir","nikhil","jay","ian");

        if (firstNames.contains(firstName))  // this performs a case sensitive comparison
        {
            this.firstName = firstName;
        }
        else
        {
            throw new IllegalArgumentException(firstName + " is not valid.  Use one of " + firstNames);
        }
    }
    public String getFirstName()
    {
        return firstName;
    }

    /**
     * This method will validate that the argument is in the collection of
     * "patel","shah","dave","khan" and set the instance variable
     * @param lastName - this is a String to represent the last name of the student
     */
    public void setLastName(String lastName)
    {
        lastName = lastName.toLowerCase();
        List<String> lastNames = Arrays.asList("patel","shah","dave","khan");

        if (lastNames.contains(lastName))  // this performs a case sensitive comparison
        {
            this.lastName = lastName;
        }
        else
        {
            throw new IllegalArgumentException(lastName + " is not valid.  Use one of " + lastNames);
        }
    }
    public String getLastName()
    {
        return lastName;
    }

    /**
     * This methods will set student number and return it
     * @param studentNumber
     */
    public void setStudentNumber(int studentNumber)
    {
        this.studentNumber = studentNumber;
    }
    public int getStudentNumber()
    {
        return studentNumber;
    }
}
