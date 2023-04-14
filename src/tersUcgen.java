import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("basamak sayisini giriniz:");
        int n = input.nextInt();

        for(int i =1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=(2*(n-i));k>=0;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}