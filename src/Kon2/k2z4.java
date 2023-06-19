package Kon2;
import java.util.Scanner;
//Напишите программу, вычисляющую факториал числа через рекурсию
public class k2z4 {
    public static int fact(int n){
        int res;
        if (n==1){
            return 1;
        }
        else {
            res=fact(n-1)*n;
            return res;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("n= ");
        int n = sc.nextInt();
        System.out.println("Factorial = " + fact(n));
    }
}
