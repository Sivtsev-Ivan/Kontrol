package Kon2;
import java.util.Scanner;
//Дано натуральное число.
//Требуется определить, является ли год с данным номером високосным.
//Если год является високосным, то выведите YES, иначе выведите NO.
//Напомним, что в соответствии с григорианским календарем,
//год является високосным, если его номер кратен 4,
//но не кратен 100, а также если он кратен 400.
public class k2z1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("year = ");
        int y = sc.nextInt();

        if (y%400==0) {
            System.out.println("YES");
        }
        else{
            if (y%100!=0){
                if (y%4==0){
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
