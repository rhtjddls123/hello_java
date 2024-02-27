package exam;
import java.util.Scanner;
public class ArrayEx5 {
    public static void main(String[] args) {
        //이전 문제에서 입력받을 숫자의 개수를 입력받도록 개선하자
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int[] arr = new int[count];
        int sum = 0;

        for(int i=0; i<count; i++){
            arr[i] = scan.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);
        System.out.println((double) sum/count);
    }
}
