package exam;
import java.util.Scanner;
public class ScannerEx4 {
    public static void main(String[] args) {
        //사용자로부터 하나의 정수 n 을 입력받고, 입력받은 정수 n 의 구구단을 출력하는 프로그램을 작성하세요.
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int j=1; j<10; j++){
            System.out.println(n+" x "+j+" = "+n*j);
        }
    }
}
