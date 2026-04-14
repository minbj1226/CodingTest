import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == 0 && b == 0 && c == 0) break;
            int[] arr = {a, b, c};
            Arrays.sort(arr);

           if((arr[2] * arr[2] == (arr[0] * arr[0])+(arr[1] * arr[1]))) {
            System.out.println("right");
           } else {
            System.out.println("wrong");
           }

        }
    }
}
