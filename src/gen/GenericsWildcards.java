package gen;
/*
 * Upper bounded wildcards are used to relax the restriction on the type of variable in a method. 
 * Suppose we want to write a method that will return the sum of numbers in the list, so our implementation will be something like this.

public static double sum(List<Number> list){
		double sum = 0;
		for(Number n : list){
			sum += n.doubleValue();
		}
		return sum;
	}
Now the problem with above implementation is that it won’t work with List of Integers or Doubles because we know that List<Integer> and List<Double> are not related, this is when upper bounded wildcard is helpful. We use generics wildcard with extends keyword and the upper bound class or interface that will allow us to pass argument of upper bound or it’s subclasses types.

The above implementation can be modified like below program.
 */
import java.util.ArrayList;
import java.util.List;

public class GenericsWildcards {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(3); ints.add(5); ints.add(10);
		double sum = sum(ints);
		System.out.println("Sum of ints="+sum);
	}

	public static double sum(List<? extends Number> list){
		double sum = 0;
		for(Number n : list){
			sum += n.doubleValue();
		}
		return sum;
	}
}