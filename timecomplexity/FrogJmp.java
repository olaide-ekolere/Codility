package timecomplexity;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        int distance = Y - X;
        int jumps = distance / D;
        if(jumps*D!=distance) jumps++;
        return jumps;
    }

    public static void main(String[] args) {
        System.out.println(new FrogJmp().solution(10, 85, 30));
    }
}
