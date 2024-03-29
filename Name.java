
/**
 * Write a description of class Name here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Name
{
   private String firstName, middleName, lastName, fullName, otherName;

    public Name(String first, String middle, String last)
    {
        firstName = first;
        middleName = middle;
        lastName = last;
        String fullName = firstName + ' ' + middleName + ' ' + lastName;
    }
    
    public String getFullName()
    {
        return fullName; 
    }
    
    public String getFirst()
    {
        return firstName;
    }

    public String getMiddle()
    {
        return middleName;
    }

    public String getLast()
    {
        return lastName;
    }

    public String firstMiddleLast()
    {
        return firstName + ' ' + middleName + ' ' + lastName;
    }

    public String lastFirstMiddle()
    {
        return lastName + ", " + firstName + ' ' + middleName;
    }

    public boolean equals(Name otherName)
    {
        return fullName.equalsIgnoreCase(otherName.getFullName());
    }

    public String initials()
    {
        return firstName.toUpperCase().substring(0,1)
               + middleName.toUpperCase().substring(0,1)
               + lastName.toUpperCase().substring(0,1);
    }

    public int length()
    {
        return firstName.length() + middleName.length() + lastName.length();
    }
}
