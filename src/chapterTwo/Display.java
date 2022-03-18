package chapterTwo;

import org.testng.annotations.Test;

import java.beans.Transient;
import java.util.Scanner;

public class Display {
    public static void main(String[] args){
        System.out.print("Enter an integer: " );
        Scanner input= new Scanner(System.in);
        double integer= input.nextDouble();
    }

}
