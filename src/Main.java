import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner( System.in );
    public static void main(String[] args) {
        // using the list interface with a generic object of the person class to store it values in  an arrayList

        List<Person> profile = new ArrayList<>();

        boolean quite = false;
        printMenu();
        while (!quite){
            int action = scanner.nextInt();
            switch (action){
                case 0:
                    quite = true;
                    break;
                    //creating a new profile for the user and adding it to the arrayList

                case 1:
                    System.out.println("Enter your first name");
                    String firstName = scanner.next();
                    System.out.println("Enter your last name");
                    String lastName = scanner.next();
                    System.out.println("Enter you age");
                    int age = Integer.parseInt( scanner.next() );
                    System.out.println("enter your address ");
                    String address = scanner.next();
                    profile.add( new Person( firstName, lastName,age,address ) );
                    System.out.println("new profile created successfully for user");
                    break;

                    // displaying the user profile if empty create an error message
                case 2:
                   if (profile.isEmpty()){
                       System.out.println("no profile detected select option 1 to create a profile");
                   } else {
                       for (Person person : profile){
                           System.out.println(person.toString());
                       }
                   }
                    break;
                // updating the user first name if empty create an error message
                case 3:
                    System.out.println("update first name");
                    if (profile.isEmpty()){
                        System.out.println("no profile detected select option 1 to create a profile");
                    } else {
                        for (Person person : profile) {
                            System.out.println( person.setFirstName( scanner.next() ) );
                            System.out.println( "first name updated successfully" );
                        }
                    }
                    break;
                // updating the user last name if empty create an error message
                case 4:
                    if (profile.isEmpty()){
                        System.out.println("no profile detected select option 1 to create a profile");
                    } else {
                        System.out.println( "update last name" );
                        for (Person person : profile) {
                            System.out.println( person.setLastName( scanner.next() ) );
                            System.out.println( "last name updated successfully" );
                        }
                    }
                    break;
                // updating the user age if empty create an error message
                case 5:
                    if (profile.isEmpty()){
                        System.out.println("no profile detected select option 1 to create a profile");
                    } else {
                        System.out.println( "update age" );
                        for (Person person : profile) {
                            System.out.println( person.setAge( Integer.parseInt( scanner.next() ) ) );
                            System.out.println( "age was updated successfully" );
                        }
                    }
                    break;
                case 6:
                    // updating the user address if empty create an error message
                    if (profile.isEmpty()){
                        System.out.println("no profile detected select option 1 to create a profile");
                    } else {
                        System.out.println( "update address" );
                        for (Person person : profile) {
                            System.out.println( person.setAddress( scanner.next() ) );
                            System.out.println( "address updated successfully" );
                        }
                    }
                    break;
                case 7:
                    printMenu();
                    break;

            }
        }

    }

    private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quite\n" +
                           "1 - Create a profile\n"+
                           "2 - show user profile\n"+
                           "3 - update user first name\n" +
                           "4 - update user last name\n" +
                           "5 - update user age\n" +
                           "6 - update user address\n" +
                           "7 - print available action\n");
    }

}