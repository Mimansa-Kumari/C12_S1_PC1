package org.example;

import java.util.Scanner;

public class Fibonacci {

    public int fibonacci(int num)
    {
        if(num==0)
        {
            return 0;
        }
        else if(num==1)
        {
            return 1;
        }
        else
        {
            return (fibonacci(num-1)+fibonacci(num-2));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the last range till you want the Fibonacci Numbers : ");
        int num = scanner.nextInt();
        Fibonacci fib = new Fibonacci();
        for (int i = 0; i<num; i++)
        {
            System.out.print(fib.fibonacci(i)+"\t");
        }
    }
}
