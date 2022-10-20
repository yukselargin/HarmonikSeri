import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        double total=0;
        Scanner input= new Scanner(System.in);

        System.out.print("N sayısını giriniz: ");
        n= input.nextInt();

        for(int i=1; i<=n; i++){
            total += (1.0/i);
        }
        System.out.print(+total);
    }
}