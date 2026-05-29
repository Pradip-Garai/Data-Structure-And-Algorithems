import java.util.Scanner;

public class SumOfArrayElements {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] arr = {12,12,10,50};

        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        System.out.println("Sum of Array Elements : "+sum);

        sc.close();
    }
}
