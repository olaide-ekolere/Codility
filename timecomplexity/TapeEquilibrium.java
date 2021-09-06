package timecomplexity;

public class TapeEquilibrium {
    public int solution(int[] A) {
        int min = Integer.MAX_VALUE;
        int left = 0;
        int right = 0;
        for(int a : A) {
            right += a;
        }
        for(int i = 0; i < A.length-1; i++){
            left += A[i];
            right -= A[i];
            min = Math.min(min, Math.abs(left-right));
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(new TapeEquilibrium().solution(new int[]{3, 1, 2, 4, 3})); //1
        System.out.println(new TapeEquilibrium().solution(new int[]{1, 3})); //2
    }
}
