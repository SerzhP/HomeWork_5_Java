import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeWork_5 {
    public static void main(String[] args) {
        //1
        /**Build a class with the following line inside main:
         Int a = 1/0;

         Build a corresponding try-catch block to avoid exception.*/

//        try {
//            int a = 1/0;
//        } catch (ArithmeticException e) {
//            System.out.println("An error occurred: " + e.getMessage()); }
//
//
//        try {
//            int a = 1/0;
//        } catch (ArithmeticException e) {
//            e.printStackTrace(); }


        /**Is the following code legal?

         */
//        try { ...
//         } finally {
//         ... }
//         */

//        Yes.If no exception is thrown in the try block, the finally block will still execute.


        /**What exception types can be caught by the following handler?
         catch (Exception e) {
         ... }*/

//        All exception types
//        catch (Exception e)
//        System.out.println("An exception occurred: " + e.getMessage());


        /**What is wrong with using the above type of exception handler?*/

//        It is too general and can can give less onformation than a specific one.

        /** What exceptions can be caught by the following handler?

         } catch (Exception e) {
         ...
         } catch (ArithmeticException a) {
         }
         */

        //(Exception e): This block will catch any exceptions that are instances of Exception or its subclasses,
        // including ArithmeticException, NullPointerException, IOException, etc.

        // (ArithmeticException a): This block will catch only ArithmeticException.

        //2
        /**Write a program with the following:
          Array of strings with 3 names.
          Change the second name.
          Print the third name.*/

//        String[] myNames = {"Tom","Bob","Sam"};
//        myNames[1]="Bill";
//        System.out.println(myNames[2]);
        //3
        /**Write a program with the following:

          Create a class Dog with 3 variables, constructors,
         setters and getters.
          In Main.class create 2 instances of Dog with different
         values.
          Add dogs to ArrayList and print one of the dogs values.
          Remove both dogs from ArrayList and print list size*/

//        Dog dog1 = new Dog("Jack","White",6);
//        Dog dog2 = new Dog("Shon",4);
//
//        ArrayList<Dog>myDogs = new ArrayList<>();
//        myDogs.add(dog1);
//        myDogs.add(dog2);
//        System.out.println(myDogs.get(0).getName());
//        myDogs.clear();
//        System.out.println(myDogs.size());


        //4
        /** Write a program with the following:
         a. Create an ArrayList with 3 strings
         b. Iterate the ArrayList and print the second String only.*/

        ArrayList<String> myList = new ArrayList<>();
        myList.add("One");
        myList.add("Two");
        myList.add("Three");

//        for (int i = 0; i < myList.size(); i++) {
//            if (i == 1) {
//                System.out.println(myList.get(i));}
//    }

//        if (myList.size() > 1) {
//            System.out.println("The second string is: " + myList.get(1));
//        } else {
//            System.out.println("The list does not have a second string.");
//        }

        //5
        /**Write a program with the following:
         a. Create an array with 6 integers (any!)
         b. Calculate and print the average of all the numbers in the
         array.*/

//        int[] myNumbers = {6, 7, 8, 11, 24, 45};
//
//        int sum = 0;
//        for (int i = 0; i < myNumbers.length; i++) {
//            sum += myNumbers[i];
//        }
//        System.out.println("Average is: " + sum / myNumbers.length);

//        int sum = 0;
//        for (int number : myNumbers) {
//            sum += number;
//        }
//        double average = (double) sum / myNumbers.length;
//        System.out.println("The average of all the numbers in the array is: " + average);

        //6
        /** Create a HashMap object name it users
            Add 3 pairs of users and passwords
            Print all users password*/

//        Map<String,String> users = new HashMap<>();
//        users.put("One","1111");
//        users.put("Two","2222");
//        users.put("Three","3333");
//        System.out.println(users.values());
//
//        for (String key : users.keySet()) {
//            System.out.println("Password for " + key + ": " + users.get(key));
//        }

        //7

        /**a. Create an ENUM with the 4 seasons
         b. Ask user for an number input between 1-4
         c. Print a different season for each number
         e.g: user choose 1  print summer, user choose 2  print
         winter etc.
         ** Order does not matter.*/

//        System.out.println("Please choose an number between 1-4");
//        int userChoice = new Scanner(System.in).nextInt();
//        switch (userChoice) {
//            case 1:
//                System.out.println(Seasons.SUMMER);
//                break;
//            case 2:
//                System.out.println(Seasons.AUTUMN);
//                break;
//            case 3:
//                System.out.println(Seasons.WINTER);
//                break;
//            case 4:
//                System.out.println(Seasons.SPRING);
//                break;
//        }

        //8

        /**Is this code valid?

         private void getX(var x) {
         System.out.println(x);
         }*/

//        No! var can't be used as a method argument















    }
    }

