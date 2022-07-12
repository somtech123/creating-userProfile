public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    public Person(String firstName, String lastName, int age, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
    }

    public String setFirstName(String firstName) {
      return   this.firstName = firstName;
    }

    public String setLastName(String lastName) {
        return this.lastName = lastName;
    }

    public int setAge(int age) {
       return this.age = age;

    }

    public String setAddress(String address) {
       return this.address = address;
    }

    // overriding java built in to string method you can change it to your own specification

    @Override
    public String toString() {
        return "" +
               "new profile firstName is " + firstName  +
               ", lastName, " + lastName +
               ", age, " + age +
               ", address, " + address  ;
    }
}
