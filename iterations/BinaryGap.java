package iterations;

public class BinaryGap {
    public int solution(int N) {
        int longest = 0;
        String binary = Integer.toBinaryString(N);
        int windowStart = 0;
        for(int windowEnd = 1; windowEnd < binary.length(); windowEnd++){
            char c = binary.charAt(windowEnd);
            if(c=='1'){
                longest = Math.max(longest, windowEnd-windowStart-1);
                windowStart = windowEnd;
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        System.out.println(new BinaryGap().solution(9)); //1001 2
        System.out.println(new BinaryGap().solution(529)); //1000010001 4
        System.out.println(new BinaryGap().solution(20)); //10100 1
    }
}
