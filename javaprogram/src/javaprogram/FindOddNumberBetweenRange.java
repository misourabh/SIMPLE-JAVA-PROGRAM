package javaprogram;

import java.util.Scanner;

class FindOddNumberBetweenRange
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the starting number");
        int start=s.nextInt();
        System.out.println("Enter the end number");
        int end=s.nextInt();
        int count=0;

        for(int i=start ; i<=end; i++)
        {
                if(i%2==1)
            {
                count++;
            }
        }
          System.out.println(count);
    }
}
