package pr03_mankind;

public class Human {
    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public void setFirstName(String firstName) {
        if (firstName.toUpperCase().charAt(0) != firstName.charAt(0)){
            throw new IllegalArgumentException("Expected upper case letter!Argument: firstName");
        }
        if (firstName.length()<4){
            throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName.toUpperCase().charAt(0) != lastName.charAt(0)){
            throw new IllegalArgumentException("Expected upper case letter!Argument: lastName");
        }
        if (lastName.length()<3){
            throw new IllegalArgumentException("Expected length at least 3 symbols!Argument: lastName");
        }
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("First Name: ").append(this.firstName).append("\r\n");
        sb.append("Last Name: ").append(this.lastName).append("\r\n");
        return sb.toString();
    }
}
