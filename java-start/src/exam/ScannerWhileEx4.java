package exam;
import java.util.Scanner;
public class ScannerWhileEx4 {
    public static void main(String[] args) {
        //사용자로부터 상품 정보(상품명, 가격, 수량)를 입력받고, 이들의 총 가격을 출력하는 프로그램을 작성하세요.
        //사용자는 여러 상품을 추가하고 결제할 수 있으며, 프로그램을 언제든지 종료할 수 있습니다.
        //사용자에게 다음 세 가지 옵션을 제공해야 합니다: 1: 상품 입력, 2: 결제, 3: 프로그램 종료. 옵션은 정수로
        //입력받으며, 옵션을 저장하는 변수의 이름은 option 이어야 합니다.
        //상품 입력 옵션을 선택하면, 사용자에게 상품명과 가격, 수량을 입력받으세요.
        //결제 옵션을 선택하면, 총 비용을 출력하고 총 비용을 0 으로 초기화하세요. (사용자가 총 비용을 확인하고,
        //결제를 완료했다고 가정합니다. 따라서 다음 사용자를 위해 총 비용을 다시 0 으로 초기화 해야합니다.)
        //프로그램 종료 옵션을 선택하면, "프로그램을 종료합니다."라는 메시지를 출력하고 프로그램을 종료하세요.
        //위의 세 가지 옵션 외에 다른 값을 입력하면, "올바른 옵션을 선택해주세요."라는 메시지를 출력하세요.
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = scan.nextInt();
            if(option==3) break;

            switch (option){
                case 1:
                    String name = scan.next();
                    int price = scan.nextInt();
                    int quantity = scan.nextInt();
                    sum += price*quantity;
                    System.out.println("상품명:"+name+" 가격:"+price+" 수량:"+quantity+" 합계:"+price*quantity);
                    break;
                case 2:
                    System.out.println("총비용: "+sum);
            }
        }
    }
}
