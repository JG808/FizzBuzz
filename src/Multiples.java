public class Multiples {
    public static void main(String[] args) {
        int k = 0;
        for (Integer i = 1; i < 1000; i++) {
            if (i % 3 == 0){
                k ++;
            } else if (i % 5 ==0) {
                k ++;
            }
        }System.out.println(k);
    }
}