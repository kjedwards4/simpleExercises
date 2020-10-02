import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        Integer[] A = {1,44,42,12,76,104,1006};
        int i;

        Arrays.sort(A, Collections.reverseOrder());

        System.out.println(Arrays.toString(A));

        for (i = 0; i < A.length; i ++){
            if(A[i] % 4 == 0){
                System.out.println("The largest element divisible by " +
                        "4 is " + A[i]);
                System.exit(0);
            }
        }
    }
}
