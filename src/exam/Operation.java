package exam;

public class Operation {
    public static void main(String[] args) {
        //다음과 같은 작업을 수행하는 프로그램을 작성하세요

        //1. num1 , num2 , num3 라는 이름의 세 개의 int 변수를 선언하고, 각각 10, 20, 30으로 초기화하세요.
        //2. 세 변수의 합을 계산하고, 그 결과를 sum 이라는 이름의 int 변수에 저장하세요.
        //3. 세 변수의 평균을 계산하고, 그 결과를 average 라는 이름의 int 변수에 저장하세요. 평균 계산 시 소수점 이하의 결과는 버림하세요.
        //4. sum 과 average 변수의 값을 출력하세요.
        int num1 = 10, num2 = 20, num3 = 30;
        int sum = num1 + num2 + num3;
        int avg = sum / 3;
        System.out.println(sum+" "+avg);

        // 다음 double 변수들을 선언하고 그 합과 평균을 출력하는 프로그램을 작성하세요.
        double val1 = 1.5;
        double val2 = 2.5;
        double val3 = 3.5;
        double sum2 = val1 + val2 + val3;
        double avg2 = sum2 / 3;
        System.out.println(sum2 + " " + avg2);

        //int 형 변수 score 를 선언하세요.
        //score 가 80점 이상이고, 100점 이하이면 true 를 출력하고, 아니면 false 를 출력하세요.
        int score = 80;
        System.out.println(score>=80&&score<=100);
    }
}
