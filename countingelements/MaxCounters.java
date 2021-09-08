package countingelements;

import java.util.Arrays;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int minValue = 0, maxValue = 0;
        for(int i = 0; i < A.length; i++){
            int val = A[i];
            if(val == N+1){
                minValue = maxValue;
            }
            else {
                if(counters[val-1]<minValue)counters[val-1] = minValue;
                maxValue = Math.max(maxValue, ++counters[val-1]);
                
            }
        }
        for(int i = 0; i < counters.length; i++){
            counters[i] = Math.max(minValue, counters[i]);
        }
        return counters;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new MaxCounters().solution(5, new int[] {3, 4, 4, 6, 1, 4, 4}))); 
        //[3, 2, 2, 4, 2]
    }
}
