# Identifiers
    All Java variables must be identified with unique names. These unique names are called identifiers.
    Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).

# Note: It is recommended to use descriptive names in order to create understandable and maintainable code:

The general rules for naming variables are:

-    Names can contain letters, digits, underscores, and dollar signs
-    Names must begin with a letter
-    Names should start with a lowercase letter, and cannot contain whitespace
-    Names can also begin with $ and _
-   Names are case-sensitive ("myVar" and "myvar" are different variables)
-    Reserved words (like Java keywords, such as int or boolean) cannot be used as names

# Invalid Identifiers

-   int 2ndNumber = 5;  // Cannot start with a digit
-   int my var = 10;    // Cannot contain spaces
-   int int = 20;       // Cannot use reserved keywords

# Java Data Types :- 
    int myNum = 5;               // Integer (whole number)
    float myFloatNum = 5.99f;    // Floating point number
    char myLetter = 'D';         // Character
    boolean myBool = true;       // Boolean
    String myText = "Hello";     // String

# Primitive data types 
    includes byte, short, int, long, float, double, boolean and char
    Primitive types in Java are predefined and built into the language, 
    primitive types cannot.
    Primitive types start with a lowercase letter (like int), 
    Primitive types always hold a value

# Non-primitive data types
    Such as String, Arrays and Classes
    non-primitive types are created by the programmer (except for String)
    Non-primitive types can be used to call methods to perform certain operations,
    non-primitive types typically starts with an uppercase letter (like String)
    whereas non-primitive types can be null.    


# The var Keyword
    The var keyword was introduced in Java 10 (released in 2018).    
    The var keyword lets the compiler automatically detect the type of a variable based on the value you assign to it.
    This helps you write cleaner code and avoid repeating types, especially for long or complex types.

# For example, instead of writing int x = 5;, you can write:
# var x = 5;

When using var, the compiler understands that 5 is an int.

# Example with Different Types
    Here are some examples showing how var can be used to create variables of different types, based on the values you assign:

    var myNum = 5;         // int
    var myDouble = 9.98;   // double
    var myChar = 'D';      // char
    var myBoolean = true;  // boolean
    var myString = "Hello"; // String

