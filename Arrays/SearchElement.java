import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {41,56,152,96,47,58,14,78,963,145,555,12596};

        System.out.print("Search a Element: ");
        int num = sc.nextInt();

        boolean flag = false;

        for(int i=0;i<arr.length;i++){
            if(num == arr[i]){
                flag = true;
                System.out.print(num+" found at index: "+i);
                break;
            }
        }

        if(!flag){
            System.out.print("Not Found !!!");
        }

        sc.close();
    }
}
