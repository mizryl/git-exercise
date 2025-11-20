package src.main;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer();

        Scanner sc = new Scanner(System.in);

        //recieve input from users to get minute and seconds
        System.out.println("Enter Minute(s): ");
        int minute = sc.nextInt();

        System.out.print("Enter seconds(s): ");
        int second = sc.nextInt();

        sc.close();

        //call method from Timer class and set value
        timer.setMinute(minute);
        timer.setSecond(second);

        //timer countdown loop
        while (!timer.isFinished()) {
            System.out.println(timer.getFormatedTime());
            Thread.sleep(1000); //wait 1 second
            timer.updateTimerCountdown();
        }

        System.out.println(timer.getFormatedTime());
        System.out.println("Timer is up! :D");
        

    }
}
