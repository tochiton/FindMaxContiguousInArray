import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int maxNumToAdd = 10;            // the sum shoud add to this value -- change the value for testing
        int[] myArray = new int[10];     //allocates array of ints -- you can change the length for testing purpose
        int length = myArray.length;    //gets the length of the array
        Calculate myObject = new Calculate();

        for (int i = 0; i < length; i++){
            myArray[i] = rand.nextInt((6 - 1) + 1) + 1;
        }

        int countContiguousNumAddToValue = myObject.getContiguousCount(myArray,maxNumToAdd);

        System.out.println(Arrays.toString(myArray));
        System.out.println("The max count of contiguous numbers that add to "+ maxNumToAdd +" is: "+ countContiguousNumAddToValue);
    }
}
