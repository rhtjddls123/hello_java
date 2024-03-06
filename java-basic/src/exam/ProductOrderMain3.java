package exam;
import java.util.Scanner;
public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int count = scan.nextInt();
        scan.nextLine();

        ProductOrder[] orders = new ProductOrder[count];
        for(int i=0; i<count; i+=1){
            System.out.println(i+1+"번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = scan.next();
            System.out.print("가격: ");
            int price = scan.nextInt();
            System.out.print("수량: ");
            int quantity = scan.nextInt();
            orders[i] = createOrder(productName, price, quantity);
        }

        printOrders(orders);
        int sum = getTotalAmount(orders);
        System.out.println("총 결제 금액: "+sum);
    }
    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder newOrder = new ProductOrder();
        newOrder.productName = productName;
        newOrder.price = price;
        newOrder.quantity = quantity;

        return newOrder;
    }
    static void printOrders(ProductOrder[] orders){
        for(ProductOrder order : orders){
            System.out.println("상품명 "+order.productName+", 가격: "+order.price+", 수량: "+order.quantity);
        }
    }
    static int getTotalAmount(ProductOrder[] orders){
        int sum = 0;
        for(ProductOrder order : orders){
            sum += order.price * order.quantity;
        }
        return sum;
    }
}
