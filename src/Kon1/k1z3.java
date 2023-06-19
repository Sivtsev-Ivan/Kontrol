package Kon1;
import java.util.Scanner;
//Дана последовательность чисел, завершающаяся числом 0.
//Вводится последовательность целых чисел, оканчивающаяся числом 0
//(само число 0 в последовательность не входит, а служит как признак ее окончания).
//Выведите сумму последовательности.
public class k1z3 {
    public static int sum(int a, int b){
        Scanner sc=new Scanner(System.in);
        if (b>0){
            a = a + b;
            b=sc.nextInt();
            return sum(a,b);
        }
        else{
            return a;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println(sum(a,b));
    }
}
