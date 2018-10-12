package EthanPersaud;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
            //int n will do an arithmetic sequence with input sum number, and int i will stop the while statement after one cycle
        Scanner sum= new Scanner(System.in);
        System.out.println("Enter a value and we will add all integers from 0-n for u...");
        int sum1=sum.nextInt();
            int n = 0;
            int i = 0;
            while (i < 1) {
                n = (sum1 * (sum1 + 1)) / 2;
                i = 1;
            }
            System.out.println(n);
        }
    }
