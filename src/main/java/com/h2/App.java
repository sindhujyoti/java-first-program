package com.h2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static int doubleTheNumber(int number) {
        int doubleNumber=2*number;
        return doubleNumber;
    }
    private static int add(int[] numbers){
        int sum=0;
        for (int number :numbers) {
            sum+=number;
        }
        return sum;
    }
}
