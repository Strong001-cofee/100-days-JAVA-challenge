import java.util.Scanner;

public class user_input_sum_product_d3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        int d = a*b;
        System.out.print(c);
        System.out.print(" "+d);
    }
}
