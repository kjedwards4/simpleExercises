import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] A = {1,0,1,1,0,0,0,1};
        int i;
        int flipCounter = 0;


        for(i = 0; i<A.length - 1; i++){
            if (A[i] == A[i + 1] && A[i] == 1) {
                A[i+1] = 0;
                System.out.println(Arrays.toString(A));
                flipCounter++;
            } else if(A[i] == A[i + 1] && A[i] == 0){
                A[i+1] = 1;
                System.out.println(Arrays.toString(A));
                flipCounter++;
            }
        }
        System.out.println("Minimum number of flips: " + flipCounter);

    }
}
