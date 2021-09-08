package countingelements;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        int count = 0;
        boolean[] found = new boolean[X];
        for(int i = 0; i < A.length; i++){
            int value = A[i];
            if(value<=X&&!found[value-1]){
                count+=1;
                found[value-1] = true;
                if(count==X) return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new FrogRiverOne().solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4})); //6
    }
}
