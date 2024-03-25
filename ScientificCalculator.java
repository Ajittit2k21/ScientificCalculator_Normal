/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectGameProgram;

import java.util.Scanner;

/**
 *
 * @author MSI pc
 */
public class ScientificCalculator 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        final float PI = 3.14159265f;

        System.out.println("\n\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t|       Scientific Calculator by Deep        |");
        System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");

        System.out.println("\t--|Choose any given key to perform calculation|-- \n");
        System.out.println("\t_______________________________________________\n");
        System.out.println("\t|1:|  Addition\t\t|12:| Sin");
        System.out.println("\t|2:|  Subtraction\t|13:| Cos");
        System.out.println("\t|3:|  Multiplication\t|14:| Tan");
        System.out.println("\t|4:|  Division\t\t|15:| Inverse of Sin");
        System.out.println("\t|5:|  Exponent\t\t|16:| Inverse of Cos");
        System.out.println("\t|6:|  Square\t\t|17:| Inverse of Tan");
        System.out.println("\t|7:|  Cube\t\t|18:| Modules");
        System.out.println("\t|8:|  Square root\t|19:| Remainder");
        System.out.println("\t|9:|  Ceil\t\t|20:| Dim");
        System.out.println("\t|10:| Log\t\t\t|21:| Round");
        System.out.println("\t|11:| Base Log\t\t|00:| Exit");
        System.out.println("\t_______________________________________________\n");

        System.out.println("Enter Number1:");
        a = scanner.nextDouble();
        System.out.println("Choose a key:");
        int k = scanner.nextInt();

        while (k != 00) {
            switch (k) {
                case 1:
                    System.out.println("Enter Number2:");
                    b = scanner.nextDouble();
                    System.out.println("Answer is: " + (a + b));
                    break;
                case 2:
                    System.out.println("Enter Number2:");
                    b = scanner.nextDouble();
                    System.out.println("Answer is: " + (a - b));
                    break;
                case 3:
                    System.out.println("Enter Number2:");
                    b = scanner.nextDouble();
                    System.out.println("Answer is: " + (a * b));
                    break;
                case 4:
                    System.out.println("Enter Number2:");
                    b = scanner.nextDouble();
                    System.out.println("Answer is: " + (a / b));
                    break;
                case 5:
                    System.out.println("Enter Number2:");
                    b = scanner.nextDouble();
                    System.out.println("Answer is: " + Math.pow(a, b));
                    break;
                case 6:
                    System.out.println("Answer is: " + (a * a));
                    break;
                case 7:
                    System.out.println("Answer is: " + (a * a * a));
                    break;
                case 8:
                    System.out.println("Answer is: " + Math.sqrt(a));
                    break;
                case 9:
                    System.out.println("Answer is: " + Math.ceil(a));
                    break;
                case 10:
                    System.out.println("Answer is: " + Math.log10(a));
                    break;
                case 11:
                    System.out.println("Answer is: " + Math.log(a));
                    break;
                case 12:
                    System.out.println("Answer is: " + Math.sin(a * PI / 180.0));
                    break;
                case 13:
                    System.out.println("Answer is: " + Math.cos(a * PI / 180.0));
                    break;
                case 14:
                    System.out.println("Answer is: " + Math.tan(a * PI / 180.0));
                    break;
                case 15:
                    System.out.println("Answer is: " + Math.asin(a) * 180.0 / PI);
                    break;
                case 16:
                    System.out.println("Answer is: " + Math.acos(a) * 180.0 / PI);
                    break;
                case 17:
                    System.out.println("Answer is: " + Math.atan(a) * 180.0 / PI);
                    break;
                case 18:
                    System.out.println("Enter Number2:");
                    b = scanner.nextDouble();
                    System.out.println("Answer is: " + Math.IEEEremainder(a, b));
                    break;
                case 19:
                    System.out.println("Enter Number2:");
                    b = scanner.nextDouble();
                    System.out.println("Answer is: " + Math.IEEEremainder(a, b));
                    break;
                case 20:
                    System.out.println("Enter Number2:");
                    b = scanner.nextDouble();
                    System.out.println("Answer is: " + Math.ulp(a));
                    break;
                case 21:
                    System.out.println("Answer is: " + Math.round(a));
                    break;
                case 00:
                    break;
                default:
                    System.out.println("Error Wrong Input");
                    break;
            }
            System.out.println("\t--!Thank's for using me!--");
            System.out.println();
            break;
        }
    }
}