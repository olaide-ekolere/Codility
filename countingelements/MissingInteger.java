package countingelements;

public class MissingInteger {
    public int solution(int[] A) {
        boolean[] found = new boolean[A.length];
        for(int a : A){
            if(a>0&&a<=A.length&&!found[a-1]){
                found[a-1] = true;
            }
        }
        for(int i = 0; i < found.length; i++){
            if(!found[i]) return i + 1;
        }
        return A.length + 1;
    }

    public static void main(String[] args) {
        System.out.println(new MissingInteger().solution(new int[] {1, 3, 6, 4, 1, 2})); //5
        System.out.println(new MissingInteger().solution(new int[] {1, 3, 2})); //4
        System.out.println(new MissingInteger().solution(new int[] {-1, -3})); //1
    }
}
