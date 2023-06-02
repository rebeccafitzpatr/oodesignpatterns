package adapterpatterngetmax;

import java.util.ArrayList;

public class MaxAdapter  implements Max{

  @Override
  public int getMax(int[] numbers) {
    ArrayList<Integer> inputArray = convertArray2List(numbers);
    ListMax max = new ListMax();
    int maximum = max.getMaxFromList(inputArray);
    return maximum;
  }

  public  ArrayList<Integer> convertArray2List(int[] list) {
    
    ArrayList<Integer> intArray = new ArrayList<Integer>();
    for (int element : list) {
      intArray.add(element);

    }

    return intArray;

  }

  
  
}
