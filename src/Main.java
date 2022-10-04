import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        int count, i;
        float sum = 0, mean;
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Enter Number of Elements");
        count = scanner.nextInt();

        System.out.println("Enter " + count + " Elements");
        for (i = 0; i < count; i++) {
            sum += scanner.nextInt();
        }
        // Mean or Average = Sum/Count
        mean = sum / count;

        System.out.println("Mean : " + mean);
    }
}
