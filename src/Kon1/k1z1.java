package Kon1;

import java.util.Scanner;

//Даны четыре действительных числа: x1, y1, x2, y2.
//Напишите метод distance(x1, y1, x2, y2), вычисляющую расстояние между точкой (x1,y1) и (x2,y2).
//Считайте четыре действительных числа и выведите результат работы этой функции.

public class k1z1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("KoopDuHaTbl nepBou To4ku: ");
        System.out.println("x1 = ");
        int x1 = sc.nextInt();
        System.out.println("y1 = ");
        int y1 = sc.nextInt();

        System.out.println("KoopDuHaTbl BTopou To4ku: ");
        System.out.println("x2 = ");
        int x2 = sc.nextInt();
        System.out.println("y2 = ");
        int y2 = sc.nextInt();

        int sumx;
        int sumy;

        if (x1>x2) {sumx = x1-x2;}
        else {sumx = x2-x1;}
        if (y1>y2) {sumy = y1-y2;}
        else {sumy = y2-y1;}

        Double Gip = Math.sqrt((sumx*sumx)+(sumy*sumy));

        System.out.println("Distance = " + Gip);
    }
}
