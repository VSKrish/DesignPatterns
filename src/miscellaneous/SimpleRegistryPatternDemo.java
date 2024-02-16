package miscellaneous;

import java.util.HashMap;
import java.util.Map;

/*
 * For range of numbers 1 - 100, print
       1. 'Fizz' when multiple of 3
       2. 'Buzz' when multiple of 5
       3. 'FizzBuzz' when multiple of 3 & 5
       4. Number itself if none of the above
       
       Enhancements:
		1. Print 'Foo' when multiple of 7, 'Bar' when multiple of 11
        2. Print 'FooBar' when multiple of 7 & 11
 */
public class SimpleRegistryPatternDemo {
	public static void main(String[] args) {
		Registry reg = new Registry();
		reg.addToRegistry(3, "Fizz");
		reg.addToRegistry(5, "Buzz");
		reg.addToRegistry(7, "Foo");
		reg.addToRegistry(11, "Bar");
		reg.printIfDivisible();
	}
}
class Registry {
	HashMap<Integer,String> registry = new HashMap<>();
	public void addToRegistry(int i,String str) {
		registry.put(i, str);
	}
	public void printIfDivisible() {
		boolean flag = false;
		for(int i=1;i<=100;i++) {
			flag = false;
			for(Map.Entry<Integer, String> entrySet: registry.entrySet()) {
				if(i%entrySet.getKey()==0) {
					System.out.print(entrySet.getValue());
					flag = true;
				}
			}
			if(!flag)
				System.out.print(i);
			System.out.println();
		}
	}
}




