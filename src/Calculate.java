
public class Calculate {

    public int getContiguousCount(int [] myArray, int maxValue){
         int addToMax = 0;
         int officialCount= 0;
         int count = 0;
         int sum = 0;

        int length = myArray.length;
        for(int i = 0; i < length; i++){
            sum = sum + myArray[i];
            if(sum < maxValue){
                count++;
                if(officialCount < count){
                    officialCount = count;
                }
            }
            else{
                sum = myArray[i];
                count = 1;
            }
        }
        return officialCount;
    }
}
