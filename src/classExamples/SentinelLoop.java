package classExamples;

import java.security.SecureRandom;
import java.util.Scanner;

public class SentinelLoop {
    public static void main(String... args){
//        int count = 0;
//        for(;;count++){
//            System.out.println("AsherFlo");
//            if(count>=4){
//            break;
//            }
//        }
//        int count = 0;
//        SecureRandom random = new SecureRandom();
//        for(;count<=4;){
//            System.out.println("AsherFlo");
//            count = random.nextInt(7);
//        }
//        int count = 0;
//        SecureRandom random = new SecureRandom();
//        for(;count<=4;){
//            System.out.println("AsherFlo");
//            count = random.nextInt(7);
//            System.out.println("Count is "+count);
//        }
        int count = 0;
        SecureRandom random = new SecureRandom();
        Scanner scanner = new Scanner(System.in);
        for(;count<=100;){
            System.out.println("Enter a score or enter anything more than 100 to exit");
            count = scanner.nextInt();
            if(count>100){
                System.out.println("Invalid score");
                break;
            }
            System.out.println("collected");
        }

    }
}
