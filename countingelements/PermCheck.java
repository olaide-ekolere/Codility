package countingelements;

public class PermCheck {
    public int solution(int[] A) {
        boolean[] found = new boolean[A.length];
        int count = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i]<=A.length&&!found[A[i]-1]){
                found[A[i]-1] = true;
                count++;
            }
        }
        if(count==A.length) return 1;
        else return 0;
    }

    public static void main(String[] args) {
        System.out.println(new PermCheck().solution(new int[]{4, 1, 3, 2})); //1
        System.out.println(new PermCheck().solution(new int[]{4, 1, 3})); //0
    }
}
