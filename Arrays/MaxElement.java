import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {-12,-58,-96,-1,-966};


        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(max < arr[i])
                max = arr[i];
        }

        System.out.println("Maximum  Element : "+max);

        sc.close();
    }
}
