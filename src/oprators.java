public class oprators {
    public static void main(String[] args) {
        int n, sum,first, fourth, fifth, second;
        n = 12345;
        first = n / 10000;
        n = n % 10000;
//        second = n / 10000;
//        n = n % 10000;
        fourth = n / 1000;
        n = n % 1000;
//        fifth = n / 10000;
//        n = n % 10000;

        sum = first + fourth;
        System.out.println("sum = " + sum);
    }

}
