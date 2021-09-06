package arrays;

import java.util.*;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        Map<Integer, Integer> values = new HashMap<>();
        for(int a : A){
            values.put(a, values.getOrDefault(a, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: values.entrySet()){
            if(entry.getValue()%2!=0) return entry.getKey();
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new OddOccurrencesInArray().solution(new int[]{9, 3, 9, 3, 9, 7, 9})); //5
    }
}
