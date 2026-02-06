import java.util.Scanner;
public class Exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int num = Math.abs(number);
        int sum = 0;
        int product = 1;
        int count = 0;

        if (num == 0) {
            sum = 0;
            product = 0;
            count = 1;
        }

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            count++;
            num /= 10;
        }

        double average = (double) (sum / count);

        System.out.println("digits sum = " + sum);
        System.out.println("digits product = " + product);
        System.out.println("digits average = " + average);

    }
}

