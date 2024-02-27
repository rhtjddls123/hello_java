package exam;

public class MethodEx2 {
    public static void main(String[] args) {
//        다음은 특정 숫자만큼 같은 메시지를 반복 출력하는 기능이다.
//        메서드를 사용해서 리펙토링해보자.
//        String message = "Hello, world!";
//        for (int i = 0; i < 3; i++) {
//            System.out.println(message);
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println(message);
//        }
//        for (int i = 0; i < 7; i++) {
//            System.out.println(message);
//        }
        print("Hello, world!", 3);
        print("Hello, world!", 5);
        print("Hello, world!", 7);
    }
    public static void print(String msg, int count){
        for(int i=0; i<count; i++){
            System.out.println(msg);
        }
    }
}
