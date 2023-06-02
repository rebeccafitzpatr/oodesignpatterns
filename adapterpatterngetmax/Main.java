package adapterpatterngetmax;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
		    int[] numbers = new int[] { 5, 34, 2, -1, 3, 444, 89 };
        System.out.println("array in input: " + Arrays.toString(numbers));
        //TODO
        Max maximum = new MaxAdapter();
        int max = maximum.getMax(numbers); //FIXME
        System.out.println("max: " + max);
    }
}
