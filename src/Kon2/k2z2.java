package Kon2;
import java.util.Scanner;
//Дано целое число, не меньшее 2.
//Выведите его наименьший натуральный делитель, отличный от 1.
public class k2z2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i=2; i<=a; i++){
            if(a%i==0){
                System.out.println(i);
                break;
            }
        }
    }
}
