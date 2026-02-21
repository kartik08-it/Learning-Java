# Display Variables

- println() method is often used to display variables
- combine both text and a variable, use the + character:
- can also use the + character to add a variable to another variable 
# String name = "Kartik";
# String LastName = "Upadhayay";

# System.out.println("Hello " + name);

# String fullName = firstName + lastName;

# + symbol :- 
    For text (strings), it joins them together (called concatenation).
    For numbers, it adds values together.

int x = 5;
int y = 6;
System.out.println(x + y);

# System.out.println("The sum is " + x + y);   // Prints: The sum is 56
# System.out.println("The sum is " + (x + y)); // Prints: The sum is 11


# explanation :- 
    Java combines "The sum is " with x, creating the string "The sum is 5". Then y is added to that string, so it becomes "The sum is 56".
    in the second line, the parentheses make sure x + y is calculated first (resulting in 11), so the output is "The sum is 11".

# Declare Many Variables
    declare more than one variable of the same type, you can use a comma-separated list:
    int x = 5, y = 6, z = 50;


# One Value to Multiple Variables
    You can also assign the same value to multiple variables in one line:
    int x, y, z;
    x = y = z = 50;