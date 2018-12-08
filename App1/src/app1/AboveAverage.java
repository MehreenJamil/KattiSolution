import java.util.Scanner;

/**
 *
 * @author izharishaksa
 */
public class AboveAverage {

    //public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int total = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                total += arr[i];
            }
            double avg = total * 1.0 / N;
            int count = 0;
            for (int i = 0; i < N; i++) {
                count += arr[i] > avg ? 1 : 0;
            }
            System.out.printf("%.3f%%\n", (count * 100.0 / N));
        }
    }

}