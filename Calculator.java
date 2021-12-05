package com.bridgelabz.practice;

import java.util.Scanner; //import Scanner Class

public class Calculator
{
    public int additionOfTwoNum(int a, int b) // Addtion Function
    {
        return a+b;
    }
    public int substractionOfTwoNum(int a,int b) //Substraction Fuction
    {
        return a-b;
    }
    public int multiplicationOfTwoNum(int a,int b) //Multiplication Function
    {
        return a*b;
    }
    public int divisionOfTwoNum(int a,int b) //Division Function
    {
        return a/b;
    }
    public static void main(String[] args) //main Function
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter The First Number = ");
        a= sc.nextInt();
        System.out.println("Enter The Second Number = ");
        b= sc.nextInt();

        Calculator c = new Calculator();
        System.out.println("Addtion = "+c.additionOfTwoNum(a,b));
        System.out.println("Substraction = "+c.substractionOfTwoNum(a,b));
        System.out.println("Multiplication = "+c.multiplicationOfTwoNum(a,b));
        System.out.println("Division = "+c.divisionOfTwoNum(a,b));
    }
}
