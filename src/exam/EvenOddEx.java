package exam;
public class EvenOddEx {
    public static void main(String[] args) {
        //정수 x 가 주어지면 x 가 짝수이면 "짝수"를, x 가 홀수이면 "홀수"를 출력하는 프로그램을 작성하자
        //삼항 연산자를 사용해야 한다.
        int x = 3412;
        System.out.println("x: "+x);
        System.out.println("출력: x = "+x+", "+(x%2==0?"짝수":"홀수"));
    }
}
