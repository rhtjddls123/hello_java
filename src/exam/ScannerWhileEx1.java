package exam;
import java.util.Scanner;
public class ScannerWhileEx1 {
    public static void main(String[] args) {
        //사용자로부터 이름과 나이를 반복해서 입력받고, 입력받은 이름과 나이를 출력하는 프로그램을 작성하세요.
        //사용자가 "종료"를 입력하면 프로그램이 종료되어야 합니다.
        Scanner scan = new Scanner(System.in);
        while(true){
            String name = scan.next();
            if(name.equals("종료")) break;
            int age = scan.nextInt();
            System.out.println(name+" "+age+"세");
        }
    }
}
