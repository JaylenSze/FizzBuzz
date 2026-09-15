package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples(3, 5, 1000);
        System.out.println(count);

    }

    static int multiples(int n, int a, int b) {
        int num = 0;
        for(int i = 1; i < n; i++){
            if(i % a == 0 || i % b == 0){
                num += 1;
            }
        }
        return num;
    }
}
