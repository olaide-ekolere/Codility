package arrays;

import java.util.Arrays;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        if(K==0||A.length<2) return A;
        int left = K % A.length;
        if(left==0) return A;
        left = A.length - left;
        int[] shuffled = new int[A.length];
        for(int i = 0; i < shuffled.length; i++){
            shuffled[i] = A[left];
            left = (left+1) % shuffled.length;
        }
        return shuffled;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new CyclicRotation().solution(new int[]{3, 8, 9, 7, 6}, 1)));
        //[6, 3, 8, 9, 7]
        System.out.println(Arrays.toString(new CyclicRotation().solution(new int[]{3, 8, 9, 7, 6}, 3)));
        //[9, 7, 6, 3, 8]
        System.out.println(Arrays.toString(new CyclicRotation().solution(new int[]{0, 0, 0}, 1)));
        //[0, 0, 0]
        System.out.println(Arrays.toString(new CyclicRotation().solution(new int[]{1, 2, 3, 4}, 4)));
        //[1, 2, 3, 4]

    }
}
