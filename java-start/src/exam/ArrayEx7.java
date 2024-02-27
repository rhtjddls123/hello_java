package exam;
import java.util.Scanner;
public class ArrayEx7 {
    public static void main(String[] args) {
        //사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균을 계산하는 프로그램을 작성하자.
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[4][3];
        int[] sum = new int[4];
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