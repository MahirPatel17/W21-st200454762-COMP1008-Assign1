import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    //instance variables
    private String firstName;
    private String lastName;
    private int studentNumber;
    private ArrayList<String> interests;

    //constructor
    /**
     * This constructor takes 3 arguments, one for the first name, one for
     * the last name and last for the student number.
     * The constructor must be the same name as the class (including the upper case first letter)
     * The constructor does NOT have a return type
     */
    public Student(String firstName, String lastName, int studentNumber, ArrayList<String> intrests)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
        this.interests = intrests;
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
     * @param studentNumber - this is an Int to represent the studentNumber of the student
     */
    public void setStudentNumber(int studentNumber)
    {
        if(studentNumber >= 100000000 && studentNumber <= 999999999)
        {
            this.studentNumber = studentNumber;
        }
        else
        {
            throw new IllegalArgumentException(studentNumber+ "out of range");
        }
    }
    public int getStudentNumber()
    {
        return studentNumber;
    }

    public ArrayList<String> getInterests() {
        return interests;
    }

    public static ArrayList<String> getAllInterests()
    {
        ArrayList<String> interests = new ArrayList<>();
        interests.add("hiking");
        interests.add("skiing");
        interests.add("reading");
        interests.add("coding");
        interests.add("gaming");
        return interests;
    }

    /**
     * This method will validate that the argument is in the collection of
     * "hiking","skiing","reading","coding","gaming" and set the instance variable
     * @param interests - this is a ArrayList to represent the interests of the student
     */
    public void setInterests(ArrayList<String> interests) {
        ArrayList<String> validInterests = getAllInterests();
        for(String interest : interests)
        {
            if(validInterests.contains(interest))
            {
                this.interests = interests;
            }
            else
            {
                throw new IllegalArgumentException(interest + " is not valid. Valid options are : "+validInterests);
            }
        }
    }
}
