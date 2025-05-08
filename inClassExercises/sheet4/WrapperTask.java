package inClassExercises.sheet4;

public class WrapperTask {

    public static void main(String[] args) {
        char[] values = {'1', 'a', '3', 'z', '9'};
        int[] nums = {10, 0, -4, 20, 5};
        System.out.println(countDigitsPrimitive(values));
        System.out.println(countDigitsWrapper(values));
        System.out.println(maxPrimitive(nums));
        System.out.println(maxWithWrapper(nums));
    }

    // Task A: Count digits using only primitives (e.g., ASCII comparison)
    public static int countDigitsPrimitive(char[] values) {
        int count = 0 ;
        for(Character x : values){
        if (x >= '0' && x <= '9') {
            count+=1 ;
          } else {
            continue;
          }
        }
        return count;
    }

    // Task B: Count digits using Character.isDigit()
    public static int countDigitsWrapper(char[] values) {
        int count = 0 ;
        for(Character x : values){
        if (Character.isDigit(x)) {
            count+=1 ;
          } else {
            continue;
          }
        }
        return count;
    }

    // Task C: Find max using only primitives
    public static int maxPrimitive(int[] nums) {
        // TODO: Implement using primitive comparison
        int max = 0 ;
        for(Integer num : nums){
            if(max < num) {
                max = num ;
            }
        }
        return max;
    }

    //compare(int x, int y)
    /* This method returns the value zero if (x==y), 
    if (x < y) then it returns a value less than zero 
    and if (x > y) then it returns a value greater than zero.*/ 

    // Task D: Find max using Integer.compare()
    public static int maxWithWrapper(int[] nums) {
        // TODO: Implement using wrapper comparison
        int max = 0 ;
        for(Integer num : nums){
            if(Integer.compare(num, max) > 0) {
                max = num ;
            }
        }
        return max;
    }
    
}
