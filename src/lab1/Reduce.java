package lab1;

public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduce(100));
    }
    static int reduce(int n) {
        int i = 0;
        while(n > 0){
            if(n % 2 == 0){
                n = n / 2;
                i++;
            }
            else{
                n--;
                i++;
            }
        }
        return i;
    }
}
