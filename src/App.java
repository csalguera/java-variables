public class App {
    public static void main(String[] args) throws Exception {
        // Primitive Data Types --------------------------------------
        // Some primitive data types are: int, double, and boolean
        // Structure:
        // datatype variableName
        int age;
        double salaryRequirement;
        boolean isEmployed;
        
        // assignment operator
        // assign value to a variable with the assignment operator '='
        age = 85;
        // when code is used to represent a fixed value, like 85, it is referred to as a literal
        
        // assign value to to a decalred variable in one line:
        int yearCodecademyWasFounded = 2011;
        
        // Statement with concatenation:
        System.out.println("Codecademy was founded in " + yearCodecademyWasFounded);

        // ints ------------------------------------------------------
        // In Java whole numbers are stored in the 'int' primitive data type
        // its hold poristive numbers, negative numbers, and zero
        // they do not store fractions or numbers with decimals
        // The int data type allows values between -2,147,483,648 and 2,147,483,647, inclusive

        // doubles ---------------------------------------------------
        // the double primitive data type can hold decimals as well as very large and very small numbers
        // The maximum value is 1.797,693,134,862,315,7 E+308
        // The minimum value is 4.9 E-324

        // booleans --------------------------------------------------
        // booleans reference one of two values: true or false

        // char ------------------------------------------------------
        // the char data type can hold any character, like a letter, space, or punctuation mark
        // it must be surrounded by single quotes
        char grade = 'A';
        char firstLetter = 'p';
        char punctuation = '!';

        // String ----------------------------------------------------
        // Strings are objects instead of primitives
        // objects have built-in behavior
        
        // There are two ways to create a String object:
        // using a String literal or calling the String class to create a new String object
        
        // A String literal is any sequence of characters enclosed in double-quotes
        // Like primitive data types, we declare a String variable by specifying the type first:
        String greeting = "Hello World";
        
        // we can also call the String class:
        String salutations = new String("Hello World");
        // there are subtle differences between the two
        
        // Escape Sequences have an alternative use in Java print statements
        // they are interpreted differently by the compiler than other characters
        // they begin with the '\' symbol
        
        // There are three escape sequences to be aware of:
        
        // \" allows us to quotation marks to a String value:
        System.out.println("\"Hello World\"");
        // Prints: "Hello World"
        
        // \\ allows us to place backslashes in our String
        System.out.println("This is the backslash symbol: \\");
        // Prints: This is the backslash symbol: \
        
        // \n outputs a new line text
        System.out.println("Hello\nGoodbye");
        /*
        Prints:
        Hello
        Goodbye
        */

        // Static Checking -------------------------------------------
        // Java has a static typing
        // Java programs won't compile if variables are assigned to a value of an incorrect type
        
        // ex: int greeting = "Hello World"
        // int is strictly for numbers not for Strings

        // Naming Conventions ----------------------------------------
        String data = "Delilah";
        String nameOfUser = "Delilah";
        // the second variable is a more appropriate variable name

        // variables can start with a valid letter, '$', or '_'
        // No other symbols or numbers can begin the variable
        // 1stPlace and *Gazer are not valid variable names

        // Java variables utilize camelCase as their casing convention
    }
}
