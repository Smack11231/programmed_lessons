public class Person {
    private String firstName = "null", lastName = "null";

    public Person() {
        firstName = "null";
        lastName = "null";
    }

    public Person(String first, String last) {
        firstName = first;
        lastName = last;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setName(String first, String last) {
        firstName = first;
        lastName = last;
    }
    public void printLastFirst() {
        System.out.println(lastName + ", " + firstName);
    }
    public void print() {
        System.out.println(firstName + " " + lastName);
    }

    public String toString() {
        return firstName + " " + lastName + " ";
    }
    public boolean equals(Object obj){ 
        if(obj instanceof Person) {
            Person pers = (Person) obj;
            return pers.getFirstName().equals(this.firstName) && pers.getLastName().equals(this.lastName);
        } 
        return false;
    }
    public void copy(Person pers) {
        this.firstName = pers.getFirstName();
        this.lastName = pers.getLastName();
    }
    public Person getCopy() {
        return new Person( firstName, lastName);
    }

}