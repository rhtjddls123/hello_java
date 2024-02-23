package exam;
import java.util.Scanner;

public class ArrEx8 {
    public static void main(String[] args) {
        //이전 문제에서 학생수를 입력받도록 개선하자
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int[][] arr = new int[count][3];
        int[] sum = new int[count];
        for(int i=0; i<arr.length; i++){
            System.out.println(i+1+"번 학생의 성적을 입력하세요");
            for(int j=0; j<arr[i].length; j++){
                if(j==0) System.out.print("국어 점수: ");
                else if(j==1) System.out.print("수학 점수: ");
                else if(j==2) System.out.print("영어 점수: ");
                arr[i][j] = scan.nextInt();
                sum[i]+=arr[i][j];
            }
        }
        for(int i=0; i<sum.length; i++){
            System.out.println(i+1+"번 학생의 총점: "+sum[i]+", 평균: "+(double)sum[i]/3);
        }
    }
}
