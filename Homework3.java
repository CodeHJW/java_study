import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args){

        int count = 0;
        int max = 0;
        int min = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        count = sc.nextInt();

        int[] nums = new int[count];

        System.out.print("수를 입력하세요: ");
        for(int i = 0 ; i < count ; i++){
            nums[i] = sc.nextInt();
        }

        max = nums[0];
        min = nums[0];

        for(int i = 0 ; i< count; i++){
            if(max < nums[i])
                max = nums[i];
            if(min > nums[i])
                min = nums[i];
        }

        System.out.println("최대값: "+max);
        System.out.println("최소값: "+min);
    }
}
