import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args){

            Scanner input = new Scanner(System.in);

            System.out.print("Enter total seconds: ");
            int totalSeconds = input.nextInt();

            int hours = totalSeconds / 3600;
            int minutes = (totalSeconds % 3600) / 60;
            int seconds = totalSeconds % 60;

            System.out.println("Hours = " + hours);
            System.out.println("Minutes = " + minutes);
            System.out.println("Seconds = " + seconds);

        }

    }

