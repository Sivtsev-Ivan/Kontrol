package Kon2;
import java.util.Scanner;
//Напишите метод, вычисляющий длину отрезка по координатам его концов.
//С помощью этого метода напишите программу,
//вычисляющую периметр треугольника по координатам трех его вершин.
public class k2z3 {
    public static double dis(int x1, int y1, int x2, int y2){
        Scanner sc=new Scanner(System.in);

        int sumx;
        int sumy;

        if (x1>x2) {sumx = x1-x2;}
        else {sumx = x2-x1;}
        if (y1>y2) {sumy = y1-y2;}
        else {sumy = y2-y1;}

        Double Gip = Math.sqrt((sumx*sumx)+(sumy*sumy));
        return Gip;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("x1 = ");
        int x1 = sc.nextInt();
        System.out.println("y1 = ");
        int y1 = sc.nextInt();
        System.out.println("x2 = ");
        int x2 = sc.nextInt();
        System.out.println("y2 = ");
        int y2 = sc.nextInt();
        System.out.println("x3 = ");
        int x3 = sc.nextInt();
        System.out.println("y3 = ");
        int y3 = sc.nextInt();

        double A = dis(x1,y1,x2,y2);
        double B = dis(x2,y2,x3,y3);
        double C = dis(x3,y3,x1,y1);

        double P = A+B+C;
        System.out.println("Perimetr = " + P);
    }
}
