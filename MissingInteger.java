import java.util.HashSet;

public class MissingInteger{
    public static void main(String[] args) {
        MissingInteger missingInteger = new MissingInteger();
        System.out.println(missingInteger.solution(new int[]{1, 3, 6, 4, 1, 2}));
    }

    public int solution(int A[]){
        HashSet<Integer> numbers = new HashSet<>();
        for(int i = 0; i < A.length + 1; i++){
            numbers.add(i+1);
        }
        for(int a : A){
            if(numbers.contains(a)){
                numbers.remove(a);
            }
        }
        return numbers.iterator().next();
    }
}