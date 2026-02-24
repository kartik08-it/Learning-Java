
public class Casting {

    public static void main(String[] args) {
//Widening Casting (Automatic)
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);    // Outputs 9
        System.out.println(myDouble); // Outputs 9.0

// Narrowing Casting (Manual)
        double myDoubleNarrow = 9.78d;
        int myIntNarrow = (int) myDoubleNarrow; // Manual casting: double to int

        System.out.println(myDoubleNarrow); // Outputs 9.78
        System.out.println(myIntNarrow);    // Outputs 9

// Set the maximum possible score in the game to 500
        int maxScore = 500;

// The actual score of the user
        int userScore = 423;

        /* Calculate the percentage of the user's score in relation to the maximum available score.
Convert userScore to double to make sure that the division is accurate */
        double percentage = (double) userScore / maxScore * 100.0d;

        System.out.println("User's percentage is " + percentage);

        int x = 5;
        int y = 2;
        System.out.println(x % y);

        int a = 10;
        int b = 3;
        System.out.println(a / b);   // Integer division, result is 3

        double c = 10.0d;
        double d = 3.0d;
        System.out.println(c / d);   // Decimal division, result is 3.333..

        int xyz = 5;

        ++xyz; // Increment xyz by 1
        System.out.println(xyz); // 6
    }

}
