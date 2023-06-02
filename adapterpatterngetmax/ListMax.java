package adapterpatterngetmax;



import java.util.ArrayList;



public class ListMax{
    private int maximum;
  
    public int getMaxFromList(ArrayList<Integer> numbers) {
        this.maximum = numbers.get(0);
        for (int number : numbers) {
          if (number > this.maximum) {
            this.maximum = number;
          }
        } 
        return this.maximum;
    }

    
}