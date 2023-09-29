package org.example;

import javax.sound.midi.Soundbank;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    // Constant // Prevent "Magic Numbers"
    final int MY_CONSTANT_TIME = 24; // ALL_CAPS_SNAKE_CASE

    // final class cannot be extended
    // final methods cannot be overridden
    // enum

    // HashMap
    // Key-Value Pair
    // stored together in map
    // key must be unique

    public enum State {
        // properties private
        // Only create getters
        // Do not update the class variables outside the constructor
        CA("PST"),
        MO("CST"),
        NY("EST");

        private String timeZone;

        private State(String timeZone) {
            this.timeZone = timeZone;
        }

        public String getTimeZone() {
            return this.timeZone;
        }
    }

    /*
    Engineering Skills
    Documentation - Writing things down
    Organization - Improving code structure, file structure, refactoring code
    Efficiency - Choosing solutions that are faster/smaller (less memory)
    Debugging - Analyze your code, find errors, utilizing tools such as console log, debugger, and the inspector
    Teamwork - Share responsibility, working with Agile methodologies, pair programming, teaching, code review
    Communication - Communicating clearly and confidently, with respect
    Problem-Solving - Breaking down big problems into small problems and having a planned, methodical approach
     */

    /* Pillars of OOP
        Abstraction - General representation of a specific concept
        Encapsulation - Hides details about how code works.
        Inheritance - Sharing properties and methods between related classes
        Polymorphism - Same name, different behavior
     */

    // 1. Visibility (public static)
    // 2. The return type
    // 3. Name (makePancakes)
    // 4. Parameters
    // 5. Code Block

    // Defining/Declaring/Writing method VVVVV
    public static void makePancakes(String flour) { // method signature
        // do some stuff, don't have to return anything for void
        System.out.println("I made pancakes with " + flour);
    }

    public static String getData() {
        String[] rawResults = {"one", "two", "three"};
        try {
            return rawResults[6]; // No index!!
        } catch (Exception x) {
            System.out.println("Exception:" + x.getMessage());
            return "";
        }
    }

    public static void myMethod() throws InterruptedException, FileNotFoundException {
        Thread.sleep(10000);
        System.out.println("Pause complete");

////            FileInputStream fileStream = new FileInputStream("myfile.txt");
////            System.out.println("File opened");
//
//            throw new RuntimeException();
    }

    public static String readFromFile(String fileName) throws IOException {
        // 1. inport libraries
        // 2. create a Path
        // 3. Read from the file
        // 4. Create a method
        Path filePath = Path.of(fileName);
        return Files.readString(filePath);
//        FileInputStream inputStream = new FileInputStream(fileName);
//        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
//        BufferedReader bReader = new BufferedReader(inputStreamReader);
//
//        String line;
//        while ((line = bReader.readLine()) != null) {
//            System.out.println(line);
//        }
//        inputStream.close();
    }

    public static void readEachLine(String csvContent) {
        String[] csvLines = csvContent.split("\n");
        String[] headers = csvLines[0].split(",");
        for (int i = 1; i < csvLines.length; i++) {
            String dataItem = csvLines[i];
            String[] dataArray = dataItem.split(",");
            for (int j = 0; j < headers.length; j++) {
                System.out.println(headers[j] +": " + dataArray[j]);
            }
            System.out.println();
        }
    }

    public static void writeToFile(String fileName, String content) throws IOException {
        Path filePath = Path.of(fileName);
        Files.writeString(filePath, content);
    }

    public static void main(String[] args) {

        MyHttpClient myHttpClient = new MyHttpClient();
        String url = "https://reqbin.com/echo/put/json";
        String testJson = "{ \"key\" : \"message to send\" }";

        System.out.println(myHttpClient.makePUTRequest(url, testJson));

//        try {
//            readEachLine((readFromFile("myData.csv")));
//            //writeToFile("output.txt", "Hello world!");
//        } catch (IOException e) {
//            System.out.println(e);
//        }
//        int[] numbers = {7,5,1,3};
//        int[][] twoDimensionalArray = {
//                {0,0,0}, // index always starts at 0
//                {0,0,0,5,6,7},
//                {0,1,3},
//                {1,3,4}
//        };
//        int numRows = 5;
//        int numColumns = 3;
//        int[][] anotherTwoDimensionalArray = new int[numRows][numColumns]; // default 0
//
//        int myValue = twoDimensionalArray[3][1];
//
//        try {
//
//            // Nested For-Loop
//            for (int i = 0; i < twoDimensionalArray.length; i++) {
//                for (int j = 0; j < twoDimensionalArray[i].length; j++) {
//                    System.out.println(twoDimensionalArray[i][j]);
//                }
//                System.out.println();
//            }
//
////            myMethod();
////            System.out.println(myValue);
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        //String data = getData();

        // Exceptions - Errors that stop a program from running
        // What caused the error
        // What file or method the error occurred in
        // The line number that the error occurred on
        /*
        1. The error is tracked
        2. An object is created to hold the error info
        3. The error is THROWN
        NullPointerException - object that is null
        IllegalArgumentException - pass an incorrect arg to method
        IOException -

        Checked and Unchecked
        Checked Exceptions - must be handled
        Unchecked Exceptions - don't require handling RUNTIME ERRORS

        HOW TO HANDLE EXCEPTIONS
        1. Add throws to the method signature
        2. Handle the exception in a try/catch
         */
//        try {
//            // Code we want to try
//        } catch (Exception e) {
//            // What we do when it goes wrong
//            System.out.println(e.getMessage());
//        } finally {
//            // Optional
//            // Run this every time with or without an error
//            //bReader.close();
//        }

        // DTO? When to use?
        // Client is asking for multiple pieces of related info
        // Improve performance by reducing the number of remote calls
        // Improve memory performance by sending info in large batches

//        Apple one = new Apple();
//        Apple two = new Apple();
//        Apple three = new Apple();
//
//        Apple[] data = {one, two, three};
//
//        AppleDTO dto = new AppleDTO(data);
//
//        send(dto);


        // UML - Unified Modeling Language


            // Hash Maps (key-value pairs)
//        HashMap<String, String> phoneBook = new HashMap<>();
//        phoneBook.put("Burt", "202-555-0118");
//        phoneBook.put("Oscar", "202-555-0220");
//
//        String burtsPhone = phoneBook.get("Burt");
//        System.out.println(burtsPhone);
//
//        for(HashMap.Entry<String, String> entry : phoneBook.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }

//        System.out.println(State.CA.getTimeZone());
//
//            Coin myCoin = new Coin();
//            Coin anotherCoint = new Coin();
//
//            // DTO Data Transfer Object Design Pattern
//
//            // Singleton Design Pattern
//            // Only ONE Instance
////
////        Person personRecord = new Person("Michael", "Meacham"); // instantiated, creating a new instance
//////        personRecord.firstName = "Sam";
//////        personRecord.lastName = "Martin";
////        System.out.println(personRecord.getFullName());
//
////        // Building Strings
////        String info = "";
////        info += "My name is Jack";
////        info += " ";
////        info += "I love sushi.";
////
////        StringBuilder jackStringBuilder = new StringBuilder();
////
////        jackStringBuilder.append("My name is Jack");
////        jackStringBuilder.append(" ");
////        jackStringBuilder.append("I love sushi.");
////        // charAt() // returns character at index
////        // length() // returns the character count
////        // substring(start, end) //
////        // setCharAt(index, character)
////        jackStringBuilder.setCharAt(6, 'o');
////        System.out.println(jackStringBuilder);
//
//
//
////        String flourType = "whole germ flour";
////        makePancakes(flourType); //<---- Calling/Invoking/Running/Executing the method
////        makePancakes("baking flour"); // Calling/Invoking/Running/Executing the method
////
////        ArrayList<String> myArrayList = new ArrayList<>();
////        myArrayList.add("Jack");
////        myArrayList.add("Huntington");
////
////        System.out.println(myArrayList);
//
//        // ArrayList
//        /*
//        ArrayList is a class
//        Collection
//        Resized Dynamically
//        We don't need to know how big an ArrayList is when we declare it
//
//        .add(Object o)
//        .add(int index, Object o)
//        .remove(Object o)
//        .clear()
//        .set(int index, Object o)
//
//        // Must use Wrapper Classes
//        int becomes Integer
//        double becomes Double
//        boolean becomes Boolean
//        char becomes Character
//         */
//
//        // Primitive Data Types
//        /*
//        boolean - true/false
//        char - single character
//        long - whole numbers
//        int -
//        byte - -128, 127
//        short -
//        float - Decimals
//        double - Decimals
//        */
//        // Variable
//        // Data Type, A Name, Value
//        // Assignment operator =
//        // Declaration
//        int result = 10 / 3; // truncation
//        int someVariable;
//        String foodContainer;
//        foodContainer = "lasagna";
//        System.out.println(result);
//        // Control Flow
//        //boolean someCondition = false;
//
//        // Promiscuous
//        // == comparison
//        // = assignment
//
//        // Boolean Operators
//
//        if ((3 >= 3 || 4 == 3) && !false) { // Conditional // BANG! / Not Operator / Exclamation Point ! // Negate // Invert
//            System.out.println("The condition is true!");
//        } else {
//            System.out.println("The condition is false!");
//        }
//
//
//        /*
//        // PEMDAS - Parentheses, Exponents, Multiplication, Division, Addition, Subtraction
//        + addition
//        - subtraction
//        * multiply
//        / divide
//        ^ power of
//        Math.sqrt(someNumber)
//        Math.pow(base, exp)
//        % // Modulo/Modulus
//         */
//
//        int someNumber = 5;
//        someNumber += 3;
//        someNumber -= 1;
//        someNumber *= 3;
//        someNumber++;
//        someNumber--;
//        // Incrementor / Decrementor
//
//        String someString = ""; // Empty String
//        String aString = "Things";
//        String bString = "Things";
//        someString += "stuff!\n\tJack said \"Hello!\""; // Concatenate
//        /*
//            str - string
//            temp - temporary
//            num - number
//            msg - message
//            id - identifier
//            char - character
//         */
//
////        String someOtherString = aString + " and " + someString;
////        String s1 = new String("Hello!");
////
////        System.out.println(someOtherString);
////        System.out.println(aString.equals(bString));
////        System.out.println(10 % 3); // FizzBuzz
//
//        String myRabbit = "Fin";
//        String myRabbitUpperCase = myRabbit.toUpperCase(); // new string in memory
//        myRabbit = myRabbitUpperCase; // switching where the variable is pointed
//        System.out.println(myRabbit);
//
//        /*
//            String
//            .substring()
//            .length()
//            .split()
//         */
//
//        // User Input
//        /*
//        1. Import Scanner package
//        2. Define a variable and set it to a Scanner object
//        3. Define a variable to hold the input
//        4. Use the Scanner object to read input from the user
//         */
//        // Instantiate an object
////        Scanner scanner = new Scanner(System.in);
////        System.out.println("Enter your name");
////        String name = scanner.nextLine();
////        System.out.println("Enter your age");
////        int someNum = scanner.nextInt();
////        System.out.println("Hello " + name + "! Nice to meet you! You are " + someNum + " years old!");
//
////        // Arrays
////        // Start on index 0
////        int index = 0;
////        String[] ingredients = new String[]{"milk", "eggs", "sugar", "cereal"};
////        String[] emptyIngredients = new String[3]; // null for Strings, Objects // 0 for int, float, double // false for boolean
////        System.out.println(ingredients[index]); // OutOfBounds Exception
////        // dot notation
////        System.out.println(ingredients.length);
////        // i, j
////        // Index, End Condition, Incrementor/Decrementor
////        boolean imHungry = true;
//
//////        // Iterate
//////        // Evaluate a boolean condition
//////        while (index <= 100) {
//////            System.out.println(index);
////////            if (Math.random() > 0.7) {
////////                imHungry = false;
////////                System.out.println("I ate something!");
////////            }
//////            index++;
//////        }
////        for (int i = 0; i < ingredients.length; i++) {
////            System.out.println(ingredients[i]);
////        }
    }
}