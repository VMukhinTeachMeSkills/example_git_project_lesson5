package lesson2;

import java.util.Scanner;

public class Homework1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0)
        {
            System.out.println("Четное 1");
        }
        else
        {
            System.out.println("Нечетное 1");
        }
    }
}
