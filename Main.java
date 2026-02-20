
public class Main {

    public static void main(String[] args) {
        // print statements
        System.out.println("Hello World!");
        System.out.println("Have a good day!");
        System.out.println("Learning Java is fun!");

        System.out.println(100);
        System.out.println(100 + 100);
        System.out.println(100 * 100);

        // variable declaration and overwrite exist one 
        String name = "Kartik Upadhayay";
        name = "Pramod Upadhayay";
        System.out.println(name);

        // Other Types
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        // final declaration of any variable
        final int myNum = 15;
        myNum = 9909;     //Main.java:19: error: cannot assign a value to final variable myNum
        System.out.println(myNum);

    }
}
