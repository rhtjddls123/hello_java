package exam;
import java.util.Scanner;
public class ArrayEx4 {
    public static void main(String[] args) {
        //사용자에게 5개의 정수를 입력받아서 이들 정수의 합계와 평균을 계산하는 프로그램을 작성하자
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            arr[i] = scan.nextInt();
            sum += arr[i];
        }
        System.out.println(sum);
        System.out.println((double)sum/arr.length);
    }
}
