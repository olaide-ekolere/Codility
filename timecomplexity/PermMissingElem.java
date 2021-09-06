package timecomplexity;

import java.util.Arrays;

public class PermMissingElem {
    public int solution(int[] A) {
        Arrays.sort(A);
        int last = 0;
        for(int i = 0; i < A.length;  i++){
            if(A[i]!=last+1) return last + 1;
            else last = A[i];
        }
        return last + 1;
    }

    public static void main(String[] args) {
        System.out.println(new PermMissingElem().solution(new int[] {2, 3, 1, 5})); //4
        System.out.println(new PermMissingElem().solution(new int[] {2, 3, 4, 5})); //1
        System.out.println(new PermMissingElem().solution(new int[] {2, 3, 1, 4})); //5
        System.out.println(new PermMissingElem().solution(new int[] {1})); //2
        System.out.println(new PermMissingElem().solution(new int[] {2})); //1
    }
}
