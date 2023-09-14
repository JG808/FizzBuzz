public class Reduce {
    public static void main(String[] args) {
        int n = 90;
        int k = 0;
        while (n > 0) {
            k++;
            if (n % 2 == 0){
                n = n / 2;
            } else n--;
        }
        System.out.println(k);
    }
}
