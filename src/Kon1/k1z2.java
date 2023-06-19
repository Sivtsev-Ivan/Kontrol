package Kon1;
import java.util.Scanner;
//Напишите рекурсивный метод sum(a, b),
//возвращающую сумму двух целых неотрицательных чисел.
//Из всех арифметических операций допускаются только +1 и -1.
//Также нельзя использовать циклы.
public class k1z2 {
    public static int sum(int a, int b){
        if (b>0) {
            a = a + 1;
            b = b - 1;
            return sum(a,b);
        }
        else{
            return a;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("a= ");
        int a=sc.nextInt();
        System.out.println("b= ");
        int b=sc.nextInt();
        System.out.println(sum(a,b));
    }
}
