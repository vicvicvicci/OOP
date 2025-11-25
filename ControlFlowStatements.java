import java.util.Arrays;
import java.util.ArrayList;
import java.lang.*;

public class ControlFlowStatements {
    static int sum(int[] a) {
        int total = 0;
        for (int num: a){
            total += num;
        }
        return total;
    }

    static int[] cumsum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            a[i] = sum;
        }
        return a;
    }

    // int[] positives(int[] a) which produces the array of positives in a (note your returned array should not have any empty slots).

    static int[] positive(int[] a) {
        int count = 0;
        for (int num: a) {
            if (num > 0) {
                count += 1;
            }
        }
        int[] positiveArray = new int[count];
        int i = 0;
        for (int num: a){
            if (num>0) {
                positiveArray[i] = num;
                i+=1;
            }
        }
        return positiveArray;
    }

    static int[] positives(int[] a){
        ArrayList<Integer> positiveArray = new ArrayList<Integer>();
        for (int num: a){
            if (num > 0){
                positiveArray.add(num);
            }
        }
        Integer[] IntegerArray = positiveArray.toArray(new Integer[0]);

        int[] result = new int[IntegerArray.length];
        int i = 0;
        for(Integer n: positiveArray){
            result[i] = n.intValue();
            i += 1;
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.print(sum(new int[] {1,2,3,4,5}));
        System.out.print(Arrays.toString(cumsum(new int[] {1,2,3})));
        System.out.print(Arrays.toString(positives(new int[] {-1,4,2,-93,49,0,2})));
    }
}


