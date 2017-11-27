package gen;

/*Java Generic Type:   https://www.youtube.com/watch?v=D5HEshszlPE

Java Generic Type Naming convention helps us understanding code easily and having a naming convention is one of the best practices of java programming language. So generics also comes with it’s own naming conventions. Usually type parameter names are single, uppercase letters to make it easily distinguishable from java variables. The most commonly used type parameter names are:

E – Element (used extensively by the Java Collections Framework, for example ArrayList, Set etc.)
K – Key (Used in Map)
N – Number
T – Type
V – Value (Used in Map)
S,U,V etc. – 2nd, 3rd, 4th types*/

public class GenericMethodTest {
	   // generic method printArray .. Array can hold different type of Elements ( but it is of type Array) 
	   public static < E > void printArray( E[] inputArray ) {
	      // Display array elements
	      for(E element : inputArray) {
	         System.out.print( element+"  ");
	      }
	      System.out.println();
	   }

	   public static void main(String args[]) {
	      // Create arrays of Integer, Double and Character
	      Integer[] intArray = { 1, 2, 3, 4, 5 };
	      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
	      Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

	      System.out.println("Array integerArray contains:");
	      printArray(intArray);   // pass an Integer array

	      System.out.println("\nArray doubleArray contains:");
	      printArray(doubleArray);   // pass a Double array

	      System.out.println("\nArray characterArray contains:");
	      printArray(charArray);   // pass a Character array
	   }
	}