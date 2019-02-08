 
import java.util.Scanner;
public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        int x = integers[0];
        int y = integers[1];
        int z = integers[2];
        
      if (x > y && x > z){
        return x;
    } else if (y > x && y > z){
        return y;
    } else if (z > x && z > y){
        return z;  
    } else {
        return null;

} 

}

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
      int x = integers[0];
      int y = integers[1];
      int z = integers[2];
      return Math.max(Math.max(x,y),z);
    }
}
