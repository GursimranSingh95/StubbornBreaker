import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter Number to print Prime up to that number");
        num = in.nextInt();
        int i = 0;
        int j = 0;
        for (i = 2; i <= num - 1;i++)
        {
            if (num % i == 0) {
                System.out.print("Number is not prime");
                j = -1;
            }
        }
        if (j != -1) {
            for (i = 2; i <= num - 1;i++)
            {
                if (num % i != 0) {
                    System.out.print("\t" + i);
                }

            }
        }
    }
}
