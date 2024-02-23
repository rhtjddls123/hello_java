package exam;
import java.util.Scanner;
public class ScannerWhileEx2 {
    public static void main(String[] args) {
        //사용자로부터 상품의 가격( price )과 수량( quantity )을 입력받고, 총 비용을 출력하는 프로그램을 작성하세요.
        //가격과 수량을 입력받은 후에는 이들의 곱을 출력하세요. 출력 형태는 "총 비용: [곱한 결과]"이어야 합니다.
        //-1을 입력하여 가격 입력을 종료합니다.
        Scanner scan = new Scanner(System.in);
        while(true){
            int price = scan.nextInt();
            if(price == -1) break;
            int quantity = scan.nextInt();
            System.out.println("총 비용: "+price*quantity);
        }
    }
}
