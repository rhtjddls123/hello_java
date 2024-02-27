package exam;
import java.util.Scanner;
public class ArrayEx6 {
    public static void main(String[] args) {
        //사용자로부터 n개의 정수를 입력받아 배열에 저장한 후, 배열 내에서 가장 작은 수와 가장 큰 수를 찾아 출력하는 프로그램을 작성하자
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int[] arr = new int[count];
        for(int i=0; i<count; i++){
            arr[i] = scan.nextInt();
        }
        if(count>0){
            int min = arr[0];
            int max = arr[0];
            for(int i : arr){
                if(min>i) min = i;
                if(max<i) max = i;
            }
            System.out.println(min+" "+max);
        }
    }
}
